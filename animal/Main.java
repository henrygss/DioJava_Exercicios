import animal.Animal;
import animal.Cachorro;
import animal.Gato;

public class Main {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        animal.fazerSom();

        Animal cachorro = new Cachorro();
        cachorro.fazerSom();

        Animal gato = new Gato();
        gato.fazerSom();

    }
    
}
