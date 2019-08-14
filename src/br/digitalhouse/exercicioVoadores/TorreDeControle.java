package br.digitalhouse.exercicioVoadores;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {

    private List<Voador> voadores = new ArrayList<>();

    public void voemTodos(){
        for (int i = 0; i < voadores.size(); i++) {
            voadores.get(i).voar();
        }
    }

    public void adicionarVoador(Voador umVoador){
        voadores.add(umVoador);
    }

    public List<Voador> getVoadores() {
        return voadores;
    }

    public void setVoadores(List<Voador> novosVoadores) {
        voadores = novosVoadores;
    }
}
