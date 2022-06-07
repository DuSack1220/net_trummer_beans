/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pa2exercise2;

import java.awt.*;
import java.io.*;

/**
 *
 * @author sebas
 */
public class DrawPanel extends javax.swing.JPanel {

    public static final int RECTANGLE = 0;
    public static final int LINE = 1;
    private int type = RECTANGLE;
    Management m;
    boolean create, moving;
    Point act;
    int oldX, oldY;


    /**
     * Creates new form DrawPanel
     */
    public DrawPanel() {
        initComponents();
        m = new Management();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void changeType(int type) {
        this.type = type;
    }

    public void miNew() {
        m = new Management();
        repaint();
    }

    public void miOpen(String filename) {
        if (!filename.endsWith(".cool"))
            filename += ".cool";

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
            m = (Management) ois.readObject();
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        repaint();
    }

    public void miSave(String filename) {
        if (!filename.endsWith(".cool"))
            filename += ".cool";

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
            oos.writeObject(m);
            oos.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void miExit() {
        System.exit(0);
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        act = m.isInFigure(evt.getX(), evt.getY());

        if (act == null) {
            create = true;

            Figure tmp = null;
            if (type == RECTANGLE)
                tmp = new Rectangle(evt.getX(), evt.getY(), evt.getX(), evt.getY());
            if (type == LINE)
                tmp = new Line(evt.getX(), evt.getY(), evt.getX(), evt.getY());

            m.add(tmp);
            act = tmp.getP2();

        } else {
            moving = true;
            oldX = evt.getX();
            oldY = evt.getY();
        }
        repaint();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        if (create) {
            act.set(evt.getX(), evt.getY());
        } else if (moving) {
            act.move(evt.getX() - oldX, evt.getY() - oldY);
            oldX = evt.getX();
            oldY = evt.getY();
        }

        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        create = false;
        moving = false;
        act = null;

        repaint();
    }//GEN-LAST:event_formMouseReleased

    //@override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        m.paint(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}