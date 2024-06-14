import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaMilkShakespeareEmpreendimentos extends JFrame{
    public JPanel painelPrincipal;
    private JButton juniorButton;
    private JButton plenoButton;
    private JButton seniorButton;
    private JLabel pedidosTxt;
    private JButton livroButton;
    private JButton milkButton;
    private JTextField milkTamInput;
    private JTextField nomeLivroInput;
    private JTextField saborMilkInput;

    private int id;
    public String textoPedidos;


    ArrayList<Pedido> pedidos = new ArrayList<>();
    public TelaMilkShakespeareEmpreendimentos() {
        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = (int) Math.floor(Math.random() * (999 - 100) + 100);
                for(Pedido p : pedidos){
                    if(p.getId() == id){
                        while(id == p.getId()){
                            p.setId(id);
                        }
                    }
                }
                if(!nomeLivroInput.getText().isEmpty())
                {
                    Livro l;
                    l = new Livro( nomeLivroInput.getText(), "Livro", id);
                    pedidos.add(l);
                    JOptionPane.showMessageDialog(null, "Pedido realizado.");
                    System.out.println(l.getNome());
                }else{
                    JOptionPane.showMessageDialog(null,"ERRO: Escreva o nome do livro");
                }
            }
        });

        milkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = (int) Math.floor(Math.random() * (999 - 100) + 100);
                for(Pedido p : pedidos){
                    if(p.getId() == id){
                        while(id == p.getId()){
                            p.setId(id);
                        }
                    }
                }
                if(!saborMilkInput.getText().isEmpty() && !milkTamInput.getText().isEmpty())
                {
                    Milkshake m;
                    m = new Milkshake(id,"Milkshake", milkTamInput.getText(), saborMilkInput.getText());
                    pedidos.add(m);
                    JOptionPane.showMessageDialog(null, "Pedido realizado.");
                    System.out.println(m.getSabor());
                }else{
                    JOptionPane.showMessageDialog(null,"ERRO: Escreva o sabor e tamanho");
                }



                textoPedidos = "";

                for(int i = 0; i < pedidos.size();i++){
                    if(pedidos.get(i) instanceof Milkshake){

                        Milkshake ms = (Milkshake) pedidos.get(i);
                        textoPedidos +=
                                "TIPO: " + ms.getTipo() + "\nSABOR: " + ms.getSabor() + "TAMANHO: "{ms.getTamanho()}ID: " + ms.getId();
                    }
                }

                pedidosTxt.setText(textoPedidos);

            }
        });
    }
}
