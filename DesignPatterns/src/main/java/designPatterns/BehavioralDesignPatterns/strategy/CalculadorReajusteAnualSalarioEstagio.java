package designPatterns.BehavioralDesignPatterns.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadorReajusteAnualSalarioEstagio implements CalculadorReajusteAnualSalario {

    private static final BigDecimal PERCENTUAL_REAJUSTE = new BigDecimal("0.05"); // 5%

    @Override
    public BigDecimal calcularReajuste(Funcionario funcionario) {
        BigDecimal reajuste = funcionario.getSalario().multiply(PERCENTUAL_REAJUSTE);
        return funcionario.getSalario().add(reajuste).setScale(2, RoundingMode.HALF_UP);
    }
}
