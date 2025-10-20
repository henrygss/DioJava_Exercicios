import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListaOrdemNumerica{
    static void main() {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,5,4,3);

        for (Object o : numeros.stream().sorted().toArray()) {
            System.out.println(o);
        }


    }
}