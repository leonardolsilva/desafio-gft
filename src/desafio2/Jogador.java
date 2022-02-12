package desafio2;

import java.time.LocalDate;

public class Jogador {

    private String nome;
    private Posicao posicao;
    private LocalDate dataNascimento;

    public void exibirDadosJogador() {
        System.out.println("Nome Jogador: " + this.nome);
        System.out.println("Posição: " + this.posicao.name());
        System.out.println("Data Nascimento: " + this.dataNascimento.toString());
    }

    public int calcularIdadeJogador() {
        int anoAtual = LocalDate.now().getYear();
        int anoNascimento = this.dataNascimento.getYear();

        return anoAtual - anoNascimento;
    }

    public void calcularAposentadoria() {
        switch(this.posicao) {
            case ATACANTE: {
                int idade = calcularIdadeJogador();
                int tempoParaAposentar = 35 - idade;
                System.out.println("O jogador " + this.nome +  " precisa de mais " + tempoParaAposentar + " para se aposentar");
                break;
            }

            case MEIO_CAMPO: {
                int idade = calcularIdadeJogador();
                int tempoParaAposentar = 38 - idade;
                System.out.println("O jogador " + this.nome +  " precisa de mais " + tempoParaAposentar + " para se aposentar");
                break;
            }

            case DEFESA: {
                int idade = calcularIdadeJogador();
                int tempoParaAposentar = 40 - idade;
                System.out.println("O jogador " + this.nome +  " precisa de mais " + tempoParaAposentar + " para se aposentar");
                break;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
