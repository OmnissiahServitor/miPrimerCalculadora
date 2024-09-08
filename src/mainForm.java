import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {
    private JPanel panel1;
    private JTextField txt_numeroA;
    private JTextField txt_numeroB;
    private JButton sumarButton;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;
    private JLabel jLab_resultado;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    mainForm mainForm_obj = new mainForm();
                    mainForm_obj.set
                }
            });

        } // end main()
    } // end class Main

    public mainForm() {


        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resultado = 0;
                try{
                    resultado = Integer.parseInt(txt_numeroA.getText()) + Integer.parseInt(txt_numeroB.getText());
                    jLab_resultado.setText(String.valueOf(resultado));
                }
                catch(Exception nfe){
                    JOptionPane.showMessageDialog(null, "No se pudo mostrar resultado. Error: " + nfe.getMessage());
                }
            }
        });
    }
} // end class mainForm
