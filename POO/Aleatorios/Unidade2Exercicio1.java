package unidade2exercicio1;

public class Unidade2Exercicio1 {

    public static void main(String[] args) {
        //Criando objetos da classe Carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Atribuindo valores aos atributos dos objetos
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2025;

        //Chamando métodos dos objetos
        carro1.ligar(); //Saída: o carro está ligado
        carro2.acelerar(); //Saída: O carro está acelerando.F
    }

}
