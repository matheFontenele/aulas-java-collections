package list.OperacoesBasicas.Listas.ListPesquisa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    //Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //Metodo para adicionar tarefas
    public void adicionarTarefa(String descicao){
        tarefaList.add(new Tarefa(descicao));
    }

    //Metodo para remover tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> removesTarefas = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
               removesTarefas.add(t);
            }
        }

        tarefaList.removeAll(removesTarefas);
    }

    //Metodo para obter numero total de tarefas em uma lista
    public int obterNumeroTotal(){
        return tarefaList.size();
    }

    //Metodo para exibir todas as tarefas da lista
    public void obterDescricoes(){
        System.out.println(tarefaList);
    }

    //Metodo Main para testes
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("Numero total de tarefas na lista: "+listaTarefa.obterNumeroTotal());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Numero total de tarefas na lista: "+listaTarefa.obterNumeroTotal());

        listaTarefa.obterDescricoes();
    }

}
