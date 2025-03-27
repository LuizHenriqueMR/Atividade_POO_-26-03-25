public class ContaCorrente {

    String nomeDoDonoDaConta;
    String cpfDoDono;
    int numeroDaConta;
    double saldoDaConta;
    String nomeDaAgencia;

    public ContaCorrente(String nomeDoDono, String cpfDoDono, int numeroDaConta, double saldoInicial, String nomeDaAgencia) {
        this.nomeDoDonoDaConta = nomeDoDono;
        this.cpfDoDono = cpfDoDono;
        this.numeroDaConta = numeroDaConta;
        this.saldoDaConta = saldoInicial;
        this.nomeDaAgencia = nomeDaAgencia;
    }

    public boolean sacarDinheiro(double valorASacar) {
        if (valorASacar > 0 && saldoDaConta >= valorASacar) {
            saldoDaConta = saldoDaConta - valorASacar;
            return true;
        }
        return false;
    }

    public void depositarDinheiro(double valorADepositar) {
        if (valorADepositar > 0) {
            saldoDaConta = saldoDaConta + valorADepositar;
        }
    }

    public boolean transferirDinheiro(ContaCorrente contaDestino, double valorATransferir) {
        if (contaDestino != null && valorATransferir > 0 && saldoDaConta >= valorATransferir) {
            sacarDinheiro(valorATransferir);
            contaDestino.depositarDinheiro(valorATransferir);
            return true;
        }
        return false;
    }

    public double pegarSaldo() {
        return saldoDaConta;
    }

    public int pegarNumeroDaConta() {
        return numeroDaConta;
    }

    public String pegarNomeDoDono() {
        return nomeDoDonoDaConta;
    }

    public String pegarCpfDoDono() {
        return cpfDoDono;
    }

    public String pegarNomeDaAgencia() {
        return nomeDaAgencia;
    }
}
