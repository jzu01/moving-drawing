import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class MovingDrawing extends JFrame implements KeyListener {
  private final ImagePanel imagePanel;
  public MovingDrawing() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    imagePanel = new ImagePanel("Graphic.png");
    getContentPane().add(imagePanel);
    setSize(500, 300);
    addKeyListener(this);
    setVisible(true);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    if (e.getKeyCode() == 39) {
      
    }    
  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == 39) {
      imagePanel.moveImage();
    } else {
      
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(MovingDrawing::new);
  }
}