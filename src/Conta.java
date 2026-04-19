public class Conta {
    private String nome;
    private int agencia;
    protected double saldo;

    public Conta(String nome, int agencia, double saldo) {
        this.nome = nome;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s | Agencia: %04d | Saldo: %.2f %n", this.getNome(), this.getAgencia(), this.getSaldo());
    }

    public void saldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Operação não realizada.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


}