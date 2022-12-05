package ctisgolproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

public class GOLDrawer extends JFrame{
    //int cT = callThis;
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

    
    @Override
    public void paint(Graphics g) {
        System.out.println(UserInput.uInput);
        System.out.println(GOLexamples.cT);
        super.paint(g);
        drawGrid(g,500,100,600,50);
        
    }
}
