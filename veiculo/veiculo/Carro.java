package veiculo;


public class Carro implements Veiculo {
    
    @Override
    public void mover(){
        System.out.println("O carro está se movendo usando um motor");
    }
}
