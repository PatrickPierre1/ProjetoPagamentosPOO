package bancos;

public class Sicredi extends Banco{
    @Override
    public void operacaoFinanceira() {
        System.out.println("Agencia: "+ getAgencia() + " | " + "Conta Corrente: " + getContaCorrente() + " | " + " Operação financeira de crédito");
    }
}
