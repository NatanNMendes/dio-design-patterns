package designPatterns.BehavioralDesignPatterns.strategy;

import java.math.BigDecimal;

public interface CalculadorReajusteAnualSalario {
    BigDecimal calcularReajuste(Funcionario funcionario);
}

