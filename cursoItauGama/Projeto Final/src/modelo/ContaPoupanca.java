package modelo;

public class ContaPoupanca extends Conta{
	
	private static double taxaOperacao = 0.2; 

    public ContaPoupanca(int numero) {
        super(numero, taxaOperacao);
    }

    public static void setTaxaOperacao(double novaTaxa) { 
        taxaOperacao = novaTaxa;
    }

    @Override
    public boolean saque(double valor) {
        if (valor + taxaOperacao <= getSaldo()) {
            return super.saque(valor + taxaOperacao);
        }
        return false; 
    }

    @Override
    public String toString() {
        return "CP: " + super.toString() + " taxa: " + taxaOperacao;
    }

}
