import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaHome extends JFrame {
    public JPanel container;
    private JTextField cadastroCpfTxt;
    private JTextField cadastroNomeTxt;
    private JButton cadastrarButton;
    private JTextField logarCpf;
    private JButton logarSeButton;
    private JPanel produtosText;
    private JTextField buscaUser;
    private JLabel bemVindoTxt;
    private JPanel cadastroLogin;
    private JPanel buyAndValues;
    private JPanel divPainelCliente;
    private JButton deslogarButton;
    private JButton removerContaButton;
    private JButton editarButton;
    private JButton soonButton;
    private JPanel divEditCliente;
    private JTextField editarNomeTxt;
    private JButton editarNomeButton;
    private JButton buscarButton;
    private JLabel userData;

    int idClient = -1;
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();


    public TelaHome() {
        divPainelCliente.setVisible(false);
        buyAndValues.setVisible(false);
        divEditCliente.setVisible(false);



        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = cadastroNomeTxt.getText();
                long cpfCliente = Long.parseLong(cadastroCpfTxt.getText());
                Cliente c = new Cliente(nome, cpfCliente);
                clientes.add(c);
                JOptionPane.showMessageDialog(null, "O cliente foi cadastrado!");
                cadastroNomeTxt.setText("");
                cadastroCpfTxt.setText("");

            }
        });
        logarSeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               long cpfLogin = Long.parseLong(logarCpf.getText());
               boolean cpfExiste = false;

               for(int i = 0;i < clientes.size();i++){
                   if(cpfLogin == clientes.get(i).getCpf()){
                       cpfExiste = true;
                       idClient = i;
                   }
               }

               if(cpfExiste){
                   bemVindoTxt.setText("Cliente: " + clientes.get(idClient).getNomeCliente());
                   cadastroLogin.setVisible(false);
                   logarCpf.setText("");
                   userData.setText("");
                   buyAndValues.setVisible(true);
                   divPainelCliente.setVisible(true);
               }else {
                   JOptionPane.showMessageDialog(null, "Usuario não encontrado!");
                   logarCpf.setText("");
               }
            }
        });
        removerContaButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                clientes.remove(idClient);
                cadastroLogin.setVisible(true);
                buyAndValues.setVisible(false);
                divPainelCliente.setVisible(false);
                idClient = -1;
                bemVindoTxt.setText("");
            }
        });
        deslogarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idClient = -1;
                cadastroLogin.setVisible(true);
                buyAndValues.setVisible(false);
                divPainelCliente.setVisible(false);
                bemVindoTxt.setText("");
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                divEditCliente.setVisible(true);
            }
        });
        editarNomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novoNome = editarNomeTxt.getText();
                clientes.get(idClient).setNomeCliente(novoNome);
                bemVindoTxt.setText("Cliente: " + clientes.get(idClient).getNomeCliente());
                JOptionPane.showMessageDialog(null, "seu nome foi editado!");


                divEditCliente.setVisible(false);
                editarNomeTxt.setText("");

            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean usuarioExiste = false;

                for(int i = 0;i < clientes.size();i++){
                    if(clientes.get(i).getNomeCliente().equals(buscaUser.getText())) {
                        userData.setText("-------------   Nome: " + clientes.get(i).getNomeCliente() + "   /   CPF: " + clientes.get(i).getCpf() + "    -------------");
                        usuarioExiste = true;
                    }
                }
                if(!usuarioExiste){
                    JOptionPane.showMessageDialog(null , "Usuario não encontrado!");
                    buscaUser.setText("");
                    userData.setText("");
                }
            }
        });
    }
}

