package ctisgolproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class GOLDrawer extends JFrame{
    //int cT = callThis;
    Block theBlock = new Block();
    int generation = 0;
    public GOLDrawer() {
        //0 is userInput, 1 is ex.1, 2 is ex.2, 3 is ex.3
        super("Square");
        setSize(960, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public void drawSquare(Graphics g, int x, int y, int size, boolean fill){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRect(x, y, size,size);
        if(fill==true){
        g2d.fillRect(x, y,size, size);
        }
    }
    
    public void drawGrid(Graphics g, int x, int y, int gridSize, int n){
        Graphics2D g2d = (Graphics2D) g;
        int squareSize = gridSize/n;
        //drawSquare(g,50,50,100);
        for (int i=0; i<n; i++){
            for (int j=0; j<n;j++){
                drawSquare(g,x+i*squareSize,y+j*squareSize,squareSize,false);
            }
        }
    }
    public void draw1(Graphics g, int x, int y, int gridSize, int n){
        ArrayList<ArrayList<Block>> theGrid = theBlock.initGrid(n); //grid setup
        for (int i=0;i<20;i++){//20 generations, parameterize this later
            
            theBlock.updateNeighborsAlive(theGrid, n);
            theBlock.updateAlive(theGrid,n);
            generation+=1;
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(CTISGOLPROJECT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println(generation);
    }
    
    @Override
    public void paint(Graphics g) {
        System.out.println(UserInput.uInput);
        System.out.println(GOLexamples.cT);
        super.paint(g);
        if (GOLexamples.cT==0){
            draw1(g,500,100,600,UserInput.gridLen);
        }
        //drawGrid(g,500,100,600,50);
        
    }
}
