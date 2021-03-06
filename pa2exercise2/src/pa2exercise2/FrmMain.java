/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pa2exercise2;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 *
 * @author sebas
 */
public class FrmMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawPanel1 = new pa2exercise2.DrawPanel();
        menubar = new javax.swing.JMenuBar();
        mFile = new javax.swing.JMenu();
        miNew = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miOpen = new javax.swing.JMenuItem();
        miSave = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mitExit = new javax.swing.JMenuItem();
        mOptions = new javax.swing.JMenu();
        rbmiRect = new javax.swing.JRadioButtonMenuItem();
        rbmiLine = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout drawPanel1Layout = new javax.swing.GroupLayout(drawPanel1);
        drawPanel1.setLayout(drawPanel1Layout);
        drawPanel1Layout.setHorizontalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        drawPanel1Layout.setVerticalGroup(
            drawPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mFile.setText("File");

        miNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miNew.setText("New");
        miNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNewActionPerformed(evt);
            }
        });
        mFile.add(miNew);
        mFile.add(jSeparator1);

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        mFile.add(miOpen);

        miSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSave.setText("Save");
        miSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSaveActionPerformed(evt);
            }
        });
        mFile.add(miSave);
        mFile.add(jSeparator2);

        mitExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mitExit.setText("Exit");
        mitExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitExitActionPerformed(evt);
            }
        });
        mFile.add(mitExit);

        menubar.add(mFile);

        mOptions.setText("Options");

        rbmiRect.setSelected(true);
        rbmiRect.setText("Rectangle");
        rbmiRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiRectActionPerformed(evt);
            }
        });
        mOptions.add(rbmiRect);

        rbmiLine.setSelected(true);
        rbmiLine.setText("Line");
        rbmiLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbmiLineActionPerformed(evt);
            }
        });
        mOptions.add(rbmiLine);

        menubar.add(mOptions);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(drawPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNewActionPerformed
        drawPanel1.miNew();
    }//GEN-LAST:event_miNewActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getAbsolutePath().endsWith(".cool");
            }

            @Override
            public String getDescription() {
                return "very COOL file (.cool)";
            }
        });

        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            drawPanel1.miOpen(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_miOpenActionPerformed

    private void miSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSaveActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() || f.getAbsolutePath().endsWith(".cool");
            }

            @Override
            public String getDescription() {
                return "very COOL file (.cool)";
            }
        });

        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            drawPanel1.miSave(fc.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_miSaveActionPerformed

    private void mitExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitExitActionPerformed
        drawPanel1.miExit();
    }//GEN-LAST:event_mitExitActionPerformed

    private void rbmiRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiRectActionPerformed
        drawPanel1.changeType(DrawPanel.RECTANGLE);
    }//GEN-LAST:event_rbmiRectActionPerformed

    private void rbmiLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbmiLineActionPerformed
        drawPanel1.changeType(DrawPanel.LINE);
    }//GEN-LAST:event_rbmiLineActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private pa2exercise2.DrawPanel drawPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mFile;
    private javax.swing.JMenu mOptions;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem miNew;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSave;
    private javax.swing.JMenuItem mitExit;
    private javax.swing.JRadioButtonMenuItem rbmiLine;
    private javax.swing.JRadioButtonMenuItem rbmiRect;
    // End of variables declaration//GEN-END:variables
}
