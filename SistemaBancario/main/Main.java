package main;

import java.util.ArrayList;

import conta.ContaCorrente;
import conta.ContaPoupanca;


public class Main {
    public static void main(String [] args){

        ArrayList listaContas = new ArrayList();

        /*ContaCorrente conta01 = new ContaCorrente(1234);
        System.out.println(conta01.getNumConta());
        System.out.println(conta01.getSaldo());
        conta01.depositar(50.0);
        System.out.println(conta01.getSaldo());
        conta01.sacar(100);
        //o chat não disse pra tratar a condição de saque em ContaCorrente caso o valor fosse maior que o saldo
        //Por isso o resultado -49, decrescido de R$1.00 da taxa
        System.out.println(conta01.getSaldo()); 

        listaContas.add(conta01);*/

        ContaPoupanca conta02 = new ContaPoupanca(4321);
        System.out.println(conta02.getNumConta());
        System.out.println(conta02.getSaldo());
        conta02.depositar(150.0);
        System.out.println(conta02.getSaldo());
        //Condição tratada caso valor de saque seja maior que o saldo disponível
        conta02.sacar(151);
        
        conta02.sacar(100);
        System.out.println(conta02.getSaldo());
        System.out.println(conta02.getSaldo());

        listaContas.add(conta02);

        System.out.println(listaContas);



        
    }
}
