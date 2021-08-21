package test;

import model.Conta;

public class Saque {

    public static void test(double deposita, double saque) {
        Conta conta = new Conta(1, 4);

        conta.deposita(deposita);

        System.out.println("Saldo antes do saque: " + conta.getSaldo());

        boolean conseguiuRetirar = conta.saque(saque);

        if (conseguiuRetirar) {
            System.out.println("Saque realizada com sucesso.");
            System.out.println("Saldo após o saque: " + conta.getSaldo());
        } else {
            System.out.println("Crédito insuficiente.");
        }
    }
}