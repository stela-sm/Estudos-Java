package Exercício94;

public class SMSNotificacao implements Notificavel {
    private String telefone;

    SMSNotificacao(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String enviarNotificacao(String mensagem) {
        return "Enviando a seguinte mensagem à " + telefone + ": " + mensagem;

    }
}