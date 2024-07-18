package list.OperacoesBasicas.Maps.Aula1;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    //Metodo para adicionar contato
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //Metodo para remover contato
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    //Metodo para exibir contatos
    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    //Metodo para pesquisar contato por nome
    public Integer pesquiserPorNome(String nome){
        Integer numeroPesquisa = null;
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.containsKey(nome);
        }
        return numeroPesquisa;
    }

    //Metodo Main para testes
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Billy Bruther", 12456);
        agendaContatos.adicionarContato("Hughie", 5648);
        agendaContatos.adicionarContato("Homelander", 66666);
        agendaContatos.adicionarContato("Franch", 020105);
        agendaContatos.adicionarContato("Star Light", 333222);

        agendaContatos.removerContato("Star Light");
        agendaContatos.pesquiserPorNome("Homelander");
    }
}
