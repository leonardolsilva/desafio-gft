package desafio2;

import java.time.LocalDate;

public class JogadorApplication {

    public static void main(String[] args) {
        Jogador leonardo = criarJogador("Leonardo", Posicao.ATACANTE, LocalDate.of(1996, 8, 14));
        Jogador paulo = criarJogador("Paulo", Posicao.DEFESA, LocalDate.of(2000, 10, 20));
        Jogador lucas = criarJogador("Lucas", Posicao.MEIO_CAMPO, LocalDate.of(2002, 1, 9));

        System.out.println("Idade do jogador " + leonardo.getNome() + ": " + leonardo.calcularIdadeJogador());
        leonardo.exibirDadosJogador();
        leonardo.calcularAposentadoria();


        System.out.println();

        System.out.println("Idade do jogador " + paulo.getNome() + ": " + paulo.calcularIdadeJogador());
        paulo.exibirDadosJogador();
        paulo.calcularAposentadoria();

        System.out.println();

        System.out.println("Idade do jogador " + lucas.getNome() + ": " + lucas.calcularIdadeJogador());
        lucas.exibirDadosJogador();
        lucas.calcularAposentadoria();
    }

    private static Jogador criarJogador(String nome, Posicao posicao, LocalDate dataNascimento) {
        Jogador jogador = new Jogador();

        jogador.setNome(nome);
        jogador.setPosicao(posicao);
        jogador.setDataNascimento(dataNascimento);

        return jogador;
    }
}
