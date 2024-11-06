public class Carro {
    /*
    Toda classe possui um construtor padrão, herdado da classe
    Object (super classe padrão).
    Inicializa números com zero
    Boolean com false
    String com vazio (confirmar)
    Objetos como nulo.
    */
    // Declaração de atributos (variáveis da classe)
    // Características da entidade
    int quantidadePassageiros;
    private int capacidadeCombustivel;
    double consumoKML;

    // Se somente este construtor for definido, você será obrigado a passar
//    a capacidade de combustível
    public Carro(int capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    // Criando um construtor personalizado e, existindo a necessidade
//    de gerar um objeto vazio, é necessário declarar o construtor
//    padrão.
    public Carro() {

    }

    // Método de acesso ao atributo privado capacidadeCombustivel
    public void setCapacidadeCombustivel(int capacidadeCombustivel) {
        this.capacidadeCombustivel = capacidadeCombustivel;
    }

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é de " +
                capacidadeCombustivel * consumoKML + "KM");
    }

     public double calcularAutonomia() {
        return capacidadeCombustivel * consumoKML;
    }




}
