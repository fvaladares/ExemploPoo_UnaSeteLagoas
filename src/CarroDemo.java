public class CarroDemo {
    public static void main(String[] args) {
        // Declaração da variável de tipo Carro
        Carro gol = null;
        Carro golG6;

        // Criação da instância da classe Carro
        gol = new Carro(); // Construiu um objeto

//        alteração direta dos atributos do carro
//        gol.capacidadeCombustivel = 55; // Não funciona porque o atributo é privado (acesso restrito)
// Funciona porque o método é público,
//  mas pertence à classe, que tem acesso
//  aos componentes privados.
        gol.setCapacidadeCombustivel(55);
        gol.quantidadePassageiros = 5;
        gol.consumoKML = 12.5;

        golG6 = gol;

        System.out.println("Gol:\t" + gol);
        System.out.println("Gol G6:\t" + golG6);

        System.out.println("Consumo do gol: " + gol.consumoKML);

        golG6.consumoKML = 14.5;

        System.out.println("Consumo do gol: " + gol.consumoKML);

        golG6 = new Carro(); // Cria uma nova instância do carro.

        System.out.println("Gol:\t" + gol);
        System.out.println("Gol G6:\t" + golG6);

        System.out.println("Consumo do golG6: " + golG6.consumoKML);

        gol.exibirAutonomia();

        System.out.println("Exibindo o consumo da forma correta " +
                gol.calcularAutonomia() + " KMs");

        FazAlgumaCoisa fazAlgumaCoisa = new FazAlgumaCoisa();

        fazAlgumaCoisa.modificaOCarro(gol);

        System.out.println("Exibindo o consumo da forma correta (depois de passar o objeto por outro objeto " +
                gol.calcularAutonomia() + " KMs");
    }
}
