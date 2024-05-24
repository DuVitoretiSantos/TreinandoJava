import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Hello World do Swing :D");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        System.out.println(idade);

        System.out.println(JOptionPane.showConfirmDialog(null,"Tem Certeza?"));

        if(JOptionPane.showConfirmDialog(null, "Tem Certeza?") == 0){

            JOptionPane.showMessageDialog(null, "Salvo!");
        };
    }
}