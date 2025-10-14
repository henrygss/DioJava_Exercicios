package conta;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(int numero){
        super(numero);
    };

    protected void sacar(double valor){
            //Taxa de saque de R$1.00
            double valorComTaxa = valor + 1;

            if (valorComTaxa > getSaldo()){
                System.out.println("Saldo insuficiente");
            }else{
                debitar(valorComTaxa);
            }
    }
}
