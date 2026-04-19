public class ContaPoupanca extends Conta{
    public ContaPoupanca (String nome, int agencia, double saldo) {
        super(nome, agencia, saldo);
    }

    public void aplicarRendimento(double taxa){
        if (taxa > 0){
            double valorRendimento = this.saldo * (taxa/100);
            this.saldo += valorRendimento;
            System.out.println("Rendimento de " + valorRendimento + " aplicado com sucesso.");
        } else {
            System.out.println("Procedimento inválido");
        }
    }




}
