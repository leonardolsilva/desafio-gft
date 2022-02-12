package desafio1;

public class VeiculoApplication {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        veiculo.setMarca("Hyundai");
        veiculo.setModelo("HB20 Sport TSI");
        veiculo.setPlaca("GDK29889");
        veiculo.setCor("Cinza chumbo");
        veiculo.setKm("12000");
        veiculo.setLigado(true);
        veiculo.setLitrosCombustivel(1);
        veiculo.setVelocidade(0);
        veiculo.setPreco(80000);

        System.out.println("Acelerando veículo...");
        veiculo.acelerar();
        System.out.println("Velocidade do veículo: " + veiculo.getVelocidade());

        System.out.println();
        System.out.println();

        System.out.println("Abastecendo veículo...");
        veiculo.abastecer(30);
        System.out.println("Quantidade de combustível no veículo: " + veiculo.getLitrosCombustivel());

        System.out.println();
        System.out.println();

        System.out.println("Abastecendo veículo novamente...");
        veiculo.abastecer(100);
        System.out.println("Combustível do veículo: " + veiculo.getLitrosCombustivel());

        System.out.println();
        System.out.println();

        System.out.println("Freando o veículo...");
        veiculo.frear();
        System.out.println("Velocidade atual: " + veiculo.getVelocidade());

        System.out.println();
        System.out.println();

        System.out.println("Tentativa de frear o veículo novamente...");
        veiculo.frear();
        System.out.println("Velocidade atual: " + veiculo.getVelocidade());

        System.out.println();
        System.out.println();

        System.out.println("Pintando o veículo...");
        veiculo.pintar("Amarelo");
        System.out.println("Nova cor do veículo: " + veiculo.getCor());

        System.out.println();
        System.out.println();

        System.out.println("Ligando o veículo...");
        veiculo.ligar();

        System.out.println();
        System.out.println();

        System.out.println("Desligando o veículo...");
        veiculo.desligar();
        System.out.println("Veículo está ligado: " + veiculo.isLigado());

        System.out.println();
        System.out.println();

        System.out.println("Ligando o veículo...");
        veiculo.ligar();
        System.out.println("Veículo está ligado: " + veiculo.isLigado());
    }
}
