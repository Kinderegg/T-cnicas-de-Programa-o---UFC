package TD04;

public class Erro extends Exception{
    
    public Erro(){
        super("Erro.. O número escolhido não pode ser negativo!!");
    }
    
    public Erro(String msg){
        super(msg);
    }
}
