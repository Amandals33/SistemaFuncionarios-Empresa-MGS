package com.sistemafuncionarios;

import java.util.ArrayList;
import java.util.List;

public class SistemaFuncionarios {
	private List<Funcionario> funcionarios;

    public SistemaFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario buscarFuncionario(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public void exibirFuncionario(int id) {
        Funcionario funcionario = buscarFuncionario(id);
        if (funcionario != null) {
            funcionario.exibirInformacoes();
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }
    }
}