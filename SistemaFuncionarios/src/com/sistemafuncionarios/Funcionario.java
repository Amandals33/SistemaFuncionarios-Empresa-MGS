package com.sistemafuncionarios;
import java.util.Scanner;

public class Funcionario {
	public static void main(String[] args) {}
	private String nome;
    private int id;
    private String telefone;
    private String email;
    private String alergias;
    private String problemasMedicos;

    public Funcionario(String nome, int id, String telefone, String email, String alergias, String problemasMedicos) {
        this.nome = nome;
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }

    public String getProblemasMedicos() { return problemasMedicos; }
    public void setProblemasMedicos(String problemasMedicos) { this.problemasMedicos = problemasMedicos; }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Alergias: " + alergias);
        System.out.println("Problemas Médicos: " + problemasMedicos);
    }
}
