package Exercício94;

/*Enunciado:Crie uma interface Notificavel com um método void enviarNotificacao(String mensagem).
Implemente em duas classes:

·       EmailNotificacao: Envia uma mensagem por e-mail.

·       SMSNotificacao: Envia uma mensagem por SMS.

*
 */

public class Main {
    public static void main(String[] args) {
        EmailNotificacao emailNot = new EmailNotificacao("email@gmail.com");
        SMSNotificacao smsNot = new SMSNotificacao("11999999999");

        System.out.println("======EMAIL======");
        System.out.println(emailNot.enviarNotificacao("Este é um e-mail."));
        System.out.println();
        System.out.println("======SMS=====");
        System.out.println(smsNot.enviarNotificacao("Este é um SMS."));

    }
}
