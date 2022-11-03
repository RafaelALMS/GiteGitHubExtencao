
import javax.swing.JOptionPane;

public class GiuTeste {

    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));

        JOptionPane.showMessageDialog(null, "You are "+name+" years old "+age);   
    }

}