package bandeiras;

import bancos.Banco;

public class American implements Cartao{
    @Override
    public void operacao(Banco banco) {
        System.out.println("Voce está utilizando seu cartão American!");
    }
}
