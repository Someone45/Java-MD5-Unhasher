import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class Unhasher{ 

    public static void main(String[] args) throws Exception{

        JFrame frame = new JFrame();
        frame.setTitle("MD5 Unhasher");
        frame.setSize(1720,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.red);
        ImageIcon image = new ImageIcon("C:/Users/Adriel/Downloads/1piece logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);

        JPanel jp = new JPanel();
        jp.setBackground(Color.red);
        jp.setBounds(200, 200, 300, 300);
        jp.setLayout(new BorderLayout());

        JTextField textField = new JTextField("Replace with Hash", 30);
        
        jp.add(textField);
        frame.add(jp);
        frame.setVisible(true);



    }


}

