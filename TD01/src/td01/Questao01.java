/*
App em Java que efetua as 4 operações dados 2 números
 */
package td01;

import java.util.Scanner;

public class Questao01 {

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                
        System.out.print("Digite o primeiro valor: ");
        int num = entrada.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Qual operação s ser realizada? 1 - Soma ou 2 - Subtração ou 3 - Multriplicação ou 4 - Divisão: ");
        int op = entrada.nextInt();
        
        switch(op){
            case 1:
                System.out.println("O valor da soma dos dois números é: "+(num+num2));
                break;
            case 2:
                System.out.println("O valor da duferença dos dois números é: "+(num-num2));
                break;
            case 3:
                System.out.println("O valor do produto dos dois números é: "+(num*num2));
                break;
            case 4:
                System.out.println("O valor da divisão dos dois números é: "+(num/num2));
                break;
            default:
                System.out.println("Fim");
        }
        
    }
    
}
