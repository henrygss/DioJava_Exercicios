package CalculadoraDeMedia;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try
        {
            System.out.println("Digite o primeiro número: ");
            float numeroUm = scanner.nextFloat();

            System.out.println("Digite o segundo número: ");
            float numeroDois = scanner.nextFloat();

            System.out.println("Digite o terceiro número: ");
            float numeroTres = scanner.nextFloat();

            calcularMedia(numeroUm, numeroDois, numeroTres);
        }
        catch(InputMismatchException  e)
        {
            System.out.println("Você deve digitar números válidos (ex: 7.5)");
        }
        finally
        {
            scanner.close();
        }
      
    }

    static void calcularMedia(float numero1, float numero2, float numero3)
    {
        float media = (numero1 + numero2 + numero3)/3;

        System.out.println("A média dos números é: " + media);

        situacao(media);
    }


    static void situacao(float media)
    {
        if (media > 7)
        {
            System.out.println("Aprovado");
        }
        else if (media >= 4 && media <= 7 )
        {
            System.out.println("Recuperação");
        }
        else
        {
            System.out.println("Reprovado");
        }
    }

}
