package org.conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem-vindo a interface de criação de conta. \n\nPor favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("\nPor favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nPor favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("\nPor favor, digite o seu saldo:");
        BigDecimal saldo = scanner.nextBigDecimal();

        scanner.close();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        System.out.println(contaTerminal.mensagemCriacao());
    }

    private final int numero;
    private final String agencia;
    private final String nomeCliente;
    private final BigDecimal saldo;

    ContaTerminal(int numero, String agencia, String nomeCliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String mensagemCriacao() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo de R$%s já está disponível para saque!", nomeCliente, agencia, numero, saldo);
    }
}