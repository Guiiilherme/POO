package com.constutores;

public class Cliente {

	private int id;
	private String nome;
	private String email;
	
	//metodos de acesso get set ...
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}	

	/*
	 * Smpre publico Sempre com o mesmo nome da classe Nao tipo tem de retorno ou
	 * seja NAO E VOID OU QUALQUER OU TIPO
	 */
	public Cliente(int id, String nome, String email) {
this.id = id;
this.nome = nome;
this.email = email;
	}

	
	public Cliente() {}
	public String cadastrar() {
		return "Cadastro realizado";

	}

	public String nomePorId(int id) {

		String msg = "";
		if (id == id) {
			msg = this.nome;

		} else {
			msg = "N�o localizado";

		}
		return msg;

	}
}
