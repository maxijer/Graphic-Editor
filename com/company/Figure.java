package com.company;

import java.awt.*;

public class Figure {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int size_w;
    private int size_h;
    private String state;

    public Figure(int x, int y, int size_w, int size_h, String state) {
        this.x1 = this.x2 = x;
        this.y1 = this.y2 = y;
        this.size_w = size_w;
        this.size_h = size_h;
        this.state = state;
    }

    public void move(int x, int y) {
        if (state.equals("Line")) {
            this.x2 = x;
            this.y2 = y;
        } else {
            this.x2 = x - x1;
            this.y2 = y - y1;
        }
    }

    public void paint(Graphics g) {
        if (state.equals("Line")) {
            g.drawLine(x1, y1, x2, y2);
        } else if (state.equals("Rect")) {
            g.drawRect(x1, y1, x2, y2);
        } else if (state.equals("Oval")) {
            g.drawOval(x1, y1, x2, y2);
        }
        g.drawString("sedsd", 0, 0);
    }
}
