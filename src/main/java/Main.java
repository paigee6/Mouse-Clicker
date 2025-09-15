import javax.swing.*;

public class Main 
{
  public static void main(String[] args) 
  {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        JFrame frame=new JFrame("Template");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PanelTemplate(1000,1000));
        frame.pack();
        frame.setVisible(true);
      }
    });
  }
}