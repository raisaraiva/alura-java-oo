package test;

import model.Cliente;
import model.Conta;

public class CriaCliente {

	public static void test() {
		Cliente cliente = new Cliente();

		cliente.setNome("José Maria");
		cliente.setCpf("111.111.111-11");
		cliente.setProfissao("Programador");

		Conta conta = new Conta(1,3);

		conta.deposita(100);

		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());
	}
}