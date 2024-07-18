package designPatterns.StructuralDesignPatterns.adapter;

import java.math.BigDecimal;

public class JarOperacoesContaCorrente {

    private OperacoesContaCorrente operacoesConta;

    public JarOperacoesContaCorrente() {
        this.operacoesConta = new OperacoesContaCorrente();
    }

    public BigDecimal consultarSaldo() {
        return operacoesConta.consultarSaldo();
    }

    public void depositar(BigDecimal valor) {
        operacoesConta.depositar(valor);
    }

    public void sacar(BigDecimal valor) throws SaldoInsuficienteException {
        operacoesConta.sacar(valor);
    }
}
