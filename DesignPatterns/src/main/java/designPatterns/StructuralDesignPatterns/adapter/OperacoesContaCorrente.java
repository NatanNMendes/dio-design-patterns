package designPatterns.StructuralDesignPatterns.adapter;

import java.math.BigDecimal;

public class OperacoesContaCorrente {

    private BigDecimal saldo;

    // Construtor inicializa o saldo com zero
    public OperacoesContaCorrente() {
        this.saldo = BigDecimal.ZERO;
    }

    // Método para consultar o saldo atual
    public BigDecimal consultarSaldo() {
        return saldo;
    }

    // Método para realizar um depósito
    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que zero");
        }
        saldo = saldo.add(valor);
        System.out.println("Depósito de " + valor + " realizado com sucesso");
    }

    // Método para realizar um saque
    public void sacar(BigDecimal valor) throws SaldoInsuficienteException {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero");
        }
        if (valor.compareTo(saldo) > 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }

        // Verifica se o saldo após o saque não será negativo
        BigDecimal novoSaldo = saldo.subtract(valor);
        if (novoSaldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque");
        }

        saldo = novoSaldo;
        System.out.println("Saque de " + valor + " realizado com sucesso");
    }
}
