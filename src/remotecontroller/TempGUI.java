/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontroller;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author mgrib
 */
public class TempGUI extends javax.swing.JFrame implements KeyListener{

    GUIController controller;
    
    public TempGUI() {
        initComponents();
        this.setController(controller);

    }
    
    public void setController(GUIController controller){
        this.controller = controller;      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fwdButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        revButton = new javax.swing.JButton();
        leftServoButton = new javax.swing.JButton();
        startButton = new javax.swing.JButton();
        manuelToggle = new javax.swing.JToggleButton();
        sensSlider = new javax.swing.JSlider();
        rightServoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fwdButton.setText("Fwd");
        fwdButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fwdButtonKeyPressed(evt);
            }
        });

        rightButton.setText("Right");
        rightButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightButtonKeyPressed(evt);
            }
        });

        leftButton.setText("Left");
        leftButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftButtonKeyPressed(evt);
            }
        });

        revButton.setText("Rev");
        revButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                revButtonKeyPressed(evt);
            }
        });

        leftServoButton.setText("Left");
        leftServoButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftServoButtonKeyPressed(evt);
            }
        });

        startButton.setText("Start");
        startButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                startButtonKeyPressed(evt);
            }
        });

        manuelToggle.setText("Manuel/Auto");

        rightServoButton.setText("Right");
        rightServoButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightServoButtonKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startButton)
                            .addComponent(manuelToggle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(sensSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leftButton)
                            .addComponent(leftServoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fwdButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(revButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rightButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(rightServoButton)))
                        .addGap(21, 21, 21))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fwdButton, leftButton, revButton, rightButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manuelToggle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(sensSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftServoButton)
                    .addComponent(rightServoButton))
                .addGap(30, 30, 30)
                .addComponent(fwdButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revButton)
                    .addComponent(leftButton)
                    .addComponent(rightButton))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fwdButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fwdButtonKeyPressed
        this.fwdButton.setBackground(Color.green);
        this.controller.setFwd(true);
    }//GEN-LAST:event_fwdButtonKeyPressed

    private void leftButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftButtonKeyPressed
        this.leftButton.setBackground(Color.green);
        this.controller.setLeft(true);
    }//GEN-LAST:event_leftButtonKeyPressed

    private void revButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_revButtonKeyPressed
        this.revButton.setBackground(Color.green);
        this.controller.setRev(true);
    }//GEN-LAST:event_revButtonKeyPressed

    private void rightButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightButtonKeyPressed
        this.rightButton.setBackground(Color.green);
        this.controller.setRight(true);
    }//GEN-LAST:event_rightButtonKeyPressed

    private void leftServoButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftServoButtonKeyPressed
        this.leftServoButton.setBackground(Color.green);
        this.controller.setLeftServo(true);
    }//GEN-LAST:event_leftServoButtonKeyPressed

    private void startButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_startButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonKeyPressed

    private void rightServoButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightServoButtonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightServoButtonKeyPressed

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
            java.util.logging.Logger.getLogger(TempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TempGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fwdButton;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton leftServoButton;
    private javax.swing.JToggleButton manuelToggle;
    private javax.swing.JButton revButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton rightServoButton;
    private javax.swing.JSlider sensSlider;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //jLabel1.setText("" + code);

            if (code == KeyEvent.VK_DOWN) {
                this.revButtonKeyPressed(e);
            }
            if (code == KeyEvent.VK_UP) {
                this.fwdButtonKeyPressed(e);

            }
            if (code == KeyEvent.VK_LEFT) {
                this.leftButtonKeyPressed(e);

            }
            if (code == KeyEvent.VK_RIGHT) {
                this.rightButtonKeyPressed(e);

            }
            if (code == KeyEvent.VK_Z) {
                this.leftServoButtonKeyPressed(e);
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
