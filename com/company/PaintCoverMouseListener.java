package com.company;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PaintCoverMouseListener implements MouseListener, MouseMotionListener {
    private Figure currentLine;

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            currentLine = new Figure(e.getX(), e.getY(),500, 500, "Rect");
            PaintCover pc = (PaintCover) e.getSource();
            pc.addLine(currentLine);
//            pc.updateUI();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            currentLine.move(e.getX(), e.getY());
            currentLine = null;
            PaintCover pc = (PaintCover) e.getSource();
            pc.updateUI();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        currentLine.move(e.getX(), e.getY());
        PaintCover pc = (PaintCover) e.getSource();
        pc.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
