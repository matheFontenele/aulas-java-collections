package list.OperacoesBasicas.Sets.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    //Metodos
    //Adicionar contatos
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    //ExibirContato
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    //Pesquisar contato por nome
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    //Metodo para atualizar numero do contato
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    //Metodo Main para testes
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Matheus", 123456);
        agendaContatos.adicionarContato("Matheus Fontes", 12458);
        agendaContatos.adicionarContato("Matheus Brito", 1232265);
        agendaContatos.adicionarContato("Matheus", 1245748);

        System.out.println(agendaContatos.atualizarNumeroContato("Matheus Fontes", 883980));

        agendaContatos.exibirContatos();
    }
}
