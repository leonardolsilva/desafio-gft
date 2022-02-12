package desafio4;

import java.math.BigInteger;
import java.util.List;

public class InverterNumeroApplication {

    public static void main(String[] args) {
        InversaoDeNumeros inversaoDeNumeros = new InversaoDeNumeros();

        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(15485448));
        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(2195498));
        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(12));
        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(98716549));
        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(9999998999L));
        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(1654891));
        inversaoDeNumeros.adicionarNumero(BigInteger.valueOf(15485448));

        List<BigInteger> numerosInvertidos = inversaoDeNumeros.inverterNumerosDaLista();

        numerosInvertidos.forEach(System.out::println);
    }
}
