package JogoDeAdvinhacao;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;
public class Advinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            int numeroTentativas = 1;
            boolean acertou = false;

            Random random = new Random();

            int numeroMaquina = random.nextInt(101);


            System.out.println("Tente advinhar um número de 0 a 100 gerado pelo programa: ");


            //Enquanto acertou for false, faça...
            while (! acertou)
            {
                System.out.println("Digite seu palpite: ");
                String entrada = scanner.next();

                try{
                    int numeroUsuario = Integer.parseInt(entrada);
                    numeroTentativas++;

                    if (numeroUsuario == numeroMaquina)
                    {
                        System.out.println("Você acertou na " + numeroTentativas + "ª tentativa");
                        acertou = true;
                    }
                    else if (numeroMaquina > numeroUsuario)
                    {
                        System.out.println("Você errou. O número a ser advinhado é maior");
                    }
                    else
                    {
                        System.out.println("Você errou. O número a ser advinhado é menor");
                    }
                }catch (InputMismatchException e)
                {
                    System.out.println("Entrada inválida. Digite apenas números");
                }
            }
        }finally{
            scanner.close();
        }
    }
}




        



