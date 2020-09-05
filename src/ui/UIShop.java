package ui;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author shinobu
 */
public class UIShop {

    private static JTextField textField = new JTextField();

    public void init() {
        JFrame frame = new JFrame("Test player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.X_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel products = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(products);
        context.add(buttons);
        JLabel l_text1 = new JLabel("producto 1");
        JLabel l_description = new JLabel("Palta");
        JLabel l_cantidad = new JLabel("10");
        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.
        JButton payment = new JButton("Metodo de pago");
        payment.addActionListener(actionEvent -> {new Show();});
        frame.setVisible(true);
        frame.setSize(1000, 1000);
        buttons.add(payment);
        products.add(l_text1);
        products.add(l_description);
        products.add(l_cantidad);
        
    }
}

class Show {
    private JButton b_back;
    public JPanel jpanelmain;


    public Show() {
        createAndShowGui();
    }

    void createAndShowGui(){

        JFrame frame=new JFrame();
        frame.setLocationRelativeTo(null);
        jpanelmain = new JPanel();
        JLabel l_text1 = new JLabel("Metodo de pago 1");
        JLabel l_text2 = new JLabel("Metodo de pago 2"); 
        JButton visa = new JButton("Paypal");
        JButton mastercard = new JButton("CREDIT CARD");
        b_back = new JButton("Back");
        jpanelmain.add(l_text1);
        jpanelmain.add(visa);
        jpanelmain.add(l_text2);
        jpanelmain.add(mastercard);
        jpanelmain.add(b_back);
        frame.setContentPane(jpanelmain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}