package TD04;

public class Questao3 {
    
    public static void main (String[] args) {
       try {
                 
            int numero = Integer.parseInt( entrada.readLine() );      
            int matriz[][] = {{0, 1, 2}, {3, 4}};   
            matriz[1][2] = numero;
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
