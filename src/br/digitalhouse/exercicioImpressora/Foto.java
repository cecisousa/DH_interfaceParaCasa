package br.digitalhouse.exercicioImpressora;

public class Foto implements Imprimivel {

    private String nome;
    private String tipo;

    public Foto (String novoNome, String novoTipo){
        nome = novoNome;
        tipo = novoTipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setTipo(String novoTipo) {
        tipo = novoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie" + nome + tipo);
    }

    @Override
    public String toString() {
        return "Foto{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
