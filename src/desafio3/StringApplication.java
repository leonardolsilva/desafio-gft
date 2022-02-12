package desafio3;

public class StringApplication {

    public static void main(String[] args) {

        OcorrenciaLetras aaabccccdeeef = new OcorrenciaLetras("aaabccccdeeef");
        System.out.println("Primeira letra que não se repete: " + aaabccccdeeef.analisarLetras());
        System.out.println();

        OcorrenciaLetras strings = new OcorrenciaLetras("strings");
        System.out.println("Primeira letra que não se repete: " + strings.analisarLetras());
        System.out.println();

        OcorrenciaLetras ocorrenciaLetras = new OcorrenciaLetras("microsoft visual studio 2022");
        System.out.println("Primeira letra que não se repete: " + ocorrenciaLetras.analisarLetras());
        System.out.println();

        OcorrenciaLetras abcedoftz = new OcorrenciaLetras("abcedoftz");
        System.out.println("Primeira letra que não se repete: " + abcedoftz.analisarLetras());
        System.out.println();

        OcorrenciaLetras aabb = new OcorrenciaLetras("aabb");
        System.out.println("Primeira letra que não se repete: " + aabb.analisarLetras());
        System.out.println();

    }

}
