package designPatterns.StructuralDesignPatterns.proxy.interfaces;

import designPatterns.StructuralDesignPatterns.proxy.Pessoa;

public interface PessoaRepositoryInterface {
    Pessoa findById(Long id);
    void save(Pessoa pessoa);
}

