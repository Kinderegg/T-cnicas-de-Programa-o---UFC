/*
 * Questão 03 TD01 - Técnicas de programação.
 * @author José Lopes
 */
package td01;
import java.util.Scanner;

public class Questao03 {
    public static void main (String[] args) {
        //cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner ( System.in );
        
        //inicia a declaração das variáveis usadas
        double salario_minimo; // valor do salário mínimo
        double consumo; //valor do consumo em quilowatts
        double quilowatt; //valor de 1 quilowatt
        double conta; //valor da conta do mes
        double desconto; //valor com desconto
        
        //inicia o programa
        System.out.println("----------- VALOR ENERGIA -----------");
        System.out.print("Insira o valor do salário mínimo atual (em reais): R$ ");
        salario_minimo = input.nextDouble();
        
        System.out.print("Insira o valor do consumo da casa (em quilowatts): kW ");
        consumo = input.nextDouble();
        
        quilowatt = salario_minimo/700;
        conta = quilowatt*consumo;
        desconto = conta - (conta*10/100);
        
        System.out.printf("O valor do quilowatt é: R$ %.2f.\n", quilowatt);
        System.out.printf("O valor da conta é: R$ %.2f.\n", conta);
        System.out.printf("O valor da conta com 10%% de desconto é: R$ %.2f.\n", desconto);
    } //Fim do método main
    
} //Fim da classe Questao03
