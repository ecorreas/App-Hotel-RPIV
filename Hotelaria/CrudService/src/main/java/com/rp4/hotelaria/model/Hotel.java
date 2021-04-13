package com.rp4.hotelaria.model;

import javax.persistence.*;

@Entity

public class Hotel {

	@Id
	@Column(name = "id_hotel")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel;

	@Column(name = "numero_quarto")
	private Long numeroQuarto;

	@Column(name = "cod_endereco")
	private String codEndereco;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "status")
	private String status;

	@Column(name = "preco")
	private double preco;

	public Hotel() {

	}

	public Hotel(Long idHotel, Long numeroQuarto, String codEndereco, String cidade, String descricao, String endereco,
			String status, double preco) {
		this.idHotel = idHotel;
		this.numeroQuarto = numeroQuarto;
		this.codEndereco = codEndereco;
		this.cidade = cidade;
		this.descricao = descricao;
		this.endereco = endereco;
		this.status = status;
		this.preco = preco;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public Long getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Long numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public String getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(String codEndereco) {
		this.codEndereco = codEndereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
