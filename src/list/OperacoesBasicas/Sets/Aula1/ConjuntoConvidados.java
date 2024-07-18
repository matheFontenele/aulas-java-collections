package list.OperacoesBasicas.Sets.Aula1;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Metodos
    //Adicionar convidado
    public void adicionarUmConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    //Remover convidado por codigo de convite
    public void removerConvidadoPorCodigoDeConvite(int convite){
        Convidado convidadoRemove = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == convite){
                convidadoRemove = c;
                break;
            }
        }
        convidadoSet.remove(convidadoRemove);
    }

    //Metodo para contar numero de convuidados
    public int contarconvidados(){
        return convidadoSet.size();
    }

    //Metodo para exibir lista de convidados
    public void exibirconvidados(){
        System.out.println(convidadoSet);
    }

    //Metodo Main para testes
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarUmConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarUmConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarUmConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarUmConvidado("Convidado 4", 1237);

        conjuntoConvidados.removerConvidadoPorCodigoDeConvite(1234);

        System.out.println("Existem "+conjuntoConvidados.contarconvidados() + " dentro disso ai");

        conjuntoConvidados.exibirconvidados();
    }
}
