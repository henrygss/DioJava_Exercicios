package CalculadoraDinamica;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Calculadora {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList<>();
        boolean sair = false;
        int contadorNotas = 0;
        int somarNumeros = 0;

        System.out.println("Digite aqui de 1 a 10 notas para calcular a média");
        System.out.println("Quando não houver mais notas, digite 'fim' para calcular a média");

        do{
            System.out.println("Digite uma nota: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("fim"))
                {
                    sair = true;
                    break;
                }

            try{
                int numero = Integer.parseInt(entrada);

                if (numero >= 0 && numero <= 10)
                {
                    notas.add(numero);
                    somarNumeros+= numero;
                    contadorNotas++;
                }else{
                    System.out.println("Nota inválida. Digite um número entre 0 e 10");
                }
               
                                
            }catch(NumberFormatException e)
            {
                System.out.println("Entrada inválida. Digite um número entre 1 e 10 ou 'fim'.");
            }
        }while (notas.size() < 10);

        scanner.close();

        System.out.println("Suas notas: " + notas);

        if (! notas.isEmpty())
        {
        System.out.println("Média das notas " + ((float) somarNumeros/notas.size()));
        }else{
            System.out.println("Nenhuma nota válida foi digitada");
        }        

    }
}
