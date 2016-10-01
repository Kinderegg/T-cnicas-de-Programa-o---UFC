package TD04;

public class Questão1_erro extends Exception{
    
    public Questão1_erro(){
        super("Erro.. O número escolhido não pode ser negativo!!");
    }
    
    public Questão1_erro(String msg){
        super(msg);
    }
}
