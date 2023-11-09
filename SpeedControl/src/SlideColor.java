import java.awt.*;
import javax.swing.*;

public class SlideColor {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Slide Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SlideColorPanel mainPanel = new SlideColorPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        frame.getContentPane().add(mainPanel);

        frame.pack();
        frame.setVisible(true);
    }
}