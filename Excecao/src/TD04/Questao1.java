package TD04;

import java.util.Scanner;

public class Questao1 {
    
    public static double raiz(double numero) throws Erro {
		if(numero < 0){
                    throw new Erro();
                }
		return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        Scanner novo = new Scanner(System.in);
        
        try {
           
            System.out.println("Insira um número: ");
            double numero = novo.nextInt();
            double raiz = raiz(numero); 
            System.out.println("A raiz do número escolhido é: "+raiz);
        } catch(Erro e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("FIM.");
        }

    }
    
}
