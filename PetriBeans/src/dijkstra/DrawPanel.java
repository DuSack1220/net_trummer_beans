/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package dijkstra;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.io.IOException;

/**
 *
 * @author sebas
 */
public class DrawPanel extends javax.swing.JPanel {
    
    private NodeManagement nm;
    private Node connecting;
    private int x;
    private int y;
    private Node moving;

    /**
     * Creates new form DrawPanal
     */
    public DrawPanel() {
        initComponents();
        nm = new NodeManagement();
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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        if (evt.getButton() == MouseEvent.BUTTON1) {
            nm.add(evt.getX(), evt.getY());
            repaint();
            /*
            if ((evt.getModifiersEx() & MouseEvent.CTRL_DOWN_MASK) == 128 && nm.isInNode(evt.getX(), evt.getY()) != null) {
                moving = nm.isInNode(evt.getX(), evt.getY());
                x = evt.getX();
                y = evt.getY();
            } else if (nm.isInNode(evt.getX(), evt.getY()) != null) {
                connecting = nm.isInNode(evt.getX(), evt.getY());
                x = evt.getX();
                y = evt.getY();
            } else {
                moving = null;
                connecting = null;
            }
             */
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        if (connecting != null) {
            x = evt.getX();
            y = evt.getY();
            repaint();
        } else if (moving != null) { //  && !nm.isNearNode(evt.getX(), evt.getY())
            moving.move(evt.getX() - x, evt.getY() - y);
            x = evt.getX();
            y = evt.getY();
        }
        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        /*
        if (connecting != null && nm.isInNode(evt.getX(), evt.getY()) != null && connecting != nm.isInNode(evt.getX(), evt.getY())) {
            connecting.addNb(nm.isInNode(evt.getX(), evt.getY()));
            nm.isInNode(evt.getX(), evt.getY()).addNb(connecting);
            nm.clearEnt();
            if (nm.getSelectedNodes().size() == 2) {
                nm.findPath(nm.getSelectedNodes().get(0), nm.getSelectedNodes().get(1));
            }
        }*/
            
        connecting = null;
        moving = null;
        repaint();
    }//GEN-LAST:event_formMouseReleased
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (connecting != null)
            g.drawLine(connecting.getX(), connecting.getY(), x, y);
        nm.paint(g);
    }
    
    public void save() throws IOException {
        /*
        OutputStream fos = Files.newOutputStream(Paths.get("nodes.ser"));
        ObjectOutputStream oos = new ObjectOutputStream(fos) {
            oos.writeObject(nm);
        }
        */
    }
    
    public void load() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
