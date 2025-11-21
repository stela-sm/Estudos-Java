//Enunciado: 127. Fazer um programa para criar um arquivo em Java.

import  java.io.File;

public class Main{
    public static void main (String[] args){
        String caminho = "art.txt";
        File f = new File(caminho);
        try{
            if(f.createNewFile()){

            System.out.println("Arquivo Criado");
            }else{
                 System.out.println("Arquivo já existe");
            }
        }catch(Exception error){
            System.out.println(error);
        }
    }
}