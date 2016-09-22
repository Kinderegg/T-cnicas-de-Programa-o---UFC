package td02;
import java.util.Scanner;
/**
 *
 * @author José Lopes
 */
public class InterfaceMath {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numA, numB;
        
        System.out.println("Insira o valor de numA: ");
        numA = ler.nextInt();
        System.out.println("Insira o valor de numB: ");
        numB = ler.nextInt();

        System.out.println("Resultado inteiro da divisão (usando Math.floor - numA/numB): " +Math.floor(numA/numB));
        System.out.println("Resultado inteiro da divisão (usando Math.ceil - numB/numA): " +Math.ceil(numB/numA));
        System.out.println("Resultado potência (usando Math.pow - numA^numB): " +Math.pow(numA,numB));
        System.out.println("Resultado potência (usando Math.pow - numB^numA): " +Math.pow(numB,numA));
        System.out.println("Resultado tangente (usando Math.tan - numA): " +Math.tan(numA));
        System.out.println("Resultado tangente (usando Math.tan - numB): " +Math.tan(numB));
        System.out.println("Resultado tangente (usando Math.tan - numA/numB): " +Math.tan(numA/numB));
        System.out.println("Resultado tangente (usando Math.tan - numB/numA): " +Math.tan(numB/numA));
    }
    
}
