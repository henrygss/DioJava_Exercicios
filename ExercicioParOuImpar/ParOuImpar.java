import java.util.Scanner;

public class ParOuImpar
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        try
        {
            System.out.println("Digite um número para verificar se é par ou ímpar");
            numero = scanner.nextInt();

            System.out.println("O número digitado foi: " + numero);

            if (numero % 2 == 0)
            {
                System.out.println("Este número é par");
            }
            else
            {
                System.out.println("Este número é ímpar");
            }
        }
        finally
        {
            scanner.close();
        }
    }

}