package desafio4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InversaoDeNumeros {

    private final List<BigInteger> numeros = new ArrayList<>();

    public void adicionarNumero(BigInteger numero) {
        this.numeros.add(numero);
    }

    public List<BigInteger> inverterNumerosDaLista() {

        List<String> numerosEmString = converterParaListaDeString();
        List<BigInteger> numerosInvertidos = new ArrayList<>();

        for (String numeroEmString : numerosEmString) {

            String[] arrayNumerosInvertidos = inverterNumeros(numeroEmString);
            String numeroInvertido = construirNumeroInvertido(arrayNumerosInvertidos);

            numerosInvertidos.add(new BigInteger(numeroInvertido));
        }

        return numerosInvertidos;
    }

    private String construirNumeroInvertido(String[] arrayNumerosInvertidos) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String numero : arrayNumerosInvertidos) {
            stringBuilder.append(numero);
        }

        return stringBuilder.toString();
    }

    private List<String> converterParaListaDeString() {
        return numeros.stream()
                .map(BigInteger::toString)
                .collect(Collectors.toList());
    }

    private String[] inverterNumeros(String numeroEmString) {
        String[] arrayNumero = converterParaMatrizDeString(numeroEmString);
        String[] arrayNumerosInvertidos = criarArrayDeNumerosInvertidos(arrayNumero.length);

        int indiceArrayNumeroInvertido = 0;

        for (int i = arrayNumero.length - 1; i >= 0; i--) {
            arrayNumerosInvertidos[indiceArrayNumeroInvertido] = arrayNumero[i];
            indiceArrayNumeroInvertido++;
        }

        return arrayNumerosInvertidos;
    }

    private String[] converterParaMatrizDeString(String numeroEmString) {
        return numeroEmString.split("");
    }

    private String[] criarArrayDeNumerosInvertidos(int tamanho) {
        return new String[tamanho];
    }
}
