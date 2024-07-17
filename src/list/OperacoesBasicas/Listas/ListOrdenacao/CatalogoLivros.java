package list.OperacoesBasicas.Listas.ListOrdenacao;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    //Construtor
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //Metodo para adicionar Livro
    public void adicionarLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    //Metodo para pesquisar por autor
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Metodo para pesquisar por intervalo de anos
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
         }
        return livrosPorIntervalo;
    }

    //Metodo para pesquisar por nome do livro (Somente o primeiro livro)
    public Livro pesquisaPorTitulo(String nome){
        Livro livroDaVez = null;

        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(nome)){
                    livroDaVez = l;
                }
            }
        }
        return livroDaVez;
    }

    //Metodo Main para testes
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 1", 1994);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 4", 2015);

        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }
}
