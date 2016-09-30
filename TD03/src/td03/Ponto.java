package td03;

public class Ponto {
    //Atributos
    private double x;
    private double y;
    private String forma;
    
    //Métodos personalizados
    public void mudaPonto(double ordenada, double abcissa){
        this.setX(ordenada);
        this.setY(abcissa);
    }
    
    public String descreveForma() {
        this.forma="Coordenadas do Ponto: ("+String.valueOf(x)+", "+String.valueOf(y)+")";
        return forma;
        
    }
    
    //Métodos especiais
    public Ponto() {
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
}
