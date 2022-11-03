package model.vo;

import java.time.LocalDateTime;

public class ProdutoVO {
	
	private int idproduto;
	private TipoProdutoVO tipoProduto;
	private String nome;
	private double preco;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataExclusao;
	
	public ProdutoVO(int idproduto, TipoProdutoVO tipoProduto, String nome, double preco, LocalDateTime dataCadastro,
			LocalDateTime dataExclusao) {
		super();
		this.idproduto = idproduto;
		this.tipoProduto = tipoProduto;
		this.nome = nome;
		this.preco = preco;
		this.dataCadastro = dataCadastro;
		this.dataExclusao = dataExclusao;
	}
	
	public ProdutoVO() {
		super();
	}
	
	public int getIdproduto() {
		return idproduto;
	}
	public void setIdproduto(int idproduto) {
		this.idproduto = idproduto;
	}
	public TipoProdutoVO getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(TipoProdutoVO tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDateTime getDataExclusao() {
		return dataExclusao;
	}
	public void setDataExclusao(LocalDateTime dataExclusao) {
		this.dataExclusao = dataExclusao;
	}
	
}
