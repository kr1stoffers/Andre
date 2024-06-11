package Lab4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

public class ya_hudozhnik {
    public static void main(String[] args) {

        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 3));
        ArrayList<JTextField> masTF = new ArrayList<JTextField>();
        for (int i = 0; i < 6; i++) {
            masTF.add(new JTextField("Текстовое поле " + (1 + i)));
            northPanel.add(masTF.get(i));
        }
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());
        JSlider slider = new JSlider();
        southPanel.add(slider);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(9, 1));
        ArrayList<JCheckBox> masCB = new ArrayList<JCheckBox>();
        for (int i = 0; i < 9; i++) {
            masCB.add(new JCheckBox("Выбор" + (i + 1)));
            westPanel.add(masCB.get(i));
        }

        JPanel centerPanel = new JPanel();
        Box centerBox = new Box(BoxLayout.Y_AXIS);
        Box innerCenterBox = new Box(BoxLayout.X_AXIS);
        String[] items = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" };
        JComboBox jBox = new JComboBox(items);
        JSpinner jSpin = new JSpinner();
        JRadioButton RB1 = new JRadioButton("Радиокнопка 1");
        JRadioButton RB2 = new JRadioButton("Радиокнопка 2");
        innerCenterBox.add(jBox);
        innerCenterBox.add(jSpin);
        innerCenterBox.add(RB1);
        centerBox.add(innerCenterBox);
        centerBox.add(RB2);

        centerPanel.add(centerBox);

        JPanel eastPanel = new JPanel();
        eastPanel.setLayout(new BorderLayout());
        JTextArea TA = new JTextArea("Текстовая область", 1, 30);
        eastPanel.add(TA);

        // Component horizontalStrut = Box.createHorizontalStrut(40);
        // northPanel.add(horizontalStrut);

        RB1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                TA.setText("Радиокнопка 1");
            }
        });

        masTF.get(5).addComponentListener(new ComponentListener() {

            @Override
            public void componentResized(ComponentEvent e) {
                masTF.get(5).setText(frame.getWidth() + " " + frame.getHeight());
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }

        });

        masTF.get(0).addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TA.setText(e.getActionCommand());
            }
        });

        frame.add(northPanel, BorderLayout.NORTH);
        frame.add(eastPanel, BorderLayout.EAST);
        frame.add(centerPanel, FlowLayout.CENTER);
        frame.add(southPanel, BorderLayout.SOUTH);
        frame.add(westPanel, BorderLayout.WEST);
        frame.setVisible(true);
        frame.pack();
        frame.setMinimumSize(frame.getSize());
    }
}