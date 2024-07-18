package designPatterns.StructuralDesignPatterns.proxy;

import designPatterns.StructuralDesignPatterns.proxy.interfaces.PessoaServiceInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PessoaServiceProxy implements InvocationHandler {
    private PessoaServiceInterface pessoaService;

    public PessoaServiceProxy(PessoaServiceInterface pessoaService) {
        this.pessoaService = pessoaService;
    }

    public static PessoaServiceInterface createProxy(PessoaServiceInterface pessoaService) {
        return (PessoaServiceInterface) Proxy.newProxyInstance(
                PessoaServiceInterface.class.getClassLoader(),
                new Class<?>[]{PessoaServiceInterface.class},
                new PessoaServiceProxy(pessoaService));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before invoking method: " + method.getName());
        Object result = method.invoke(pessoaService, args);
        System.out.println("After invoking method: " + method.getName());
        return result;
    }
}
