/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontroller;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observer;
import org.opencv.core.Core;
import java.util.Timer;

/**
 *
 * @author Magnus Gribbestad
 */
public class GUI extends javax.swing.JFrame implements KeyListener { // implement Observer

    private DaemonThread myThread;
    private GUIController controller;
    private boolean fwd,left,rev,right,leftServo,rightServo;
    private int sens;
 
    public GUI() {
        Timer fTimer = new Timer();
        this.controller = new GUIController();
        fTimer.scheduleAtFixedRate(controller, 0, 2000);
        initComponents();
        this.sens = 50;
        this.setup();
        
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        
        
        // GraphicsEnvironment env = 
        //        GraphicsEnvironment.getLocalGraphicsEnvironment();
        //this.setMaximizedBounds(env.getMaximumWindowBounds());
        //this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cameraPanel = new javax.swing.JPanel();
        rightPanel = new javax.swing.JPanel();
        rightLowPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        rightButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        revButton = new javax.swing.JButton();
        fwdButton = new javax.swing.JButton();
        leftServoButton = new javax.swing.JButton();
        rightServoButton = new javax.swing.JButton();
        rightCenPanel = new javax.swing.JPanel();
        setupPanel = new javax.swing.JPanel();
        sensLabel = new javax.swing.JLabel();
        sensSlider = new javax.swing.JSlider();
        sensPercentLabel = new javax.swing.JLabel();
        modeToggleButton = new javax.swing.JToggleButton();
        startToggle = new javax.swing.JToggleButton();
        radioAuto = new javax.swing.JRadioButton();
        radioMan = new javax.swing.JRadioButton();
        radioSysOn = new javax.swing.JRadioButton();
        radioSysOff = new javax.swing.JRadioButton();
        rightTopPanel = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        xNameLabel = new javax.swing.JLabel();
        yNameLabel = new javax.swing.JLabel();
        distanceNameLabel = new javax.swing.JLabel();
        xCoordLabel = new javax.swing.JLabel();
        yCoordLabel = new javax.swing.JLabel();
        distanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Video stream:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout cameraPanelLayout = new javax.swing.GroupLayout(cameraPanel);
        cameraPanel.setLayout(cameraPanelLayout);
        cameraPanelLayout.setHorizontalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        cameraPanelLayout.setVerticalGroup(
            cameraPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cameraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cameraPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        controlPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controls:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        rightButton.setText("Right");
        rightButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rightButtonKeyReleased(evt);
            }
        });

        leftButton.setText("Left");
        leftButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leftButtonKeyReleased(evt);
            }
        });

        revButton.setText("Rev");
        revButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                revButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                revButtonKeyReleased(evt);
            }
        });

        fwdButton.setText("Fwd");
        fwdButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fwdButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fwdButtonKeyReleased(evt);
            }
        });

        leftServoButton.setText("Left Servo");
        leftServoButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                leftServoButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leftServoButtonKeyReleased(evt);
            }
        });

        rightServoButton.setText("Right Servo");
        rightServoButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rightServoButtonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rightServoButtonKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fwdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(controlPanelLayout.createSequentialGroup()
                                .addComponent(revButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addComponent(leftServoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightServoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftServoButton)
                    .addComponent(rightServoButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(fwdButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rightButton)
                    .addComponent(leftButton)
                    .addComponent(revButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout rightLowPanelLayout = new javax.swing.GroupLayout(rightLowPanel);
        rightLowPanel.setLayout(rightLowPanelLayout);
        rightLowPanelLayout.setHorizontalGroup(
            rightLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rightLowPanelLayout.setVerticalGroup(
            rightLowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightLowPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setupPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Setup:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        sensLabel.setText("Sensitivity:");

        sensSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sensSliderStateChanged(evt);
            }
        });
        sensSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sensSliderMouseReleased(evt);
            }
        });

        sensPercentLabel.setText("100%");

        modeToggleButton.setText("Auto mode");
        modeToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeToggleButtonMouseClicked(evt);
            }
        });

        startToggle.setText("Start system");
        startToggle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startToggleMouseClicked(evt);
            }
        });

        radioAuto.setText("Auto mode");

        radioMan.setText("Manual mode");

        radioSysOn.setText("System on");

        radioSysOff.setText("System off");

        javax.swing.GroupLayout setupPanelLayout = new javax.swing.GroupLayout(setupPanel);
        setupPanel.setLayout(setupPanelLayout);
        setupPanelLayout.setHorizontalGroup(
            setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setupPanelLayout.createSequentialGroup()
                        .addComponent(sensLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sensSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sensPercentLabel))
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addComponent(startToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSysOn)
                                    .addComponent(radioSysOff)))
                            .addGroup(setupPanelLayout.createSequentialGroup()
                                .addComponent(modeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioAuto)
                                    .addComponent(radioMan))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        setupPanelLayout.setVerticalGroup(
            setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setupPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addComponent(radioSysOn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioSysOff)))
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sensPercentLabel)
                    .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(sensSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sensLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(setupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(setupPanelLayout.createSequentialGroup()
                        .addComponent(radioAuto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioMan)))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout rightCenPanelLayout = new javax.swing.GroupLayout(rightCenPanel);
        rightCenPanel.setLayout(rightCenPanelLayout);
        rightCenPanelLayout.setHorizontalGroup(
            rightCenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightCenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rightCenPanelLayout.setVerticalGroup(
            rightCenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightCenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inputs:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        xNameLabel.setText("X-coordinate:");

        yNameLabel.setText("Y-coordinate:");

        distanceNameLabel.setText("Distance:");

        xCoordLabel.setText("56,000052565");

        yCoordLabel.setText("34,788864323");

        distanceLabel.setText("12,32434344");

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xNameLabel)
                    .addComponent(distanceNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yNameLabel))
                .addGap(48, 48, 48)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(distanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yCoordLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xCoordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xCoordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yCoordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanceNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(distanceLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout rightTopPanelLayout = new javax.swing.GroupLayout(rightTopPanel);
        rightTopPanel.setLayout(rightTopPanelLayout);
        rightTopPanelLayout.setHorizontalGroup(
            rightTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightTopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        rightTopPanelLayout.setVerticalGroup(
            rightTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightTopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightLowPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightCenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightPanelLayout.createSequentialGroup()
                .addComponent(rightTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightCenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightLowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//    @Override
//    private void update(){
//        
//    }
    
    private void fwdButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fwdButtonKeyPressed
        this.fwdButton.setBackground(Color.green);
        if(!this.fwd){
        this.controller.setFwd(true);
        this.fwd = true;
        }
    }//GEN-LAST:event_fwdButtonKeyPressed

    private void fwdButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fwdButtonKeyReleased
        this.fwdButton.setBackground(null);
        this.controller.setFwd(false);
        this.fwd = false;
    }//GEN-LAST:event_fwdButtonKeyReleased

    private void leftButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftButtonKeyPressed
        this.leftButton.setBackground(Color.green);
        if(!this.left){
        this.controller.setLeft(true);
        this.left = true;
        }
    }//GEN-LAST:event_leftButtonKeyPressed

    private void leftButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftButtonKeyReleased
        this.leftButton.setBackground(null);
        this.controller.setLeft(false);
        this.left = false;
    }//GEN-LAST:event_leftButtonKeyReleased

    private void revButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_revButtonKeyPressed
        this.revButton.setBackground(Color.green);
        if(!this.rev){
        this.controller.setRev(true);
        this.rev = true;
        }
    }//GEN-LAST:event_revButtonKeyPressed

    private void revButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_revButtonKeyReleased
        this.revButton.setBackground(null);
        this.controller.setRev(false);
        this.rev = false;
    }//GEN-LAST:event_revButtonKeyReleased

    private void rightButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightButtonKeyPressed
        this.rightButton.setBackground(Color.green);
        if(!this.right){
        this.controller.setRight(true);
        this.right = true;
        }
    }//GEN-LAST:event_rightButtonKeyPressed

    private void rightButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightButtonKeyReleased
        this.rightButton.setBackground(null);
        this.controller.setRight(false);
        this.right = false;
    }//GEN-LAST:event_rightButtonKeyReleased

    private void leftServoButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftServoButtonKeyPressed
        this.leftServoButton.setBackground(Color.green);
        if(!this.leftServo){
        this.controller.setLeftServo(true);
        this.leftServo = true;
        }
    }//GEN-LAST:event_leftServoButtonKeyPressed

    private void leftServoButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leftServoButtonKeyReleased
        this.leftServoButton.setBackground(null);
        this.controller.setLeftServo(false);
        this.leftServo = false;
    }//GEN-LAST:event_leftServoButtonKeyReleased

    private void rightServoButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightServoButtonKeyPressed
        this.rightServoButton.setBackground(Color.green);
        if(!this.rightServo){
        this.controller.setRightServo(true);
        this.rightServo = true;
        }
    }//GEN-LAST:event_rightServoButtonKeyPressed

    private void rightServoButtonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rightServoButtonKeyReleased
        this.rightServoButton.setBackground(null);
        this.controller.setRightServo(false);
        this.rightServo = false;
    }//GEN-LAST:event_rightServoButtonKeyReleased

    private void startToggleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startToggleMouseClicked
        if(this.startToggle.isSelected()){
            this.controller.setStart(true);
            this.startToggle.setText("Stop system");
            this.radioSysOn.setSelected(true);
            this.radioSysOff.setSelected(false);
            this.cameraSetup();
        }
        else{
            this.controller.setStart(false);
            this.startToggle.setText("Start system");
            this.radioSysOn.setSelected(false);
            this.radioSysOff.setSelected(true);
            this.stopCamera();
        }
    }//GEN-LAST:event_startToggleMouseClicked

    private void modeToggleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeToggleButtonMouseClicked
        if(this.modeToggleButton.isSelected()){
            this.controller.setAuto(true);
            this.modeToggleButton.setText("Man mode");
            this.radioAuto.setSelected(true);
            this.radioMan.setSelected(false);
        }
        else{
            this.controller.setAuto(false);
            this.modeToggleButton.setText("Auto mode");
            this.radioAuto.setSelected(false);
            this.radioMan.setSelected(true);

        }
    }//GEN-LAST:event_modeToggleButtonMouseClicked

    private void sensSliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sensSliderMouseReleased
        this.sens = this.sensSlider.getValue();
        this.controller.setSens(this.sens);
        this.sensPercentLabel.setText(""+this.sens+"%");
    }//GEN-LAST:event_sensSliderMouseReleased

    private void sensSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sensSliderStateChanged
        //this.sens = this.sensSlider.getValue();
        //this.controller.setSens(this.sens);
        //this.sensPercentLabel.setText(""+this.sens+"%");

    }//GEN-LAST:event_sensSliderStateChanged

   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cameraPanel;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel distanceLabel;
    private javax.swing.JLabel distanceNameLabel;
    private javax.swing.JButton fwdButton;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton leftButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton leftServoButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JToggleButton modeToggleButton;
    private javax.swing.JRadioButton radioAuto;
    private javax.swing.JRadioButton radioMan;
    private javax.swing.JRadioButton radioSysOff;
    private javax.swing.JRadioButton radioSysOn;
    private javax.swing.JButton revButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JPanel rightCenPanel;
    private javax.swing.JPanel rightLowPanel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JButton rightServoButton;
    private javax.swing.JPanel rightTopPanel;
    private javax.swing.JLabel sensLabel;
    private javax.swing.JLabel sensPercentLabel;
    private javax.swing.JSlider sensSlider;
    private javax.swing.JPanel setupPanel;
    private javax.swing.JToggleButton startToggle;
    private javax.swing.JLabel xCoordLabel;
    private javax.swing.JLabel xNameLabel;
    private javax.swing.JLabel yCoordLabel;
    private javax.swing.JLabel yNameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

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
            if (code == KeyEvent.VK_A) {
                this.leftServoButtonKeyPressed(e);

 
            }
            if (code == KeyEvent.VK_Z) {
                this.rightServoButtonKeyPressed(e);

            }

    }

    @Override
    public void keyReleased(KeyEvent e) {
         int code = e.getKeyCode();

            if (code == KeyEvent.VK_DOWN) {
                this.revButtonKeyReleased(e);
                //this.revButton.setBackground(null);
            }
            if (code == KeyEvent.VK_UP) {
                this.fwdButtonKeyReleased(e);
                //this.fwdButton.setBackground(null);
            }
            if (code == KeyEvent.VK_LEFT) {
                this.leftButtonKeyReleased(e);
                //this.leftButton.setBackground(null);
            }
            if (code == KeyEvent.VK_RIGHT) {
                this.rightButtonKeyReleased(e);
                //this.rightButton.setBackground(null);
            }
            if (code == KeyEvent.VK_A) {
                this.leftServoButtonKeyReleased(e);
                //this.leftServoButton.setBackground(null);
            }
            if (code == KeyEvent.VK_Z) {
                this.rightServoButtonKeyReleased(e);
                //this.rightServoButton.setBackground(null);
            }
    }
    
    public void setup(){
        this.sensSlider.setMinimum(0);
        this.sensSlider.setMaximum(100); 
        this.sensSlider.setValue(this.sens);
        this.sensPercentLabel.setText(""+this.sens+"%");
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        fwdButton.setFocusable(false);
        revButton.setFocusable(false);
        leftButton.setFocusable(false);
        rightButton.setFocusable(false);
        leftServoButton.setFocusable(false);
        rightServoButton.setFocusable(false);
        startToggle.setFocusable(false);
        modeToggleButton.setFocusable(false);
        sensSlider.setFocusable(false);
        this.radioMan.setSelected(true);
        this.radioSysOff.setSelected(true);
    }
        private void cameraSetup(){
        myThread = new DaemonThread(cameraPanel);
        Thread t = new Thread(myThread);
        t.setDaemon(true);
        myThread.runnable = true;
        t.start();
    }
        private void stopCamera(){
           if(myThread != null){
              myThread.realseSource();
              //myThread.runnable = false;
              myThread.setRunnable(false);
           }
            
        }
}
