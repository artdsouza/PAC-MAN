import javax.swing.*;
import java.awt.*;

public class Token {
    public int x;
    public int y;

    public Token (int xValue, int yValue) {
        x = xValue;
        y = yValue;
    }
    public void drawMe(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(x + 7, y + 7, 6, 6);
    }
}