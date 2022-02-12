package desafio3;

import java.util.*;

public class OcorrenciaLetras {

    private final String palavra;

    public OcorrenciaLetras(String palavra) {
        this.palavra = palavra;
    }

    public String analisarLetras() {
        String[] letras = this.palavra.split("");

        Map<String, Ocorrencia> mapaLetraQuantidade = new HashMap<>();

        for (int i = 0; i < letras.length; i++) {
            String letra = letras[i];

            if (mapaLetraQuantidade.containsKey(letra)) {
                Ocorrencia ocorrencia = mapaLetraQuantidade.get(letra);
                Ocorrencia novaOcorrencia = new Ocorrencia(ocorrencia.getFrequencia() + 1, ocorrencia.getIndicePrimeiraCaracter());

                mapaLetraQuantidade.put(letra, novaOcorrencia);
            } else {
                Ocorrencia primeiraOcorrencia = new Ocorrencia(1, i);
                mapaLetraQuantidade.put(letra, primeiraOcorrencia);
            }
        }

        List<Integer> indicesOcorrencias = new ArrayList<>();

        for (Map.Entry<String, Ocorrencia> mapa: mapaLetraQuantidade.entrySet()) {
            System.out.println(mapa.getKey() + " -> " + "Quantidade: " + mapa.getValue().getFrequencia() + " | Index primeira ocorrência: " + mapa.getValue().getIndicePrimeiraCaracter());
            if (mapa.getValue().getFrequencia() == 1)
                indicesOcorrencias.add(mapa.getValue().getIndicePrimeiraCaracter());
        }

        Optional<Integer> indice = indicesOcorrencias.stream()
                .min(Comparator.naturalOrder());

        if (indice.isEmpty()) {
            return "_";
        }

        int indicePrimeiraOcorrencia = indice.get();

        return String.valueOf(this.palavra.charAt(indicePrimeiraOcorrencia));
    }
}
