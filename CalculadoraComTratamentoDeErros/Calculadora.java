package CalculadoraComTratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Digite um número: ");
        
            float numeroUm = scanner.nextFloat();

            System.out.println("Digite outro número: ");

            float numeroDois = scanner.nextFloat();

            System.out.println("Escolha uma das operações : + - * / ");

            String operador = scanner.next();

            switch(operador)
            {
                case "+":
                {
                    System.out.println(numeroUm + numeroDois);
                    break;
                }
                case "-":
                {
                    System.out.println(numeroUm - numeroDois);
                    break;
                }
                case "*":
                {
                    System.out.println(numeroUm * numeroDois);
                    break;
                }
                case "/":
                {
                    try
                    {
                        if (numeroDois == 0)
                        {
                            throw new ArithmeticException("Não é possível dividir um número por zero");
                        }
                        System.out.println(numeroUm / numeroDois);
                    }
                    catch(ArithmeticException e)
                    {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                }
                default:
                {
                    System.out.println("Entrada inválida. Use apenas: + - * / ");
                    break;
                }   
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Entrada inválida. Digite um número");
        }
        finally{
            scanner.close();
        }
    }
}
