/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package toolbar;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author sebas
 */
public class frmMain extends javax.swing.JFrame {
    
    DefaultListModel dlm = new DefaultListModel();
                
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        panBG.setVisible(true);
        
        lstFile.setModel(dlm);
        
        txtAdd.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateTxtState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateTxtState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateTxtState();
            }
            
        });
    }
    
    private void updateTxtState() {
        if ("".equals(txtAdd.getText())) {
            butAdd.setEnabled(false);
        } else {
            butAdd.setEnabled(true);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBG = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstFile = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAdd = new javax.swing.JTextPane();
        butRemove = new javax.swing.JButton();
        butAdd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        miOpen = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mTools = new javax.swing.JMenu();
        miBeans = new javax.swing.JMenuItem();
        sepFood = new javax.swing.JPopupMenu.Separator();
        miAvocados = new javax.swing.JMenuItem();
        miSmile = new javax.swing.JMenuItem();
        mView = new javax.swing.JMenu();
        miMagenta = new javax.swing.JMenuItem();
        miChoose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstFile.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstFile);

        jScrollPane2.setViewportView(txtAdd);

        butRemove.setText("Remove");
        butRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRemoveActionPerformed(evt);
            }
        });

        butAdd.setText("Add");
        butAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBGLayout = new javax.swing.GroupLayout(panBG);
        panBG.setLayout(panBGLayout);
        panBGLayout.setHorizontalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butRemove)
                    .addComponent(butAdd))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panBGLayout.setVerticalGroup(
            panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBGLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butRemove))
                .addGap(18, 18, 18)
                .addGroup(panBGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addGroup(panBGLayout.createSequentialGroup()
                        .addComponent(butAdd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jMenu2.setText("File");

        miOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miOpen.setText("Open");
        miOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miOpenActionPerformed(evt);
            }
        });
        jMenu2.add(miOpen);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        mTools.setText("Tools");

        miBeans.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miBeans.setText("Beans");
        miBeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBeansActionPerformed(evt);
            }
        });
        mTools.add(miBeans);
        mTools.add(sepFood);

        miAvocados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miAvocados.setText("Avocados");
        miAvocados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAvocadosActionPerformed(evt);
            }
        });
        mTools.add(miAvocados);

        miSmile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miSmile.setText("smiley");
        miSmile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSmileActionPerformed(evt);
            }
        });
        mTools.add(miSmile);

        jMenuBar1.add(mTools);

        mView.setText("View");

        miMagenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miMagenta.setText("Magenta");
        miMagenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMagentaActionPerformed(evt);
            }
        });
        mView.add(miMagenta);

        miChoose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miChoose.setText("Choose");
        miChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChooseActionPerformed(evt);
            }
        });
        mView.add(miChoose);

        jMenuBar1.add(mView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panBG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAvocadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAvocadosActionPerformed
        panBG.setBackground(Color.green);
    }//GEN-LAST:event_miAvocadosActionPerformed

    private void miBeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBeansActionPerformed
        panBG.setBackground(Color.gray);
    }//GEN-LAST:event_miBeansActionPerformed

    private void miMagentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMagentaActionPerformed
        panBG.setBackground(new Color(255, 0, 255));
    }//GEN-LAST:event_miMagentaActionPerformed

    private void miChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChooseActionPerformed
        panBG.setBackground(javax.swing.JColorChooser.showDialog(this, "Jürgen", Color.yellow));
    }//GEN-LAST:event_miChooseActionPerformed

    private void miSmileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSmileActionPerformed
        
    }//GEN-LAST:event_miSmileActionPerformed

    private void miOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        
        fc.setFileFilter(new FileFilter(){
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".txt") || file.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Text-File";
            }
            
        });
        
        if (fc.showDialog(this, "Jürgen") == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(fc.getSelectedFile().getAbsolutePath()));
                
                String line;
                while ((line = br.readLine()) != null) {
                    dlm.addElement(line);
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_miOpenActionPerformed

    private void butRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRemoveActionPerformed
        // TODO add your handling code here:
        dlm.remove(lstFile.getSelectedIndex());
    }//GEN-LAST:event_butRemoveActionPerformed

    private void butAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddActionPerformed
        // TODO add your handling code here:
        dlm.addElement(txtAdd.getText());
        txtAdd.setText("");
    }//GEN-LAST:event_butAddActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAdd;
    private javax.swing.JButton butRemove;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstFile;
    private javax.swing.JMenu mTools;
    private javax.swing.JMenu mView;
    private javax.swing.JMenuItem miAvocados;
    private javax.swing.JMenuItem miBeans;
    private javax.swing.JMenuItem miChoose;
    private javax.swing.JMenuItem miMagenta;
    private javax.swing.JMenuItem miOpen;
    private javax.swing.JMenuItem miSmile;
    private javax.swing.JPanel panBG;
    private javax.swing.JPopupMenu.Separator sepFood;
    private javax.swing.JTextPane txtAdd;
    // End of variables declaration//GEN-END:variables
}