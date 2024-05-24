import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

      Scanner terminal=new Scanner(System.in);
      int numero1;
      int numero2; 
      
      System.out.println("Informe os numeros a serem contados:\n");
      numero1=terminal.nextInt();
      numero2=terminal.nextInt();

      contar(numero1, numero2);
    }

    static void contar(int parametro1, int paramentro2) throws ParametrosInvalidosException{
        if (parametro1 > paramentro2) {
            throw new ParametrosInvalidosException();
        }
        for(int i=parametro1; i<=paramentro2; i++){
            System.out.println("Imprimindo o numero "+i);
        }
    }
}
