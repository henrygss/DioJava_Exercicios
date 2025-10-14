import veiculo.Carro;
import veiculo.Veiculo;
import veiculo.Bicicleta;

public class Main{
    public static void main(String[] args) {
        
        Veiculo bicicleta = new Bicicleta();

        bicicleta.mover();

        Veiculo carro = new Carro();
        carro.mover();

    }
    
}
