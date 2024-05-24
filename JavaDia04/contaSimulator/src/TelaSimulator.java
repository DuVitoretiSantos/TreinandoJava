import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSimulator extends JFrame{

    Conta c = new Conta("Eduardo", 1,557.0F);
    private JLabel lblSaldo;
    private JButton depositoButton;
    private JTextField txtDeposito;
    private JTextField txtSaque;
    private JButton sacarButton;
    public JPanel painelPrincipal;


    public TelaSimulator() {
        lblSaldo.setText(Float.toString(c.getSaldo()));

        depositoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(txtDeposito.getText());
                c.depositar(valor);
                lblSaldo.setText(Float.toString(c.getSaldo()));
            }
        });
        sacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(txtSaque.getText());
                c.sacar(valor);
                lblSaldo.setText(Float.toString(c.getSaldo()));
            }
        });
    }
}
