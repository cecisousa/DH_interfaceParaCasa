package br.digitalhouse.exercicioImpressora;

import java.util.ArrayList;
import java.util.List;

public class Impressora {

    private List<Imprimivel> imprimiveis = new ArrayList<>();
    public void imprimirTudo(){
        for (int i = 0; i < imprimiveis.size(); i++) {
            System.out.println(imprimiveis.get(i));
        }
    }


    public void adicionarImprimivel(Imprimivel umImprimivel){
        imprimiveis.add(umImprimivel);
    }

    public List<Imprimivel> getImprimiveis() {
        return imprimiveis;
    }

    public void setImprimiveis(List<Imprimivel> novoImprimiveis) {
        imprimiveis = novoImprimiveis;
    }
}
