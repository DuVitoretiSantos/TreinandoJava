import javax.swing.*;


public class Main{

    public static void main(String[] args){

        TelaHome t = new TelaHome();
      t.setContentPane(t.container);
      t.setVisible(true);
      t.setTitle("DuMarket");
      t.setSize(400, 400);
      t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}