import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
  private Image image;
  private int x, y;

  public ImagePanel(String imagePath) {
    try {
      image = ImageIO.read(new File(imagePath));
      this.x = 5;
      this.y = 220;
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void moveImage() {
    this.x = this.x + 10;
    repaint();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (image != null) {
      g.drawImage(image, x, 220, this);
    }
  }
}