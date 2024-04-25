

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int maiorNumero = 0;
        int j = 0;
        while (j < 10) {
            int NumeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100"));
            if (NumeroDigitado > 100) {

                while (NumeroDigitado > 100) {
                    JOptionPane.showMessageDialog(null, "Digite um numero entre 0 a 100\nQuantidade de tentativas: " + j);
                    NumeroDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100"));
                }
            }
            if (NumeroDigitado > maiorNumero) {
                maiorNumero = NumeroDigitado;
            }
            j++;
        }
        JOptionPane.showMessageDialog(null, "O maior numero digitado foi " + maiorNumero);

    }

}



