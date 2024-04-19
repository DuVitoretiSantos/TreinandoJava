// METODOS
//
//
//import javax.swing.*;
//
//public class Main{
//    static void escrever(String texto){
//        JOptionPane.showMessageDialog(null,texto);
//    };
//
//    static float calculoMedia(int notaUm, int notaDois){
//        float soma = (float) notaUm+notaDois;
//        return soma/2;
//    };
//
//    public static void main(String[] args){
//        escrever("Oi dudu");
//        float valor = calculoMedia(5, 7);
//        System.out.println("Media: " + valor);
//    }
//}

// Classes

//public class Main{
//    public static void main(String[] args) {
//        int idadePessoa = 25;
//        Pessoa p = new Pessoa(idadePessoa);
//        System.out.println(p.getIdade());
//
//        System.out.println("Nome: " + p.getNome());
//        System.out.println("Idade: " + p.getIdade());
//    }
//}

import java.util.ArrayList;
import  javax.swing.*;

public class Main{
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args){
        for(int i = 0;i < 3; i++){
            String nome = JOptionPane.showInputDialog(null, "Nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade: "));

            Pessoa p = new Pessoa(nome, idade);
            pessoas.add(p);
            System.out.println(pessoas.get(i).getUser());

        }
        // FOR DE INTERAÇÃO AUTOMATICA

        //for(Pessoa elemento : pessoas){
        //    System.out.println((pessoas.indexOf(elemento)+1));
        //    System.out.println(elemento.getUser());
        //    System.out.println("===================");
        //}
    };
};




