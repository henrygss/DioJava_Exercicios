package conta;

public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(int numero){
        super(numero);
    }

    public void sacar(double valor){
        double saldo = getSaldo();
        if (valor > saldo){
            System.out.println("O valor para saque é maior que o saldo disponível");
        }else{
            saldo -= valor;
        }
    }
}
