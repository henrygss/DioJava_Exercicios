package ValidacaoDeCpf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacaoDeCpf {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Insira seu CPF: ");
        String cpf = scanner.nextLine();

        //Se o cpf não for composto apenas por números, dispara a exceção
        if (! cpf.matches("\\d+")){
            throw new InputMismatchException("O CPF deve conter apenas números");
        }
        
        validarCpf(cpf);

        }catch (InputMismatchException e){
            System.out.println("Erro: " + e.getMessage());
        }catch(CpfInvalidoException e)
        {
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            scanner.close();
        }        
    }

    public static void validarCpf(String CPF) throws CpfInvalidoException
    {

        if (!CPF.matches("\\d{11}"))
        {
            throw new CpfInvalidoException ("O cpf deve conter exatamente 11 dígitos numéricos");
        }
        //Utilizando o método matches
        else
        {
            String formatado = CPF.substring(0, 3) + "." +
            CPF.substring(3,  6) + "." +
            CPF.substring(6, 9) + "-" +
            CPF.substring(9, 11);

            System.out.println("CPF formatado: " + formatado);

            //Utilizando replaceAll
            /*String formatado = CPF.replaceAll("(\\d{3}) (\\d{3}) (\\d{3}) (\\d{2})", "$1. $2. $3-$4"), formatado);
            System.out.println("CPF formatado: " + formatado);*/

        }  
    }

}
