package Tabuada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um número: ");

        int numero = scanner.nextInt();

        System.out.println("O número digitado foi " + numero);

        tabuada(numero);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Insira um número válido");
        }
        finally{
            scanner.close();
        }

        

    }

    static void tabuada(int num)
    {
        int multiplicador = 1;
        int resultado = 0;
        for (int i = 1; i <= 10; i++)
        {
            resultado = num * multiplicador;
            multiplicador++;
            System.out.println(num + " multiplicado por " + i + " é igual a: " + resultado);
        }
    }
}
