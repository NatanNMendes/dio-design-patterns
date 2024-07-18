package designPatterns.StructuralDesignPatterns.proxy;

import designPatterns.StructuralDesignPatterns.proxy.interfaces.PessoaRepositoryInterface;

import java.util.HashMap;
import java.util.Map;

public class PessoaRepository implements PessoaRepositoryInterface {
    private Map<Long, Pessoa> banco = new HashMap<>();

    @Override
    public Pessoa findById(Long id) {
        return banco.get(id);
    }

    @Override
    public void save(Pessoa pessoa) {
        banco.put(pessoa.getId(), pessoa);
    }
}
