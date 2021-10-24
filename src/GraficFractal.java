import javax.swing.*;
import java.awt.*;

public class GraficFractal {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("ФРАКТАЛ");
        frame.setSize(520, 540);
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrowCanvas canvas = new DrowCanvas();
        frame.getContentPane().add(canvas);

        frame.setVisible(true);
    }
}

class DrowCanvas extends Canvas {
    public void paint(Graphics graphics) {
        graphics.drawLine(0, 250, 500, 250);
        int radius = 125;
        int xc = 250, yc = 250;
        graphics.setColor(Color.ORANGE);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(5));
        drow(graphics,xc,yc,radius);

    }

    private void drow(Graphics graphics, int xc, int yc, int radius) {
        if (radius < 5) return;
        else {
            graphics.drawOval(xc-radius, yc-radius,radius*2, radius*2);
            drow(graphics, xc - radius, yc, radius / 2);
            drow(graphics, xc + radius, yc, radius / 2);
            drow(graphics, xc, yc-radius, radius / 2);
            drow(graphics, xc, yc+radius, radius / 2);
        }
    }
}