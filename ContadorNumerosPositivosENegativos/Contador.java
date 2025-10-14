package ContadorNumerosPositivosENegativos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            int contaNegativo = 0, contaPositivo = 0, contaZero = 0;

            for (int i = 1; i <= 10; i++ )
            {
                System.out.println("Digite um número:");
                long numero = scanner.nextLong();

                if (numero < 0)
                {
                    System.out.println("O número " + numero + " é negativo");
                    contaNegativo +=1;
                }
                else if (numero > 0)
                {
                    System.out.println("O número " + numero + " é positivo");
                    contaPositivo += 1;
                }
                else
                {
                    System.out.println("O número é " + numero);
                    contaZero +=1;
                }
                
            }

            System.out.println("Existem " + contaNegativo + " números negativos");
            System.out.println("Existem " + contaPositivo + " números positivos");
            System.out.println("Existem " + contaZero + " números zero");
    }
    catch (InputMismatchException e)
    {
        System.out.println("Você deve inserir um número");
    }
    finally{
        scanner.close();
    }

    }

       
   
}
