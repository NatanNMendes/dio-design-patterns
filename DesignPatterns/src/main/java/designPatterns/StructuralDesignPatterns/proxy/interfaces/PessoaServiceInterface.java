package designPatterns.StructuralDesignPatterns.proxy.interfaces;

import designPatterns.StructuralDesignPatterns.proxy.Pessoa;

public interface PessoaServiceInterface {
    Pessoa getPessoaById(Long id);
    void savePessoa(Pessoa pessoa);
}
