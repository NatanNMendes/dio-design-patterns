package designPatterns.StructuralDesignPatterns.adapter;

import java.math.BigDecimal;

public class ClientJarOperacoesContaCorrente {

    public static void main(String[] args) {
        JarOperacoesContaCorrente operacoes = new JarOperacoesContaCorrente();

        // Exemplo de utilização
        BigDecimal valorDeposito = new BigDecimal("1500.00");
        BigDecimal valorSaque1 = new BigDecimal("500.00");
        BigDecimal valorSaque2 = new BigDecimal("2000.00"); // Este saque deve falhar

        try {
            // Realiza o depósito inicial
            operacoes.depositar(valorDeposito);
            System.out.println("Saldo atual da conta: " + operacoes.consultarSaldo());

            // Realiza um saque válido
            operacoes.sacar(valorSaque1);
            System.out.println("Saldo atual da conta após saque: " + operacoes.consultarSaldo());

            // Tenta realizar um saque inválido
            operacoes.sacar(valorSaque2); // Deve lançar uma exceção
            System.out.println("Saldo atual da conta após segundo saque: " + operacoes.consultarSaldo());

        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro ao sacar: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

