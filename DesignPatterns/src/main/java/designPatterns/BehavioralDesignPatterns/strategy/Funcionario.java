package designPatterns.BehavioralDesignPatterns.strategy;

import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private BigDecimal salario;
    private TipoContratacaoEnum tipoContratacao;

    public Funcionario(String nome, BigDecimal salario, TipoContratacaoEnum tipoContratacao) {
        this.nome = nome;
        this.salario = salario;
        this.tipoContratacao = tipoContratacao;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public TipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }
}


