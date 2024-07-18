package designPatterns.StructuralDesignPatterns.proxy;

import designPatterns.StructuralDesignPatterns.proxy.interfaces.PessoaRepositoryInterface;
import designPatterns.StructuralDesignPatterns.proxy.interfaces.PessoaServiceInterface;

public class App {
    public static void main(String[] args) {
        PessoaRepositoryInterface pessoaRepository = new PessoaRepository();
        PessoaServiceInterface pessoaService = new PessoaService(pessoaRepository);

        PessoaServiceInterface proxiedService = PessoaServiceProxy.createProxy(pessoaService);

        Pessoa pessoa1 = new Pessoa(1L, "Alice");
        Pessoa pessoa2 = new Pessoa(2L, "Bob");

        proxiedService.savePessoa(pessoa1);
        proxiedService.savePessoa(pessoa2);

        Pessoa fetchedPessoa1 = proxiedService.getPessoaById(1L);
        Pessoa fetchedPessoa1Again = proxiedService.getPessoaById(1L);

        Pessoa fetchedPessoa2 = proxiedService.getPessoaById(2L);
    }
}
