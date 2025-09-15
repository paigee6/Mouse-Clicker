import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanelTemplate extends JPanel 
{
  private int w,h;

  public PanelTemplate(int w,int h)
    {
      this.w=w;
      this.h=h;
      setPreferredSize(new Dimension(w,h));
    }

  public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }

  private class MouseControl implements MouseListener, MouseMotionListener
  {

  public void mouseDragged(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  public void mouseMoved(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  public void mouseClicked(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  public void mousePressed(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  public void mouseReleased(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  public void mouseEntered(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  public void mouseExited(MouseEvent e)
  {
  // TODO Auto-generated method stub

  }

  }
}
  