//130. Fazer um programa para mostrar informações de um arquivo em Java.

import java.io.File;
public class Main {
    public static void main (String[] args){
        try {
            File f = new File("art.txt");
            System.out.println("===INFORMAÇÕES DO ARQUIVO art.txt===");
            System.out.println("Nome: "+ f.getName());
            System.out.println("Caminho absoluto: " + f.getAbsolutePath());
            System.out.println("Tamanho: " + f.length()+" bytes");

        } catch (Exception e) {
        }
    }
}
