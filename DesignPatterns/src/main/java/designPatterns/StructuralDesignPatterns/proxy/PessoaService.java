package designPatterns.StructuralDesignPatterns.proxy;

import designPatterns.StructuralDesignPatterns.proxy.interfaces.PessoaRepositoryInterface;
import designPatterns.StructuralDesignPatterns.proxy.interfaces.PessoaServiceInterface;

import java.util.HashMap;
import java.util.Map;

public class PessoaService implements PessoaServiceInterface {
    private PessoaRepositoryInterface pessoaRepository;
    private Map<Long, Pessoa> cache;

    public PessoaService(PessoaRepositoryInterface pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
        this.cache = new HashMap<>();
    }

    @Override
    public Pessoa getPessoaById(Long id) {

        Pessoa cachedPessoa = cache.get(id);
        if (cachedPessoa != null) {
            System.out.println("Returning cached pessoa with id: " + id);
            return cachedPessoa;
        }

        Pessoa pessoa = pessoaRepository.findById(id);
        if (pessoa != null) {
            cache.put(id, pessoa); // Store in cache
            System.out.println("Fetched and cached pessoa with id: " + id);
        } else {
            System.out.println("Pessoa with id " + id + " not found.");
        }

        return pessoa;
    }

    @Override
    public void savePessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        cache.put(pessoa.getId(), pessoa);
        System.out.println("Saved pessoa: " + pessoa);
    }
}
