    //programa que lança dados simulando o jogo de azar "craps"  
    package td02;
 
    import java.util.Random;  
      
    public class Craps  
    {  
        private Random objetodado = new Random(); //crie o objeto  
      
        private enum Status {CONTINUE, GANHOU, PERDEU};//uso o recuro enumeracao constantes  
      
        /*Status eh um novo tipo do java2 da classe enum.    
     
         
        /* aqui criei variaveis constantes que os numero representa 
        a soma dos dois lados */   
          
        private final static int R1 = 2;  
        private final static int R2 = 3;  
        private final static int R7 = 7;  
        private final static int R11 = 11;  
        private final static int R12 = 12;  
          
        public void inicio() // inicia a brincadeira  
        {  
          
        int pontuacao = 0;  
          
        Status jogo; //aqui diz se continua, ganha ou perde.  
          
        int somadados = calculodados(); //recebe o valor do metodo que soma os dados  
          
        switch(somadados)  
        {  
        case R7:  
        case R11:  
        jogo = Status.GANHOU;  
        break;  
      
        case R1:  
        case R2:  
        case R12:  
        jogo = Status.PERDEU;  
        break;  
      
        default:  
        jogo = Status.CONTINUE;  
        pontuacao = somadados;  
        System.out.printf("Pontuacao:%d\n", pontuacao);  
        break;  
        }  
      
      
        while (jogo == Status.CONTINUE)  
        {  
        somadados = calculodados();  
          
        if(somadados == pontuacao)  
            jogo = Status.GANHOU; //ganhou por pontuacao.  
        else  
            if (somadados == R7)  
            jogo = Status.PERDEU; //perde se  tirar 7 antes da pontuação.  
        }  
      
      
        if (jogo == Status.GANHOU)  
        System.out.println("voce ganhou");  
        else  
        System.out.println("Voce Perdeu");  
    }  
      
      
        public int calculodados()  
        {  
          
        int dado1 = 1 + objetodado.nextInt(6);  
        int dado2 = 1 + objetodado.nextInt(6);  
      
        int soma = dado1 + dado2;  
      
        System.out.printf("A soma dos dados %d + %d = %d\n", dado1,dado2,soma);  
        return soma;  
        }  
    }  



/*classe principal */

    class Crapstest  
    {  
    public static void main(String args[])  
    {  
      
        Craps jogo = new Craps();  
          
        jogo.inicio();  
          
        }  
    }  
      
    /* classe principal que chama a outra class com os metodos invocados!! */ 