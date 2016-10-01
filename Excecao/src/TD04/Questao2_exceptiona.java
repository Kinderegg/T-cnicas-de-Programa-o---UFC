/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD04;

/**
 *
 * @author Oliveira
 */
import java.util.Scanner;

public class Questao2_exceptiona{
    Scanner ler = new Scanner(System.in);
    int c[] = new int[5];
    int b;
    public void ExceptionA(){
        System.out.println("Digite um número inteiro para quantas casas você quer que sejam preenchidas"
                + " no vetor de 5 posições: ");
        b = ler.nextInt();
        try{
            for(int i = 0; i < b; i++){
                c[i] = i;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Erro no vetor!\n");
        }
    } 
}
