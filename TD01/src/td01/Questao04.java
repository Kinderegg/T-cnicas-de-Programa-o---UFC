/*
 * Questão 04 TD01 - Técnicas de programação.
 * @author José Lopes
 */
package td01;
import java.util.Scanner;

public class Questao04 {
    public static void main (String[] args) {
        //cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner ( System.in );
        
        //inicia a declaração das variáveis usadas
        double tempo_viagem; // valor do tempo de viagem em horas
        double velocidade_media; //valor da velocidade media da viagem em km/h
        double distancia; //valor da distancia em km
        double consumo; //valor do consumo em litros
        
        //inicia o programa
        System.out.println("----------- VALOR CONSUMO COMBUSTÍVEL -----------");
        System.out.print("Insira o tempo gasto na sua viagem (em horas): ");
        tempo_viagem = input.nextDouble();
        
        System.out.print("Insira o valor da velocidade média da viagem (em km/h): ");
        velocidade_media = input.nextDouble();
        
        distancia = tempo_viagem*velocidade_media;
        consumo = distancia/14;
        
        System.out.printf("Sua viagem consumirá %.2f litros.\n", consumo);
    } //Fim do método main
    
} //Fim da classe Questão04
