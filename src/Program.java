import test.*;

public class Program {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("CriaConta");
        System.out.println("--------------------------------");
        CriaConta.test();
        System.out.println("--------------------------------");
        System.out.println("CriaCliente");
        System.out.println("--------------------------------");
        CriaCliente.test();
        System.out.println("--------------------------------");
        System.out.println("Saque");
        System.out.println("--------------------------------");
        Saque.test(100, 50);
        System.out.println("--------------------------------");
        System.out.println("Transferencia");
        System.out.println("--------------------------------");
        Transferencia.test(100, 50);
        System.out.println("--------------------------------");
    }
}
