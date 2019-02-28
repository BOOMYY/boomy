
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Home {

    private JFrame frame;
    private JTextField tf_number;
    String str = "";
    String str2 = "";

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Home window = new Home();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Home() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        JFrame frame = new JFrame("BOOMY");
        JPanel pa = new JPanel();
        frame.setBounds(100, 100, 450, 345);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);

        JButton button = new JButton("1");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button.getText();
                tf_number.setText(str);
            }
        });
        button.setBounds(87, 95, 64, 25);
        frame.getContentPane().add(button);

        JButton button_1 = new JButton("2");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                str += button_1.getText();
                tf_number.setText(str);
            }
        });
        button_1.setBounds(181, 95, 64, 25);
        frame.getContentPane().add(button_1);

        JButton button_2 = new JButton("3");
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button_2.getText();
                tf_number.setText(str);
            }
        });
        button_2.setBounds(270, 95, 64, 25);
        frame.getContentPane().add(button_2);

        JButton button_3 = new JButton("4");
        button_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button_3.getText();
                tf_number.setText(str);
            }
        });
        button_3.setBounds(87, 133, 64, 25);
        frame.getContentPane().add(button_3);

        JButton button_4 = new JButton("5");
        button_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button_4.getText();
                tf_number.setText(str);
            }
        });
        button_4.setBounds(181, 133, 64, 25);
        frame.getContentPane().add(button_4);

        JButton button_5 = new JButton("6");
        button_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button_5.getText();
                tf_number.setText(str);
            }
        });
        button_5.setBounds(270, 133, 64, 25);
        frame.getContentPane().add(button_5);

        JButton button_6 = new JButton("7");
        button_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button_6.getText();
                tf_number.setText(str);
            }
        });
        button_6.setBounds(87, 171, 64, 25);
        frame.getContentPane().add(button_6);

        JButton button_7 = new JButton("8");

        button_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str += button_7.getText();
                tf_number.setText(str);
            }
        });
        button_7.setBounds(181, 171, 64, 25);
        frame.getContentPane().add(button_7);

        JButton button_8 = new JButton("9");
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                str += button_8.getText();
                tf_number.setText(str);
            }
        });
        button_8.setBounds(270, 171, 64, 25);
        frame.getContentPane().add(button_8);

        JButton multiplyBtn = new JButton("*");
        multiplyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str2 = "*" + tf_number.getText();
                tf_number.setText("");
                str = "";

            }
        });
        multiplyBtn.setBounds(87, 209, 64, 25);
        frame.getContentPane().add(multiplyBtn);

        JButton minusBtn = new JButton("-");
        minusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str2 = "-" + tf_number.getText();
                tf_number.setText("");
                str = "";
            }
        });
        minusBtn.setBounds(181, 209, 64, 25);
        frame.getContentPane().add(minusBtn);

        JButton computeBtn = new JButton("=");
        computeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str = tf_number.getText();
                double ans = 0;
                switch (str2.charAt(0)) {
                    case '+':
                        System.out.println(str2.substring(1));
                        ans = Double.parseDouble(str2.substring(1)) + Double.parseDouble(str);
                        tf_number.setText(ans + "");
                        break;
                    case '-':
                        ans = Double.parseDouble(str2.substring(1)) - Double.parseDouble(str);
                        tf_number.setText(ans + "");
                        break;
                    case '*':
                        System.out.println(str2.substring(1));
                        ans = Double.parseDouble(str2.substring(1)) * Double.parseDouble(str);
                        tf_number.setText(ans + "");
                        break;
                    case '/':
                        ans = Double.parseDouble(str2.substring(1)) / Double.parseDouble(str);
                        tf_number.setText(ans + "");
                        break;
                    default:
                        tf_number.setText("ERROR");
                        break;
                }
            }
        });
        computeBtn.setBounds(270, 209, 64, 25);
        frame.getContentPane().add(computeBtn);

        JButton divideBtn = new JButton("/");
        divideBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str2 = "/" + tf_number.getText();
                tf_number.setText("");
                str = "";
            }
        });
        divideBtn.setBounds(87, 247, 64, 25);
        frame.getContentPane().add(divideBtn);

        JButton plusBtn = new JButton("+");
        plusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                str2 = "+" + tf_number.getText();
                tf_number.setText("");
                str = "";
            }
        });
        plusBtn.setBounds(181, 247, 64, 25);
        frame.getContentPane().add(plusBtn);

        JButton clearBtn = new JButton("C");
        clearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf_number.setText("");
                str = "";
                str2 = "";
            }
        });
        clearBtn.setBounds(270, 247, 64, 25);
        frame.getContentPane().add(clearBtn);
        tf_number = new JTextField();
        tf_number.setBackground(Color.yellow);
        tf_number.setHorizontalAlignment(SwingConstants.TRAILING);
        tf_number.setBounds(29, 32, 375, 50);
        frame.getContentPane().add(tf_number);
        tf_number.setColumns(10);
    }
}
