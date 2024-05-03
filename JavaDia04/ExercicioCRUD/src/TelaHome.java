import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class TelaHome extends JFrame {
    public JPanel container;
    private JTextField cadastroCpfTxt;
    private JTextField cadastroNomeTxt;
    private JButton cadastrarButton;
    private JTextField logarCpf;
    private JButton logarSeButton;
    private JPanel produtosText;
    private JTextField textField4;


    ArrayList<Cliente> clientes = new ArrayList<Cliente>();


    public TelaHome() {
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = cadastroNomeTxt.getText();
                long cpfCliente = Long.parseLong(cadastroCpfTxt.getText());
                Cliente c = new Cliente(nome, cpfCliente);
                clientes.add(c);
                JOptionPane.showMessageDialog(null, "O cliente foi cadastrado!");

            }
        });
        logarSeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

