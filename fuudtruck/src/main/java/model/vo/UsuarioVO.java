package model.vo;

import java.time.LocalDateTime;

public class UsuarioVO {
	
	private int idusuario;
	private TipoUsuarioVO tipoUsuario;
	private String nome;
	private String cpg;
	private String email;
	private String telefone;
	private LocalDateTime dataCadastro;
	private LocalDateTime dataExpiracao;
	private String login;
	private String senha;
	public UsuarioVO(int idusuario, TipoUsuarioVO tipoUsuario, String nome, String cpg, String email, String telefone,
			LocalDateTime dataCadastro, LocalDateTime dataExpiracao, String login, String senha) {
		super();
		this.idusuario = idusuario;
		this.tipoUsuario = tipoUsuario;
		this.nome = nome;
		this.cpg = cpg;
		this.email = email;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
		this.dataExpiracao = dataExpiracao;
		this.login = login;
		this.senha = senha;
	}
	public UsuarioVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public TipoUsuarioVO getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuarioVO tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpg() {
		return cpg;
	}
	public void setCpg(String cpg) {
		this.cpg = cpg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDateTime getDataExpiracao() {
		return dataExpiracao;
	}
	public void setDataExpiracao(LocalDateTime dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
