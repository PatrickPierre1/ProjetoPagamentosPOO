package pagamentos;

import bancos.Banco;
import bancos.Sicredi;
import bandeiras.American;
import bandeiras.Cartao;
import bandeiras.Hipercard;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.println("API de Pagamentos");
        var s = new Scanner(System.in);
        var escolha = "";

        Banco banco = new Sicredi();
        Cartao american =  new American();
        Cartao hipercard = new Hipercard();

        System.out.println("Digite qual agência");
        banco.setAgencia(s.nextLine());

        System.out.println("Digite qual conta corrente");
        banco.setContaCorrente(s.nextLine());

        do{
            System.out.println("Escolha seu cartão! Hipercard ou American");
            escolha = s.nextLine();

            if("Hipercard".equals(escolha)) {
                realizarOperacao(banco, hipercard);
            }
            else if ("American".equals(escolha)) {
                realizarOperacao(banco, american);
            }
            System.out.println("Deseja continuar? Sim | Não");

        }while(s.nextLine().equals("Sim"));
        System.out.println("Sessão Encerrada");
    }
    private static void realizarOperacao(Banco banco, Cartao cartao) {
        cartao.operacao(banco);
        banco.operacaoFinanceira();
    }
}
