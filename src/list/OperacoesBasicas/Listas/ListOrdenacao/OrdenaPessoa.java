package list.OperacoesBasicas.Listas.ListOrdenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaPessoa{
    private List<Pessoa> pessoaList;

    //Construtores
    public OrdenaPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    //Metodo para adicionar uma pessoa a lista
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    //Metodo para ordenar a lista por idade
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //Metodo para ordernar por altura
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new Pessoa.ComparetorPorAltura());
        return pessoaPorAltura;
    }

    //Metod Main para testes
    public static void main(String[] args) {
        OrdenaPessoa ordena = new OrdenaPessoa();

        ordena.adicionarPessoa("Nome 1", 20, 1.56);
        ordena.adicionarPessoa("Nome 2", 30, 1.80);
        ordena.adicionarPessoa("Nome 3", 25, 1.70);
        ordena.adicionarPessoa("Nome 4", 17, 1.56);

        //System.out.println(ordena.ordenarPorIdade());
        System.out.println(ordena.ordenarPorAltura());
    }
}
