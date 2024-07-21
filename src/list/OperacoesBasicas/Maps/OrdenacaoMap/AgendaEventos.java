package list.OperacoesBasicas.Maps.OrdenacaoMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    //Construtor
    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    //Metodos
    //Metodo para adicionar evento
    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventoMap.put(data, new Evento(nome, atracao));
    }

    //Metodo para exibir eventos em ordem crescente de datas
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    //Metodo para obter o evento a seguir
    public void obterProcimoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: "+entry.getValue()+" acontecera na data "+entry.getKey());
                break;
            }
        }
    }


    //Metodo Main para testes
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.DECEMBER, 03), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.DECEMBER, 03), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2020, Month.DECEMBER, 12), "Evento 3", "Atração 3");

        agendaEventos.obterProcimoEvento();

        agendaEventos.exibirAgenda();
    }
}
