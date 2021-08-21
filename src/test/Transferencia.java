package test;

import model.Conta;

public class Transferencia {

    public static void test(double deposita, double transferencia) {
        Conta contaA = new Conta(1, 5);
        Conta contaB = new Conta(1, 6);

        contaA.deposita(deposita);

        System.out.println("Saldo antes da transferência");
        System.out.println("Conta (A): " + contaA.getSaldo());
        System.out.println("Conta (B): " + contaB.getSaldo());

        boolean sucessoTransferencia = contaA.transferencia(transferencia, contaB);

        if (sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso.");
            System.out.println("Saldo após da transferência");
            System.out.println("Conta (A): " + contaA.getSaldo());
            System.out.println("Conta (B): " + contaB.getSaldo());
        } else {
            System.out.println("Crédito insuficiente.");
        }
    }
}