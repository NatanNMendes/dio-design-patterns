package designPatterns.BehavioralDesignPatterns.strategy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Funcionario funcionarioCLT = new Funcionario("João", new BigDecimal("3000.00"), TipoContratacaoEnum.CLT);
        Funcionario funcionarioPJ = new Funcionario("Maria", new BigDecimal("5000.00"), TipoContratacaoEnum.PJ);
        Funcionario funcionarioEstagio = new Funcionario("Ana", new BigDecimal("1500.00"), TipoContratacaoEnum.ESTAGIO);

        ReajusteAnualSalarioComStrategy reajusteAnual = new ReajusteAnualSalarioComStrategy();

        reajusteAnual.setCalculador(new CalculadorReajusteAnualSalarioCLT());
        BigDecimal novoSalarioCLT = reajusteAnual.calcularReajuste(funcionarioCLT);
        funcionarioCLT.setSalario(novoSalarioCLT);
        System.out.println("Novo salário de " + funcionarioCLT.getNome() + " (CLT): " + funcionarioCLT.getSalario());

        reajusteAnual.setCalculador(new CalculadorReajusteAnualSalarioPJ());
        BigDecimal novoSalarioPJ = reajusteAnual.calcularReajuste(funcionarioPJ);
        funcionarioPJ.setSalario(novoSalarioPJ);
        System.out.println("Novo salário de " + funcionarioPJ.getNome() + " (PJ): " + funcionarioPJ.getSalario());

        reajusteAnual.setCalculador(new CalculadorReajusteAnualSalarioEstagio());
        BigDecimal novoSalarioEstagio = reajusteAnual.calcularReajuste(funcionarioEstagio);
        funcionarioEstagio.setSalario(novoSalarioEstagio);
        System.out.println("Novo salário de " + funcionarioEstagio.getNome() + " (Estágio): " + funcionarioEstagio.getSalario());
    }
}


