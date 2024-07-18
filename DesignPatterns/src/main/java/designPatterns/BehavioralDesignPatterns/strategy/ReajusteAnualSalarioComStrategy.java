package designPatterns.BehavioralDesignPatterns.strategy;

import java.math.BigDecimal;

public class ReajusteAnualSalarioComStrategy {

    private CalculadorReajusteAnualSalario calculador;

    public void setCalculador(CalculadorReajusteAnualSalario calculador) {
        this.calculador = calculador;
    }

    public BigDecimal calcularReajuste(Funcionario funcionario) {
        return calculador.calcularReajuste(funcionario);
    }
}

