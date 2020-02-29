package com.guisi.poc.model;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Entity
@Table
public class Carregamento {

	@Id
	@Column(name = "ID_CARREGAMENTO")
	private Integer idCarregamento;

	@NotNull(message = "O campo data carregamento não deve ser nulo.")
	@Column(name = "DATA_CARREGAMENTO")
	private Instant dataCarregamento;

	@NotNull(message = "O campo idCausa não deve ser nulo.")
	@Column(name = "ID_CAUSA")
	private Integer idCausa;

	@Size(max = 256, message = "O campo nome causa não pode ser maior que 256 caracteres.")
	@NotEmpty(message = "O campo nome causa não deve ser nulo.")
	@Column(name = "NOME_CAUSA")
	private String nomeCausa;

	@NotNull(message = "O campo indenização evitada não deve ser nulo.")
	@Digits(integer = 17, fraction = 2)
	@Column(name = "INDENIZACAO_EVITADAS")
	private BigDecimal indenizacaoEvitadas;

	public Integer getIdCarregamento() {
		return idCarregamento;
	}

	public void setIdCarregamento(Integer idCarregamento) {
		this.idCarregamento = idCarregamento;
	}

	public Instant getDataCarregamento() {
		return dataCarregamento;
	}

	public void setDataCarregamento(Instant dataCarregamento) {
		this.dataCarregamento = dataCarregamento;
	}

	public Integer getIdCausa() {
		return idCausa;
	}

	public void setIdCausa(Integer idCausa) {
		this.idCausa = idCausa;
	}

	public String getNomeCausa() {
		return nomeCausa;
	}

	public void setNomeCausa(String nomeCausa) {
		this.nomeCausa = nomeCausa;
	}

	public BigDecimal getIndenizacaoEvitadas() {
		return indenizacaoEvitadas;
	}

	public void setIndenizacaoEvitadas(BigDecimal indenizacaoEvitadas) {
		this.indenizacaoEvitadas = indenizacaoEvitadas;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(idCarregamento).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		Carregamento other = (Carregamento) obj;
		return new EqualsBuilder().append(idCarregamento, other.idCarregamento).isEquals();
	}

}
