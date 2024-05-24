// AULA EXPLICAÇÃO!
//
//public class Pessoa {
//    private String nome;
//    private int idade;
//
//   public Pessoa(String n, int i) {
//       this.nome = n;
//       this.idade = i;
//   }
//
//    public Pessoa(int num){
//      this.idade = num;
//    }
//
//    public Pessoa(long idade){
//        this.idade = (int) idade;
//    }
//
//    public void setIdade(int i){
//        this.idade = i;
//    }public int getIdade(){
//        return this.idade;
//    };
//    public void setNome(String t){
//        this.nome = t;
//    };
//    public String getNome(){
//        return this.nome;
//    };
//
//
//
//}

// EXERCICIO

import javax.swing.*;
public class Pessoa{

    private String nome;
    private int idade;

    public Pessoa(String n, int i){
        this.nome = n;
        this.idade = i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUser(){
        return "Nome: " + nome + "\nIdade: " + idade;
    }
}