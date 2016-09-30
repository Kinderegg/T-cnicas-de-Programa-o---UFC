package td03;

public class TestaFormas {

    public static void main(String[] args) {
        
       int i;
       
        Ponto[] formas = new Ponto[3];
        formas[0] = new Ponto();
        formas[1] = new Ponto();
        formas[1].setX(5);
        formas[1].setY(15);
        formas[2] = new Ponto();
        formas[2].mudaPonto(20, 10);
        
        for (i=0; i<=2; i++) {
            System.out.println(formas[i].descreveForma());
        }
        
        Circulo[] formas2 = new Circulo[3];
        formas2[0] = new Circulo();
        formas2[1] = new Circulo();
        formas2[1].setX(5);
        formas2[1].setY(15);
        formas2[1].setRaio(15);
        formas2[2] = new Circulo();
        formas2[2].mudaRaio(30, 20, 10);
        
        for (i=0; i<=2; i++) {
            System.out.println(formas2[i].descreveForma());
        }
        
        Cilindro[] formas3 = new Cilindro[5];
        formas3[0] = new Cilindro();
        formas3[0].mudaPonto(10, 10);
        formas3[1] = new Cilindro();
        formas3[1].mudaRaio(5,20,20);
        formas3[2] = new Cilindro();
        formas3[3] = new Cilindro();
        formas3[3].mudaAltura(6, 9, 10, 12);
        formas3[4] = new Cilindro();
        
        for (i=0; i<=2; i++) {
            System.out.println(formas3[i].descreveForma());
        }
                
    }
    
}
