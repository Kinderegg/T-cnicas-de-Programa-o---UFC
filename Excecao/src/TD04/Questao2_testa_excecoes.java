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
public class Questao2_testa_excecoes {
    public static void main(String[] args){
        Questao2_exceptiona A = new Questao2_exceptiona();
        Questao2_exceptionb B = new Questao2_exceptionb();
        Questao2_exceptionc C = new Questao2_exceptionc();
        System.out.println("Testando a ExceptionA: ");
        A.ExceptionA();
        System.out.println("\nTestando a ExceptionB: ");
        B.ExceptionB();
        System.out.println("\nTestando a ExcpetionC: ");
        C.ExceptionC();
        System.out.println("\nE com isso comprovamos que as Exceptions B e C herdam características da"
                + " Excetion A");
    }
}
