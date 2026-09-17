import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = generateWindow();

        addShapes(frame);

        renderWindow(frame);
    }

    private static void renderWindow(JFrame frame) {
        frame.pack();
        frame.setVisible(true);
    }

    private static void addShapes(JFrame frame) {
        Rectangle rectangle =  new Rectangle(100,100,new Dimension(198, 198), new Color(232, 125, 43));

        frame.add(rectangle);
    }

    public static JFrame generateWindow() {
        JFrame frame = new JFrame("RenderingShapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return frame;
    }

    static class Rectangle extends JPanel {
        private int posX;
        private int posY;

        private Dimension scale;

        private Color baseColor;

        public Rectangle(int posX, int posY, Dimension scale, Color baseColor) {
            this.posX = posX;
            this.posY = posY;
            this.scale = scale;
            this.baseColor = baseColor;
            this.setBounds(posX, posY, scale.width, scale.height);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(baseColor);
            g.fillRect(posX, posY, scale.width, scale.height);
        }
    }
}