package br.digitalhouse.exercicioVoadores;

public class Super_homem implements Voador {

    private Integer experiencia;

    public Super_homem (Integer novaExperiencia){
        experiencia = novaExperiencia;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Integer novaExperiencia) {
        experiencia = novaExperiencia;
    }

    @Override
    public void voar() {
        setExperiencia(experiencia += 3);
        System.out.println("Estou voando como um campeão" + getExperiencia());
    }

    @Override
    public String toString() {
        return "Super_homem{" +
                "experiencia=" + experiencia +
                '}';
    }
}
