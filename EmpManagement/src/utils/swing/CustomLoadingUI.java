
package utils.swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author admin
 */
public class CustomLoadingUI extends JPanel implements ActionListener{
    
    private Timer timer;
    private int alphaValue = 0;
    private int radius = 20;
    private int centerX = 50;
    private int centerY = 50;

    public CustomLoadingUI() {
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Vẽ hình tròn và hiệu ứng ánh sáng
        Ellipse2D circle = new Ellipse2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2);
        g2.setColor(Color.BLUE);
        g2.fill(circle);

        // Tạo hiệu ứng ánh sáng
        AlphaComposite alphaComposite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alphaValue / 255.0f);
        g2.setComposite(alphaComposite);
        g2.setColor(Color.WHITE);
        g2.fill(circle);

        g2.dispose();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
         // Tăng độ trong suốt của hiệu ứng ánh sáng
        alphaValue += 5;
        if (alphaValue > 255) {
            alphaValue = 0;
        }

        // Thay đổi bán kính của hình tròn
        radius += 1;
        if (radius > 50) {
            radius = 20;
        }

        // Vẽ lại giao diện loading
        repaint();
    }
    
}
