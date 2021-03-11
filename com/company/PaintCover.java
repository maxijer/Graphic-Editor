package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintCover extends JPanel {
    private ArrayList<Figure> lines;

    public PaintCover() {
        super(true);

        lines = new ArrayList<>();

        PaintCoverMouseListener pcml = new PaintCoverMouseListener();
        addMouseListener(pcml);
        addMouseMotionListener(pcml);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Figure line : lines)
            line.paint(g);
    }

    public void addLine(Figure line) {
        lines.add(line);
    }

    public static void main(String[] args) {
        JFrame fr = new JFrame("Paint");
        fr.setSize(500, 500);
        fr.add(new PaintCover());
        fr.setVisible(true);
    }

}
