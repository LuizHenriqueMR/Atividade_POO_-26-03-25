public class ContaCorrente {
   
    private String nomeTitular;
    private String cpfTitular;
    private int numeroConta;
    private double saldo;
    private String agencia;

    
    public ContaCorrente(String nomeTitular, String cpfTitular, int numeroConta, double saldo, String agencia) {
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false; 
        }
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

   
    public boolean transferir(ContaCorrente destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            sacar(valor);
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

  
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public String getAgencia() {
        return agencia;
    }
}
