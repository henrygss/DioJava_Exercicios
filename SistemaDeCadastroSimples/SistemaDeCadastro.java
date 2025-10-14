package SistemaDeCadastroSimples;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class  SistemaDeCadastro {
    public static void main(String[] args) {

        boolean sair = false;

        ArrayList<String> listaNomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in, "UTF-8");



        try{
            do{

                System.out.println("SISTEMA DE CADASTRO SIMPLES");
                System.out.println("Escolha uma das opções: ");
                System.out.println("1. Cadastrar nome");
                System.out.println("2. Listar nomes");
                System.out.println("3. Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine();

                if (escolha == 1){
                    System.out.println("Digite um nome para cadastrar: ");
                    String nome = scanner.nextLine();

                    if(ehNomeValido(nome))
                    {
                    listaNomes.add(nome);
                    System.out.println("Nome cadastrado com sucesso");
                    }else {
                        System.out.println("Erro: nomes não podem conter números. Tente novamente");
                    }



                }else if (escolha == 2){
                    System.out.println("Imprimindo lista dos nomes cadastrados:");
                    for (String nomeCadastrado : listaNomes)
                    {
                        System.out.println(nomeCadastrado);
                    }
                    
                    
                }else if (escolha == 3){
                    System.out.println("Saindo do programa");
                    sair = true;
                }else{
                    System.out.println("Entrada inválida. Escolha uma das opções");
                }
            }while (sair == false );
            }catch (InputMismatchException e) 
             {
                System.out.println("Entrada inválida. Digite apenas nomes");
            }finally{
                scanner.close();
            }
    }

    public static boolean ehNomeValido(String nome)
    {
        return !nome.matches(".*\\d.*");
    }
}
