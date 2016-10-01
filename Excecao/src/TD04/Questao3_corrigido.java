package TD04;
import java.util.Scanner; //Linha inserida


public class Questao3_corrigido {
    
    public static void main (String[] args) {
       try {
           
            Scanner entrada = new Scanner(System.in); //linha inserida
        
            int numero = Integer.parseInt( entrada.nextLine() );
            //LINHA ORIGINAL: int numero = Integer.parseInt( entrada.readLine() );
        
            int matriz[][] = {{0, 1, 2}, {3, 4, 5}};
            //LINHA ORIGINAL: int matriz[][] = {{0, 1, 2}, {3, 4}};
            
            matriz[1][2] = numero;

            //As próximas duas linhas não fazem nada no programa, mas se o usuário
            //colocar "0" vai gerar um erro de divisao em virtude delas
            int x = 2;
            x /= numero;
        
            System.out.println("O último elemento da matriz é: "+numero);
           
       } catch(ArrayIndexOutOfBoundsException e) {
           
           System.out.println("ERRO: TAMANHO DE MATRIZ INCOMPATÍVEL");
           
       } catch(ArithmeticException e) {
           
           System.out.println("ERRO: DIVISÃO POR ZERO. ");
           
       } catch(NumberFormatException e) {
           
           System.out.println("ERRO: O DADO PRECISA SER NUMÉRICO. ");
           
       } catch(RuntimeException e) {
           
           System.out.println("ERRO NA CLASSE SCANNER. VERIFIQUE.");
          
       } finally {
           System.out.println("FIM.");
       }

    }
}
