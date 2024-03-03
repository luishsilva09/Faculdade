package com;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Conta contaUsuario = new Conta();
        contaUsuario.titular = new Titular();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        contaUsuario.titular.setNome(entrada.nextLine());

        System.out.println("Digite seu sobrenome: ");
        contaUsuario.titular.setSobrenome(entrada.nextLine());

        System.out.println("Digite seu CPF: ");
        contaUsuario.titular.setCpf(entrada.nextLine());

        
        boolean permanecer = false;
        while(!permanecer){
            System.out.println("Escolha uma opcao: \n 1 - depositar \n 2 - sacar \n 3 - consultar saldo \n 4 - sair");
            Scanner opcao = new Scanner(System.in);
            int escolha = opcao.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Deposito:");
                    System.out.println("valor a ser depositado: ");
                    int valorDepositar = opcao.nextInt();
                    contaUsuario.depositar(valorDepositar);
                    System.out.println("valor total saldo atual:" + contaUsuario.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Sacar:");
                    System.out.println("valor a ser sacar: ");
                    int valorSacar = opcao.nextInt();
                    boolean feito = contaUsuario.sacar(valorSacar);
                    if(!feito)System.out.println("Saldo insuficiente");
                    System.out.println("valor total saldo atual:" + contaUsuario.consultarSaldo());
                    break;
                case 3:
                    System.out.println("Consultar saldo:");
                    System.out.println(contaUsuario.consultarSaldo());
                    break;
                case 4:
                    permanecer = true;
                    System.out.println("Saindo, volte sempre");
                    break;
                default:
                    break;
            }
        }
    }
}

/**
 * Titular
 *
 */
class Titular {
    String nome;
    String sobrenome;
    String cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
/**
 * Conta
 *
 */
class Conta{
    double saldo;
	int agencia;
	int numero;
	Titular titular;

    public double consultarSaldo(){
       return this.saldo;
    }
    public void depositar(int value){
		this.saldo += value;
		System.out.println(saldo);
	}
	public boolean sacar(int value) {
		if (this.saldo >= value) {
			this.saldo -= value;
			return true;
		}else {
			return false;
		}}
}