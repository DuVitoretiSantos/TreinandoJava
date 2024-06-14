import javax.swing.*;

public class Main{
    public static void main(String[] args){
        TelaMilkShakespeareEmpreendimentos t = new TelaMilkShakespeareEmpreendimentos();
        t.setContentPane(t.painelPrincipal);
        t.setTitle("MilkShakespeare Simulator");
        t.setSize(400, 300);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}