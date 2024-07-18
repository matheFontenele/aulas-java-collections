package list.OperacoesBasicas.Maps.Aula1;

public class Contato {
    private String nome;
    private long numero;

    public Contato(String nome, long numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public long getNumero() {
        return numero;
    }
}
