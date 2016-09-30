package td03;

public class Cilindro extends Circulo {
    //Atributos
    private double altura;
    private String forma3;
    
    //Métodos personalizados
    
        public void mudaAltura(double A, double R, double ordenada, double abcissa){
        this.altura = A;
        super.setRaio(R);
        super.setX(ordenada);
        super.setY(abcissa);
    }
        
        @Override
        public String descreveForma() {
        this.forma3="Altura do Cilindro: "+String.valueOf(altura)+", e "+super.descreveForma();
        return forma3;
    }
    
    //Métodos especiais

    public Cilindro() {
        this.altura = 0;
        super.mudaRaio(0,0,0);
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getForma3() {
        return forma3;
    }

    public void setForma3(String forma3) {
        this.forma3 = forma3;
    }
    
    
}
