package Exercício94;

public class EmailNotificacao implements Notificavel{
    private String email;

    EmailNotificacao(String email){
        this.email = email;
    }

    @Override
    public String enviarNotificacao(String mensagem){
        return "Enviando o seguinte e-mail à " + email + ": " + mensagem;

    }
}
