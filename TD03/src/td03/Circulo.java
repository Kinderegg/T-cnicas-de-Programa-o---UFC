package td03;

public class Circulo extends Ponto {
    //Atributos
    private double raio;
    private String forma2;
    
    //Métodos personalizados
    
    public void mudaRaio(double R, double ordenada, double abcissa){
        this.raio = R;
        super.setX(ordenada);
        super.setY(abcissa);
    }
    
    @Override
    public String descreveForma() {
        this.forma2="Raio do Circulo: "+String.valueOf(raio)+", e "+super.descreveForma();
        return forma2;
    }
        
    
    //Métodos Especiais
    public Circulo() {
        this.raio = 0;
        super.mudaPonto(0, 0);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
        public String getForma2() {
        return forma2;
    }

    public void setForma2(String forma2) {
        this.forma2 = forma2;
    }
}
