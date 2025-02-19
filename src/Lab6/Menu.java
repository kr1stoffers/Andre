package Lab6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    private Reference myPanel = new Reference();// объявляем и создаем нашу панель для рисования

    public static void main(String[] args) {
        new Menu();
    }

    public Menu() {
        JMenuBar myMenu = new JMenuBar();
        JMenu figures = new JMenu("Фигуры");
        JMenuItem[] fig_Items = new JMenuItem[6];
        for (int i = 0; i < 6; i++) {
            fig_Items[i] = new JMenuItem(Reference.Figure.values()[i].toString());
            figures.add(fig_Items[i]);
            fig_Items[i].addActionListener(this);
        }

        myMenu.add(figures);

        setJMenuBar(myMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(myPanel, BorderLayout.CENTER);
        Dimension size = getSize();// записываем в переменную size текущий размер окна
        size.setSize(size.width + 500, size.height + 400);// устанавливаем новый размер окна, увеличивая
        // текущий по высоте на 200
        setMinimumSize(size);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { // при нажатии на одну из кнопок
        myPanel.ris(e.getActionCommand());// вызываем метод ris нашей панели (см. JMyPanel.java)
    }

}
