package br.digitalhouse.exercicioVoadores;

public class Pato implements Voador {

    private Integer energia;

    public Pato (Integer novaEnergia){
        energia = novaEnergia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer novaEnergia) {
        energia = novaEnergia;
    }

    @Override
    public void voar() {
        energia -= 5;
        System.out.println("Estou voando como um pato" + getEnergia());
    }

    @Override
    public String toString() {
        return "Pato{" +
                "energia=" + energia +
                '}';
    }
}
