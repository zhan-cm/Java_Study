import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class DynamicHeart extends JFrame {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final int HEART_SIZE = 150;
    private static final int ANIMATION_DELAY = 50;

    private int heartSize = HEART_SIZE;
    private Color heartColor = Color.RED;
    private boolean expanding = true;

    public DynamicHeart() {
        setTitle("Dynamic Heart Animation");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true); // Optional: Remove window decorations for a cleaner look
        setBackground(new Color(0, 0, 0, 0)); // Optional: Transparent background
        setVisible(true);

        // Start animation
        new Timer(ANIMATION_DELAY, e -> {
            repaint();
            updateHeart();
        }).start();
    }

    private void updateHeart() {
        if (expanding) {
            heartSize += 2;
            if (heartSize > HEART_SIZE * 1.5) {
                expanding = false;
            }
        } else {
            heartSize -= 2;
            if (heartSize < HEART_SIZE) {
                expanding = true;
            }
        }

        // Change color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        heartColor = new Color(red, green, blue);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw heart
        Path2D heart = new Path2D.Double();
        heart.moveTo(WIDTH / 2, HEIGHT / 2 - heartSize / 2);
        heart.curveTo(WIDTH / 2 - heartSize / 2, HEIGHT / 2 - heartSize / 2,
                WIDTH / 2 - heartSize, HEIGHT / 2,
                WIDTH / 2, HEIGHT / 2 + heartSize / 2);
        heart.curveTo(WIDTH / 2 + heartSize, HEIGHT / 2,
                WIDTH / 2 + heartSize / 2, HEIGHT / 2 - heartSize / 2,
                WIDTH / 2, HEIGHT / 2 - heartSize / 2);
        heart.closePath();

        g2.setColor(heartColor);
        g2.fill(heart);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DynamicHeart::new);
    }
}
