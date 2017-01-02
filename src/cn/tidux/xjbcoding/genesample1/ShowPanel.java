package cn.tidux.xjbcoding.genesample1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class ShowPanel extends JPanel implements Observer {
    int x    = 0;
    int y    = 0;
    int data = 0;

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.RED);//…Ë÷√ª≠Õºµƒ
        g2d.drawString(String.valueOf(data), x++, y++);
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        paint(getGraphics());
    }
}
