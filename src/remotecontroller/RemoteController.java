/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontroller;

/**
 *
 * @author mgrib
 */
public class RemoteController {

    /**
     * @param args the command line arguments
     */
    private static GUIController controller;
    private static TempGUI gui;
    
    public static void main(String[] args) {
        // TODO code application logic here
        controller = new GUIController();
        gui = new TempGUI();
        gui.setController(controller);
        gui.setVisible(true);
    }
    
}
