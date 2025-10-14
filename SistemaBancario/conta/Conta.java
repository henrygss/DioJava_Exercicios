package conta;

abstract class Conta{

    private int numero;
    private double saldo;

    protected Conta(int numero){
        this.numero = numero;
        this.saldo = 0.0;
    };

    public void depositar(double valor){

        saldo+= valor;
    }

    abstract void sacar(double valor);

    public double getSaldo(){
        return saldo;
    }

    public int getNumConta(){
        return numero;
    }

    //Métodos protegidos para subclasses
    protected void debitar(double valor){
        this.saldo -= valor;
    }

    protected void creditar(double valor){
        this.saldo += valor;
    }
    

}