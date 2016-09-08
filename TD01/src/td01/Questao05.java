/*
 * Questão 05 TD01 - Técnicas de programação.
 * @author José Lopes
 */
package td01;
import java.util.Scanner;

public class Questao05 {
    public static void main (String[] args) {
         //cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner ( System.in );
        
        //inicia a declaração das variáveis usadas
        double salario; // valor do salário do funcionário
        
        //inicia o programa
        System.out.println("----------- INSS -----------");
        System.out.print("Insira o seu salário mensal (em reais): R$ ");
        salario = input.nextDouble();
        
        if (salario<=600) {
            System.out.println("Sua faixa de desconto é 0% (isento).");
            System.out.printf("Seu salário bruto é: R$ %.2f.\n", salario);
            System.out.println("O valor do desconto é de R$ 0,00.");
            System.out.printf("O valor líquido é de: R$ %.2f.\n", salario);
            
        } else {
            if (salario > 600 && salario <= 1200) {
                System.out.println("Sua faixa de desconto é 20%.");
                System.out.printf("Seu salário bruto é: R$ %.2f.\n", salario);
                System.out.printf("O valor do desconto é de R$ %.2f.\n", salario*20/100);
                System.out.printf("O valor líquido é de: R$ %.2f.\n", salario-(salario*20/100));
            } else {
                if (salario > 1200 && salario <= 2000) {
                    System.out.println("Sua faixa de desconto é 25%.");
                    System.out.printf("Seu salário bruto é: R$ %.2f.\n", salario);
                    System.out.printf("O valor do desconto é de R$ %.2f.\n", salario*25/100);
                    System.out.printf("O valor líquido é de: R$ %.2f.\n", salario-(salario*25/100));
                } else {
                    System.out.println("Sua faixa de desconto é 30%.");
                    System.out.printf("Seu salário bruto é: R$ %.2f.\n", salario);
                    System.out.printf("O valor do desconto é de R$ %.2f.\n", salario*30/100);
                    System.out.printf("O valor líquido é de: R$ %.2f.\n", salario-(salario*30/100));
                } //Fim do terceiro if
            } //Fim do segundo if
        } //Fim do primeiro if
            
    } //Fim do método main
    
} //Fim da classe Questão05
