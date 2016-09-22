package td02;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author José Lopes
 */
public class Aleatorio {
       
    public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);
            int i;
            int n=10;
            int v[] = new int[n];
 
            for(i=0; i<10; i++){
    
                Math.random();
                int valor = (int) (Math.random() * 10001);
    
                System.out.printf("Insira o %d valor: ", (i+1));
                v[i]= ler.nextInt()*valor;
            }
            
            Arrays.sort(v);
            
            System.out.printf("\n\nOs valores digitados agora foram multiplicados por números aleatórios entre 0 e 10.000 e ordenados do menor para o maior:\n\n");
            
            for (i=0; i<10; i++) {
                System.out.printf("O %d valor encontrado foi: %d\n", (i+1), v[i]);
            }
            
            String maior_valor = String.valueOf(v[9]);
            String segundo_maior_valor = String.valueOf(v[8]);
            String terceiro_maior_valor = String.valueOf(v[7]);
            String quarto_maior_valor = String.valueOf(v[6]);
            
            ArrayList<String>valores = new ArrayList<>();
            valores.add(0, maior_valor);
            valores.add(1, segundo_maior_valor);
            valores.add(2, terceiro_maior_valor);
            valores.add(3, quarto_maior_valor);
            
            System.out.printf("\nOs 4 maiores resultados abaixo: \n\n");
            
            System.out.printf("O maior valor encontrado foi: %s\n", valores.get(0));
            System.out.printf("O segundo maior valor encontrado foi: %s\n", valores.get(1));
            System.out.printf("O terceiro maior valor encontrado foi: %s\n", valores.get(2));
            System.out.printf("O quarto maior valor encontrado foi: %s\n", valores.get(3));
    }
}
