public class ContaTerminal {
    int numeroDaConta;
    int agencia;
    String nomeCliente;
    Double saldo;

    public ContaTerminal(int agencia, int numeroDaConta, String nomeCliente, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = "Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroDaConta + " e o seu saldo " + saldo + " já está disponível para saque.";
        return s;

    }
}
