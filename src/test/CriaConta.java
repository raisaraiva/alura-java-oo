package test;

import model.Conta;

public class CriaConta {

    public static void test() {
        Conta contaA = new Conta(1, 1);

        contaA.deposita(200);

        System.out.println("Saldo da conta (A) após depositar 200 reais: " + contaA.getSaldo());

        contaA.deposita(100);

        System.out.println("Saldo da conta (A) após depositar 200 reais " + contaA.getSaldo());

        Conta contaB = new Conta(1, 2);

        contaB.deposita(50);

        System.out.println("Saldo da conta (B) após depositar 50 reais " + contaB.getSaldo());
    }
}