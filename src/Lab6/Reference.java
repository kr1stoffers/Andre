package Lab6;

import java.awt.*;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Reference extends JPanel {

    public static enum Figure {
        LINE, OVAL, RECT, ROUNDRECT, SURNAME, CLEAR
    };

    private Figure vibor = Figure.CLEAR; // объявляем переменную типа созданного перечисления
    // и присваиваем ей значение CLEAR

    public Reference() {
    } // конструктор нашего класса

    public void ris(String s) {// метод, вызов которого приводит к перерисовке панели
        // параметр s принимает значение во время вызова данного метода (см.
        // MyGraph.java)
        vibor = Figure.valueOf(s); // устанавливаем, что нужно нарисовать
        repaint(); // перерисовываем нашу панель, т.е. вызываем метод paintComponent
    }

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);
        Graphics2D g = (Graphics2D) gr;
        BasicStroke pen;// создаем перо, параметры которого будут определять стиль линий
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        switch (vibor) {
            case LINE:

                pen = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
                g.setStroke(pen);// делаем текущим пером созданное нами
                g.setColor(Color.blue);// задаем цвет пера
                g.drawLine(20, 20, 100, 100);
                break;
            case OVAL:

                float[] dash = { 10, 30 };

                pen = new BasicStroke(10, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_ROUND, 10, dash, 0);
                g.setStroke(pen);
                g.setColor(Color.red);

                g.setPaint(new GradientPaint(30, 30, Color.red, 50, 50, Color.green, true));
                g.fill(new Ellipse2D.Double(20, 20, 100, 100));
                break;
            case RECT:
                float[] dash2 = { 20, 20 };
                pen = new BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_BEVEL, 1, dash2, 0);
                g.setStroke(pen);
                g.setColor(Color.magenta);
                g.drawRect(20, 20, 100, 100);
                break;
            case ROUNDRECT:
                float[] dash3 = { 20, 20, 2, 20, 2, 20 };
                pen = new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 1, dash3, 0);
                g.setStroke(pen);
                g.setColor(Color.yellow);
                g.drawRoundRect(20, 20, 100, 100, 60, 60);
                break;
            case SURNAME:
                pen = new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
                g.setStroke(pen);
                g.setColor(Color.green);

                // Р
                pen = new BasicStroke(5, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER);
                g.setStroke(pen);
                g.setColor(Color.ORANGE);
                g.drawLine(20, 20, 20, 100);
                g.drawArc(10, 20, 40, 40, 100, -210);

                // У
                pen = new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 5, new float[] { 15, 10 }, 1);
                g.setStroke(pen);
                g.setColor(Color.BLACK);
                g.drawLine(70, 20, 100, 60);
                g.drawLine(140, 20, 60, 100);

                // С
                pen = new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 10, new float[] { 15, 10 }, 2);
                g.setStroke(pen);
                g.setColor(Color.RED);
                g.drawLine(160, 20, 160, 100);
                g.drawLine(160, 20, 190, 20);
                g.drawLine(160, 100, 190, 100);
                // И
                pen = new BasicStroke(10, BasicStroke.CAP_SQUARE, BasicStroke.CAP_BUTT, 15);
                g.setStroke(pen);
                g.setColor(Color.PINK);
                g.drawLine(220, 20, 220, 100);
                g.drawLine(220, 100, 250, 20);
                g.drawLine(250, 20, 250, 100);
                // Н
                pen = new BasicStroke(15, BasicStroke.CAP_SQUARE, BasicStroke.CAP_SQUARE);
                g.setStroke(pen);
                g.setColor(Color.MAGENTA);
                g.drawLine(290, 20, 290, 100);
                g.drawLine(290, 60, 330, 60);
                g.drawLine(330, 20, 330, 100);
        }
    }
}