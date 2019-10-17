package BaiTap.Shapes;

import javax.swing.*;
import java.awt.*;

public class DrawShapes extends JFrame {
    public DrawShapes(){
        setTitle("Drawing");
        setSize(960,960);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void drawCircle(Graphics g){
        g.setColor(Color.red);
        g.drawOval(480,480,200,200);
    }

}
