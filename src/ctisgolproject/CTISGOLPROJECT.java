package ctisgolproject;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CTISGOLPROJECT {

    /*default parameters:
    grid = 10x10
    intial alive = 40% 
    */
    public static void main(String[] args) {
        GOLGUI theGUI = new GOLGUI();
        Block theBlock = new Block();
        ArrayList<ArrayList<Block>> theGrid = theBlock.initGrid(10); //grid setup
        int generation = 0;
        //JFrame startWindow = new JFrame("Jason and Suvesh's Conway's Game Of Life");
        //startWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //startWindow.getContentPane().add(theGUI);
        //startWindow.pack();
        theGUI.setVisible(true);   
        //start the simulation
        for (int i=0;i<20;i++){
            //methods: update neighbors alive
            theBlock.updateNeighborsAlive(theGrid, 10);
            //update alive
            theBlock.updateAlive(theGrid,10);
            generation+=1;
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(CTISGOLPROJECT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(generation);
    }
    /*
    parameterize initGrid, checkNeighbors
    */
    
}
