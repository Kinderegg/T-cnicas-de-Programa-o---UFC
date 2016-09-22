/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td02;
import java.util.ArrayList;

/**
 *
 * @author José Lopes
 */
public class TestePerformance100000 {
    public static void main(String[] args) {
    int i;
    double long_inicio, long_fim, long_inicio2, long_fim2;
    
    ArrayList<Integer>valores = new ArrayList<>();
    
    //povoa a ArrayList com números aleatórios até 100.000
    long_inicio = System.currentTimeMillis();
    
    for(i=0; i<100000; i++){
    Math.random();
    int n = (int) (Math.random() * 100001);
    valores.add(i,n);
    }
    long_fim = System.currentTimeMillis();
    System.out.printf("O tempo inicial ANTES de povoar a arraylist: %f\n", long_inicio);
    System.out.printf("O tempo final DEPOIS de povoar a arraylist: %f\n", long_fim);
    System.out.printf("O tempo levado para povoar a arraylist com 100000 elementos (em milisegundos: %f)\n", long_fim-long_inicio);
    
    //consulta se um número aleatório até 60000 existe na lista 
    Math.random();
    int valor_consulta = (int) (Math.random()*200001);
    System.out.printf("\nO valor a ser consultado é: %d\n", valor_consulta);
    
    long_inicio2 = System.currentTimeMillis();
        
    if (valores.contains(valor_consulta)==true){
       System.out.println("O valor está contido na array.\n");
    } else {
       System.out.println("O valor não está contido na array.\n");
    }
    long_fim2 = System.currentTimeMillis();
    System.out.printf("O tempo inicial ANTES de consultar a arraylist: %f\n", long_inicio2);
    System.out.printf("O tempo final DEPOIS de consultar a arraylist: %f\n", long_fim2);
    System.out.printf("O tempo levado para consultar a arraylist de 100000 elementos (em milisegundos: %f)\n", long_fim2-long_inicio2);
    
    }
}
