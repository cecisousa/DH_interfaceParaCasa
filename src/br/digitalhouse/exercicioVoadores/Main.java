package br.digitalhouse.exercicioVoadores;

public class Main {
    public static void main(String[] args) {
        Pato umPato = new Pato(10);
        Aviao umAviao = new Aviao(100);
        Super_homem umSuperMan = new Super_homem(38);

        TorreDeControle umaTorre = new TorreDeControle();
        umaTorre.adicionarVoador(umAviao);
        umaTorre.adicionarVoador(umPato);
        umaTorre.adicionarVoador(umSuperMan);
        umaTorre.voemTodos();

    }
}
