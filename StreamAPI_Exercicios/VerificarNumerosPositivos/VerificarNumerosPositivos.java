import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarNumerosPositivos {
    public static void main(String [] args) {

        List<Integer> numeros = Arrays.asList(1, -2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> ehPositivo =  numero -> numero >= 0;

        //O método .allMatch() retorna true apenas se todos os elementos satisfizerem o Predicate(n >= 0)

        boolean todosPositivos = numeros.stream().allMatch(ehPositivo);

        if (todosPositivos){
            System.out.println("Todos os números são positivos");
        }else{
            System.out.println("Existem números negativos na lista");
        }




    }
}
