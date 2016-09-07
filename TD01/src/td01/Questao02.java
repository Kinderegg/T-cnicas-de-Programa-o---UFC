/*
 * Questão 02 TD01 - Técnicas de programação.
 * @author José Lopes
 */
package td01;
import java.util.Scanner;

public class Questao02 {
    public static void main (String[] args) {
        //cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner ( System.in );
        
        //inicia a declaração das variáveis usadas
        String nome; //nome do correntista
        double saldo; // saldo do correntista
        double credito; //valor do credito do correntista
        double debito; //valor do debito do correntista
        int opcao=0; //opcao escolhida
        
        //inicia o programa
        System.out.println("----------- BANCO -----------");
        System.out.print("Olá correntista. Insira seu nome: ");
        nome = input.nextLine();
        
        System.out.printf("Olá %s!\n", nome);
        System.out.print("Insira seu saldo inicial (em reais): R$ ");
        saldo = input.nextDouble();
        
        System.out.printf("Ok. Seu saldo inicial é de R$ %.2f\n", saldo);
        
        while (opcao != 3){ //enquanto a opção for diferente de 3 o programa continua a inserir ou debitar valores
            
        System.out.print("O que deseja fazer? (1 - Débito / 2 - Crédito / 3 - Encerrar aplicativo): ");
        opcao = input.nextInt();
        
            switch(opcao){
            case 1: //Débito
                 System.out.print("Valor do débito (em reais): R$ ");
                 debito = input.nextDouble();
                 saldo = saldo - debito;
                 System.out.printf("Seu saldo atualizado é de R$ %.2f.\n", saldo);
                 break;
            case 2: //Crédito
                 System.out.print("Valor do crédito (em reais): R$ ");
                 credito = input.nextDouble();
                 saldo = saldo + credito;
                 System.out.printf("Seu saldo atualizado é de R$ %.2f.\n", saldo);
                 break;
            case 3: //Saldo
                System.out.printf("Seu saldo é de R$ %.2f.\n", saldo);
                System.out.printf("Obrigado por utilizar nossos serviços %s.\n", nome);
                 break;
            default: //Se o usuário inserir algo diferente de 1, 2 ou 3 retorna erro e volta ao início
                System.out.print("Opção inválida. Tente novamente.\n");
        } //Fim switch
        } //Fim loop
                
    } //Fim do método main
    
} //Fim da classe Questao02
