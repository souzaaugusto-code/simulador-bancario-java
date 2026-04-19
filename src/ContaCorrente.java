public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String nome, int agencia, double saldo, double limite) {
        super(nome, agencia, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            return true;
        } else return false;
    }
}
