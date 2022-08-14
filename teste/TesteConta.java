package teste;

import conta.ContaBancaria;
import conta.ContaEspecial;
import conta.ContaPoupanca;

public class TesteConta {

    public static void main(String[] args) {

        System.out.println("*** Teste Conta Bancaria ***");
        //teste conta
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta simples");
        contaSimples.setNumConta("1111");

        // teste deposito
        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        // Conta Poupança
        System.out.println("*** Teste Conta Poupança ***");

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente conta Poupança");
        contaPoupanca.setNumConta("22222");
        contaPoupanca.setDiaRendimento(2);

        // teste deposito
        // teste deposito
        contaPoupanca.depositar(100);

        realizarSaque(contaPoupanca, 50);
        realizarSaque(contaPoupanca, 70);

        if (contaPoupanca.calcularNovoSaldo(0.2)) {
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento.");
        }

        System.out.println(contaPoupanca);

        // Conta especial
        System.out.println("*** Teste Conta Especial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente conta Especial");
        contaEspecial.setNumConta("33333");
        contaEspecial.setLimite(500);

        // teste deposito
        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);
        realizarSaque(contaEspecial, 70);
        realizarSaque(contaEspecial, 80);

        System.out.println(contaEspecial);
    }

    private static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo= " + conta.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + " saldo de =" + conta.getSaldo());
        }
    }

}