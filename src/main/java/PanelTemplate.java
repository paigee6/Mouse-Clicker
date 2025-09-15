import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelTemplate extends JPanel 
{
  private int w,h;
  private int mouseX = -1, mouseY = -1;
  private boolean mousePressed = false;

  public PanelTemplate(int w,int h)
    {
      this.w=w;
      this.h=h;
      setPreferredSize(new Dimension(w,h));
      MouseControl mouseControl = new MouseControl();
      addMouseListener(mouseControl);
      addMouseMotionListener(mouseControl);
    }

  public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        // Draw a simple grid
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i < w; i += 50) {
            g.drawLine(i, 0, i, h);
        }
        for (int j = 0; j < h; j += 50) {
            g.drawLine(0, j, w, j);
        }
        
        // Draw mouse position if mouse is in the panel
        if (mouseX != -1 && mouseY != -1) {
            g.setColor(mousePressed ? Color.RED : Color.BLUE);
            g.fillOval(mouseX - 10, mouseY - 10, 20, 20);
            
            g.setColor(Color.BLACK);
            g.drawString("Mouse: (" + mouseX + ", " + mouseY + ")", 10, 20);
        }
    }

  private class MouseControl implements MouseListener, MouseMotionListener
  {

  public void mouseDragged(MouseEvent e)
  {
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }

  public void mouseMoved(MouseEvent e)
  {
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }

  public void mouseClicked(MouseEvent e)
  {
    System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
  }

  public void mousePressed(MouseEvent e)
  {
    mousePressed = true;
    repaint();
  }

  public void mouseReleased(MouseEvent e)
  {
    mousePressed = false;
    repaint();
  }

  public void mouseEntered(MouseEvent e)
  {
    // Mouse entered the panel
  }

  public void mouseExited(MouseEvent e)
  {
    mouseX = -1;
    mouseY = -1;
    repaint();
  }

  }
}
  