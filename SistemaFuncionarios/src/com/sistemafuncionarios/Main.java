package com.sistemafuncionarios;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        SistemaFuncionarios sistema = new SistemaFuncionarios();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Buscar e exibir funcionário");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Nome: ");
                String nome = scanner.nextLine();

                System.out.println("ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Telefone: ");
                String telefone = scanner.nextLine();

                System.out.println("Email: ");
                String email = scanner.nextLine();

                System.out.println("Alergias: ");
                String alergias = scanner.nextLine();

                System.out.println("Problemas Médicos: ");
                String problemasMedicos = scanner.nextLine();

                Funcionario novoFuncionario = new Funcionario(nome, id, telefone, email, alergias, problemasMedicos);
                sistema.adicionarFuncionario(novoFuncionario);
                System.out.println("Funcionário adicionado com sucesso!");

            } else if (opcao == 2) {
                System.out.println("Digite o ID do funcionário: ");
                int id = scanner.nextInt();
                sistema.exibirFuncionario(id);

            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
