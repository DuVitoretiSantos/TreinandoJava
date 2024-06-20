import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListResourceBundle;

public class TelaMilkShakespeareEmpreendimentos extends JFrame{
    public JPanel painelPrincipal;
    private JButton juniorButton;
    private JButton plenoButton;
    private JButton seniorButton;
    private JButton livroButton;
    private JButton milkButton;
    private JTextField milkTamInput;
    private JTextField nomeLivroInput;
    private JTextField saborMilkInput;
    private JTextArea textArea1;

    private int id;
    public String textoPedidos;


    ArrayList<Pedido> pedidos = new ArrayList<>();
    public TelaMilkShakespeareEmpreendimentos() {
        livroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!nomeLivroInput.getText().isEmpty())
                {
                    Livro l;
                    l = new Livro( nomeLivroInput.getText(), "Livro", id);
                    pedidos.add(l);
                    System.out.println(l.getNome());

                    id = (int) Math.floor(Math.random() * (999 - 100) + 100);
                    for(Pedido p : pedidos){
                        if(p.getId() == id){
                            while(id == p.getId()){
                                p.setId(id);
                            }
                        }
                    }

                    textoPedidos = "";

                    textoPedidos = "";

                    for(int i = 0; i < pedidos.size();i++){
                        if(pedidos.get(i) instanceof Milkshake){
                            Milkshake ms = (Milkshake) pedidos.get(i);
                            textoPedidos +=
                                    "\n\nTIPO: " + ms.getTipo() + "\nSABOR: " + ms.getSabor() + "\nTAMANHO: " + ms.getTamanho() + "\nID: " + ms.getId();
                        }else if(pedidos.get(i) instanceof Livro){
                            Livro lv = (Livro) pedidos.get(i);
                            textoPedidos +=  "\n\nNOME: " + lv.getNome() + "\nTIPO: " + lv.getTipo() + "\nID: " + lv.getId();
                        }
                    }

                    textArea1.setText(textoPedidos);



                }else{
                    JOptionPane.showMessageDialog(null,"ERRO: Escreva o nome do livro");
                }
            }
        });

        milkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!saborMilkInput.getText().isEmpty() && !milkTamInput.getText().isEmpty())
                {
                    Milkshake m;
                    m = new Milkshake(id,"Milkshake", milkTamInput.getText(), saborMilkInput.getText());
                    pedidos.add(m);
                    System.out.println(m.getSabor());

                    id = (int) Math.floor(Math.random() * (999 - 100) + 100);
                    for(Pedido p : pedidos){
                        if(p.getId() == id){
                            while(id == p.getId()){
                                p.setId(id);
                            }
                        }
                    }

                    textoPedidos = "";

                    for(int i = 0; i < pedidos.size();i++){
                        if(pedidos.get(i) instanceof Milkshake){
                            Milkshake ms = (Milkshake) pedidos.get(i);
                            textoPedidos +=
                                    "\n\nTIPO: " + ms.getTipo() + "\nSABOR: " + ms.getSabor() + "\nTAMANHO: " + ms.getTamanho() + "\nID: " + ms.getId();
                        }else if(pedidos.get(i) instanceof Livro){
                            Livro lv = (Livro) pedidos.get(i);
                            textoPedidos +=  "\n\nNOME: " + lv.getNome() + "\nTIPO: " + lv.getTipo() + "\nID: " + lv.getId();
                        }
                    }

                    textArea1.setText(textoPedidos);

                }else{
                    JOptionPane.showMessageDialog(null,"ERRO: Escreva o sabor e tamanho");
                }
            }
        });
        juniorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean check = false;

                for(int i = 0; i < pedidos.size(); i++){
                    if(!check){
                        if(pedidos.get(i) instanceof Milkshake){
                            Milkshake mk = (Milkshake) pedidos.get(i);
                            JOptionPane.showMessageDialog(null, "Voce escolheu milkshake de sabor: " +  mk.getSabor() +  " e tamanho de: " + mk.getTamanho() + "cm");
                            pedidos.remove(i);
                            check = true;
                        }
                    }
                }

                if(!check){
                    JOptionPane.showMessageDialog(null,"Não existe nenhum pedido relacionado com Milkshake");
                }

                textoPedidos = "";

                for(int i = 0; i < pedidos.size();i++){
                    if(pedidos.get(i) instanceof Milkshake){
                        Milkshake ms = (Milkshake) pedidos.get(i);
                        textoPedidos +=
                                "\n\nTIPO: " + ms.getTipo() + "\nSABOR: " + ms.getSabor() + "\nTAMANHO: " + ms.getTamanho() + "\nID: " + ms.getId();
                    }else if(pedidos.get(i) instanceof Livro){
                        Livro lv = (Livro) pedidos.get(i);
                        textoPedidos +=  "\n\nNOME: " + lv.getNome() + "\nTIPO: " + lv.getTipo() + "\nID: " + lv.getId();
                    }
                }

                textArea1.setText(textoPedidos);



            }
        });
        plenoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean check = false;
                for(int i = 0; i < pedidos.size(); i++){
                    if(!check){
                        if(pedidos.get(i) instanceof Livro){
                         Livro lib = (Livro) pedidos.get(i);
                        JOptionPane.showMessageDialog(null, "Voce escolheu o livro chamado: " + lib.getNome());
                        pedidos.remove(i);
                        check = true;
                    }}

                }

                if(!check){
                    JOptionPane.showMessageDialog(null,"Não existe nenhum pedido relacionado com livro");
                }

                textoPedidos = "";

                for(int i = 0; i < pedidos.size();i++){
                    if(pedidos.get(i) instanceof Milkshake){
                        Milkshake ms = (Milkshake) pedidos.get(i);
                        textoPedidos +=
                                "\n\nTIPO: " + ms.getTipo() + "\nSABOR: " + ms.getSabor() + "\nTAMANHO: " + ms.getTamanho() + "\nID: " + ms.getId();
                    }else if(pedidos.get(i) instanceof Livro){
                        Livro lv = (Livro) pedidos.get(i);
                        textoPedidos +=  "\n\nNOME: " + lv.getNome() + "\nTIPO: " + lv.getTipo() + "\nID: " + lv.getId();
                    }
                }

                textArea1.setText(textoPedidos);

            }
        });
        seniorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            if(pedidos.size() > 0){
                if(pedidos.size() > 0) {
                    if(pedidos.get(0) instanceof Livro){
                        Livro lib = (Livro) pedidos.get(0);
                        JOptionPane.showMessageDialog(null, "Voce escolheu o livro chamado: " + lib.getNome());
                    }else{
                        Milkshake mk = (Milkshake) pedidos.get(0);
                        JOptionPane.showMessageDialog(null, "Voce escolheu milkshake de sabor: " +  mk.getSabor() +  " e tamanho de: " + mk.getTamanho() + "cm");

                    }
                    pedidos.remove(0);
                }

                textoPedidos = "";

                for(int i = 0; i < pedidos.size();i++){
                    if(pedidos.get(i) instanceof Milkshake){
                        Milkshake ms = (Milkshake) pedidos.get(i);
                        textoPedidos +=
                                "\n\nTIPO: " + ms.getTipo() + "\nSABOR: " + ms.getSabor() + "\nTAMANHO: " + ms.getTamanho() + "\nID: " + ms.getId();
                    }else if(pedidos.get(i) instanceof Livro){
                        Livro lv = (Livro) pedidos.get(i);
                        textoPedidos +=  "\n\nNOME: " + lv.getNome() + "\nTIPO: " + lv.getTipo() + "\nID: " + lv.getId();
                    }
                }

                textArea1.setText(textoPedidos);
            }else{
                JOptionPane.showMessageDialog(null,"Nenhum pedido existente");
            }

            }
        });
    }
}
