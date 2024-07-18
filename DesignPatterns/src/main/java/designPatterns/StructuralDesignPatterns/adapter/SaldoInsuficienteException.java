package designPatterns.StructuralDesignPatterns.adapter;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

