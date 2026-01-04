package exercicio2;

import java.util.Scanner;

/**
 *
 * @author rafael.marques_uscso
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite um número inteiro qualquer");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        if(numero >= 1){
            System.out.println("O número é postivo");
        }else if(numero < 0){
            System.out.println("O número é negativo");
        }else{
            System.out.println("O número é 0");
        }
    }
    
}
