package com.generation.plantanamesa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String descricao;

	//@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String nome;
	
////	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias" , cascade = CascadeType.REMOVE)
////	@JsonIgnoreProperties("categorias")
////	
	//private List<Produto> produto;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public List<Produto> getProduto() {
//		return produto;
//	}
//
//	public void setProduto(List<Produto> produto) {
//		this.produto = produto;
//	}

}