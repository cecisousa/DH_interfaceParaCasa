package br.digitalhouse.exercicioVoadores;

public class Aviao implements Voador {

    private Integer horasDeVoo;

    public Aviao (Integer novasHorasDeVoo){
        horasDeVoo = novasHorasDeVoo;
    }

    public Integer getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(Integer novasHorasDeVoo) {
        horasDeVoo = novasHorasDeVoo;
    }

    @Override
    public void voar() {
        setHorasDeVoo(horasDeVoo += 13);
        System.out.println("Estou voando como um avião" + getHorasDeVoo());
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "horasDeVoo=" + horasDeVoo +
                '}';
    }
}
