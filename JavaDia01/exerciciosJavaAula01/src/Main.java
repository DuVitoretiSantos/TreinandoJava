import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Exercicio 1

        //String numtext = JOptionPane.showInputDialog("Digite um numero: ");
        //int numero = Integer.parseInt(numtext);

        //if(numero == 0){
            //JOptionPane.showMessageDialog(null, "O numero digitado é nulo!");
       // }else if(numero > 0){
            //JOptionPane.showMessageDialog(null,"O numero digitado é positivo");
        //}else{
           //JOptionPane.showMessageDialog(null, "O numero digitado é negativo");
        //};

        //Exercicio 2

       // String anoText = JOptionPane.showInputDialog(null,"Em que ano estamos? ");
       // int ano = Integer.parseInt(anoText);

       // if(ano%4 == 0){
       //     JOptionPane.showMessageDialog(null,"Este ano é bissexto!");
       // }else{
       //     JOptionPane.showMessageDialog(null,"Este ano não é bissexto!");
       // }

        // Exercicio 3

        // NÃO CONSEGUI COMPLETAR!
        //COMPLETAR EM CASA!

        String textLadoTriUm = JOptionPane.showInputDialog(null, "Medida triangulo Lado 1: ");
        String textLadoTriDois = JOptionPane.showInputDialog(null, "Medida Traingualo Lado 2: ");
        String textLadoTriTres = JOptionPane.showInputDialog(null, "Medida Triangulo Lado 3: ");

        int ladoTriUm = Integer.parseInt(textLadoTriUm);
        int ladoTriDois = Integer.parseInt(textLadoTriDois);
        int ladoTriTres = Integer.parseInt(textLadoTriTres);

        if(ladoTriUm == ladoTriDois && ladoTriUm == ladoTriTres || ladoTriDois == ladoTriUm && ladoTriDois == ladoTriTres || ladoTriTres == ladoTriUm && ladoTriTres == ladoTriDois){
            JOptionPane.showMessageDialog(null, "Este triangulo é equilátero!");
        }else if(ladoTriUm != ladoTriDois && ladoTriUm != ladoTriTres){
            JOptionPane.showMessageDialog(null, "Este triangulo é escaleno!");
        }else{
            JOptionPane.showMessageDialog(null, "Este triangulo é isósceles!");
        }


    }
}