package desafio1;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    public void acelerar() {
        this.velocidade = 20;
    }

    public void abastecer(int quantidade) {
        if (quantidade > 60) {
            System.out.println("O limite do tanque de combustível é de 60... A quantidade de combustível atual é de " + this.litrosCombustivel);
            return;
        }

        this.litrosCombustivel += quantidade;
    }

    public void frear() {
        if (this.velocidade <= 0) {
            System.out.println("Não é possível frear o veículo já parado!");
            return;
        }

        this.velocidade -= 20;

        if (this.velocidade <= 0) {
            this.velocidade = 0;
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public void ligar() {
        if (isLigado) {
            System.out.println("Veículo já está ligado!");
            return;
        }

        isLigado = true;
    }

    public void desligar() {
        if (this.velocidade > 0) {
            System.out.println("Não é possível desligar o carro em movimento");
            return;
        }

        isLigado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
