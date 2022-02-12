package desafio3;

public class Ocorrencia {

    private int frequencia;
    private int indicePrimeiraCaracter;

    public Ocorrencia(int frequencia, int indiceCaracter) {
        this.frequencia = frequencia;
        this.indicePrimeiraCaracter = indiceCaracter;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public int getIndicePrimeiraCaracter() {
        return indicePrimeiraCaracter;
    }
}
