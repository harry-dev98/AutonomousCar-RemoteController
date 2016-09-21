/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotecontroller;

import java.io.IOException;
import java.net.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lars-harald
 */
public class UDPreceiver implements Runnable {
    private Semaphore semaphore;
    private Datahandler handler;
    private DatagramSocket receiveSocket;
    private int port;
    private Thread t;
    private boolean available;
    
    public UDPreceiver(Datahandler handler, int port, Semaphore semaphore){
        this.handler = handler;
        this.port = port;
        this.semaphore = semaphore;
    }
    
    public void start(){
        t = new Thread(this,"UDPReceiverThread");
        t.start();
    }
    
    public void run() {
        try {
            receiveSocket = new DatagramSocket(port);
            
            DatagramPacket receivePacket = new DatagramPacket(new byte[6],6);
            
            while(handler.getThreadStatus()){
                receiveSocket.receive(receivePacket);
                try {
                    semaphore.acquire();
                    if(!handler.getDataReceiveAvaliable())
                    handler.setValues("RECEIVE",receivePacket.getData());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (InterruptedException ex) {
                    Logger.getLogger(UDPreceiver.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    semaphore.release();
                }
            }
            
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            receiveSocket.close();
            System.out.println("receivesocket closed");
        }
    }
    
}
    
    

