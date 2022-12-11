package ctisgolproject;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Block {
    //attributes
    boolean alive;
    int neighborsAlive;
    Point pos;
    public Block() {
    }

    public Block(boolean alive, int neighborsAlive, Point pos) {
        this.alive = alive;
        this.neighborsAlive = neighborsAlive;
        this.pos = pos;
    }
    
    public ArrayList<ArrayList<Block>> initGrid(int N){ //replace 10 with n/size/number from scanner
        Random generator = new Random(); //generate the initial state
        ArrayList<ArrayList<Block>> grid = new ArrayList<>();
        for (int i=0; i<N; i++){
            ArrayList<Block> rows = new ArrayList();
            for (int j=0; j<N; j++){
                double living = generator.nextDouble();
                Point p = new Point(i,j);
                if (living<0.4){
                    //System.out.println("yay");
                    Block b = new Block(true,2,p);
                    rows.add(b);
                }
                else{
                    //System.out.println("nay");
                    Block b = new Block(false,2,p);
                    rows.add(b);
                }
            }
            grid.add(rows);
        }
        //System.out.print(grid.get(0).get(0).getPos()+"\n");
        return grid;
    }
    public ArrayList<ArrayList<Block>> initCheckerboardGrid(int N){ //replace 10 with n/size/number from scanner
        ArrayList<ArrayList<Block>> grid = new ArrayList<>();
        for (int i=0; i<N; i++){
            ArrayList<Block> rows = new ArrayList();
            for (int j=0; j<N; j++){
                Point p = new Point(i,j);
                if ((i+j)%2==0){
                    //System.out.println("yay");
                    Block b = new Block(true,2,p);
                    rows.add(b);
                }
                else{
                    //System.out.println("nay");
                    Block b = new Block(false,2,p);
                    rows.add(b);
                }
            }
            grid.add(rows);
        }
        //System.out.print(grid.get(0).get(0).getPos()+"\n");
        return grid;
    }
    public ArrayList<ArrayList<Block>> inittheEx2Grid(int N){ //replace 10 with n/size/number from scanner // Just changed the parameters in the second loop to give it a different effect
        ArrayList<ArrayList<Block>> grid = new ArrayList<>();
        for (int i=0; i<N; i++){
            ArrayList<Block> rows = new ArrayList();
            for (int j=0; j<N; j++){
                Point p1 = new Point(i,j);
                if ((i+j)/2==5||(i+j)==10){
                    //System.out.println("yay");
                    Block b = new Block(true,2,p1);
                    rows.add(b);
                }
                else{
                    //System.out.println("nay");
                    Block b = new Block(false,2,p1);
                    rows.add(b);
                }
            }
            grid.add(rows);
        }
        //System.out.print(grid.get(0).get(0).getPos()+"\n");
        return grid;
    }
    public ArrayList<ArrayList<Block>> inittheEx3Grid(int N)throws Exception{ //replace 10 with n/size/number from scanner // Just changed the parameters in the second loop to give it a different effect
    ArrayList<ArrayList<Block>> grid = new ArrayList<>();
    ArrayList<String> listAlive = new ArrayList<>();
    ArrayList<Point> listPointAlive = new ArrayList<>();

    try {
        File file = new File("C:\\Users\\suves\\Desktop\\glidergun.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String[] splitted = scan.nextLine().split("\\s+");
            //System.out.println(Arrays.toString(splitted));
            for (String a : splitted){
                listAlive.add(a);
            }
        }
        System.out.println(listAlive);
        System.out.println(Integer.parseInt((listAlive.get(0))));
        for (int i=0;i<listAlive.size()/2;i++){
            int a = Integer.parseInt((listAlive.get(i*2)));
            int b = Integer.parseInt((listAlive.get(i*2+1)));
            Point x = new Point(a,b);
            listPointAlive.add(x);
        }

        for (int i=0; i<N; i++){
            ArrayList<Block> rows = new ArrayList();
            for (int j=0; j<N; j++){
                Point p1 = new Point(i,j);
                if ((listPointAlive.contains(p1))){
                    //System.out.println("yay");
                    Block b = new Block(true,2,p1);
                    rows.add(b);
                }
                else{
                    //System.out.println("nay");
                    Block b = new Block(false,2,p1);
                    rows.add(b);
                }
            }
            grid.add(rows);
        }
        //System.out.print(grid.get(0).get(0).getPos()+"\n");
        return grid;
    } catch (Exception e) {
        System.out.println("An error occurred while reading from the file: " + e.getMessage());
        throw e;
    }
        /*ArrayList<ArrayList<Block>> grid = new ArrayList<>();
        ArrayList<String> listAlive = new ArrayList<>();
        ArrayList<Point> listPointAlive = new ArrayList<>();
        File file = new File("C:\\Users\\suves\\Desktop\\glidergun.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()) {
            String[] splitted = scan.nextLine().split("\\s+");
            //System.out.println(Arrays.toString(splitted));
            for (String a : splitted){
                listAlive.add(a);
            }
        }
        System.out.println(listAlive);
        System.out.println(Integer.parseInt((listAlive.get(0))));
        for (int i=0;i<listAlive.size()/2;i++){
            int a = Integer.parseInt((listAlive.get(i*2)));
            int b = Integer.parseInt((listAlive.get(i*2+1)));
            Point x = new Point(a,b);
            listPointAlive.add(x);
        }
       
        for (int i=0; i<N; i++){
            ArrayList<Block> rows = new ArrayList();
            for (int j=0; j<N; j++){
                Point p1 = new Point(i,j);
                if ((listPointAlive.contains(p1))){
                    //System.out.println("yay");
                    Block b = new Block(true,2,p1);
                    rows.add(b);
                }
                else{
                    //System.out.println("nay");
                    Block b = new Block(false,2,p1);
                    rows.add(b);
                }
            }
            grid.add(rows);
        }
        //System.out.print(grid.get(0).get(0).getPos()+"\n");
        return grid;*/
    }
    public void checkCorners(ArrayList<ArrayList<Block>> grid, int N){
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        
        if (grid.get(0).get(1).isAlive()==true){ count1+=1; }
        if (grid.get(1).get(0).isAlive()==true){ count1+=1; }
        if (grid.get(1).get(1).isAlive()==true){ count1+=1; }
        grid.get(0).get(0).setNeighborsAlive(count1);
        
        if (grid.get(N-1).get(0).isAlive()==true){ count2+=1; }
        if (grid.get(N).get(1).isAlive()==true){ count2+=1; }
        if (grid.get(N-1).get(1).isAlive()==true){ count2+=1; }
        grid.get(N).get(0).setNeighborsAlive(count2);

        if (grid.get(0).get(N-1).isAlive()==true){ count3+=1; }
        if (grid.get(1).get(N).isAlive()==true){ count3+=1; }
        if (grid.get(1).get(N-1).isAlive()==true){ count3+=1; }
        grid.get(0).get(N).setNeighborsAlive(count3);

        if (grid.get(N).get(N-1).isAlive()==true){ count4+=1; }
        if (grid.get(N-1).get(N).isAlive()==true){ count4+=1; }
        if (grid.get(N-1).get(N-1).isAlive()==true){ count4+=1; }
        grid.get(N).get(N).setNeighborsAlive(count4);
    }
    public void checkEdges(ArrayList<ArrayList<Block>> grid, int N){
        for (int i=1; i<N; i++){
            int countLeft = 0;
            if (grid.get(0).get(i-1).isAlive()==true){ countLeft+=1; }
            if (grid.get(1).get(i-1).isAlive()==true){ countLeft+=1; }
            if (grid.get(1).get(i).isAlive()==true){ countLeft+=1; }
            if (grid.get(1).get(i+1).isAlive()==true){ countLeft+=1; }
            if (grid.get(0).get(i+1).isAlive()==true){ countLeft+=1; }
            grid.get(0).get(i).setNeighborsAlive(countLeft);
        }
        for (int i=1; i<N; i++){
            int countRight = 0;
            if (grid.get(N).get(i-1).isAlive()==true){ countRight+=1; }
            if (grid.get(N-1).get(i-1).isAlive()==true){ countRight+=1; }
            if (grid.get(N-1).get(i).isAlive()==true){ countRight+=1; }
            if (grid.get(N-1).get(i+1).isAlive()==true){ countRight+=1; }
            if (grid.get(N).get(i+1).isAlive()==true){ countRight+=1; }
            grid.get(N).get(i).setNeighborsAlive(countRight);
        }
        for (int i=1; i<N; i++){
            int countTop = 0;
            if (grid.get(i-1).get(0).isAlive()==true){ countTop+=1; }
            if (grid.get(i-1).get(1).isAlive()==true){ countTop+=1; }
            if (grid.get(i).get(1).isAlive()==true){ countTop+=1; }
            if (grid.get(i+1).get(1).isAlive()==true){ countTop+=1; }
            if (grid.get(i+1).get(0).isAlive()==true){ countTop+=1; }
            grid.get(i).get(0).setNeighborsAlive(countTop);
        }
        for (int i=1; i<N; i++){
            int countBot = 0;
            if (grid.get(i-1).get(N).isAlive()==true){ countBot+=1;}
            if (grid.get(i-1).get(N-1).isAlive()==true){ countBot+=1;}
            if (grid.get(i).get(N-1).isAlive()==true){ countBot+=1; }
            if (grid.get(i+1).get(N-1).isAlive()==true){ countBot+=1;}
            if (grid.get(i+1).get(N).isAlive()==true){ countBot+=1; }
            grid.get(i).get(N).setNeighborsAlive(countBot);
        }
    }
    public void checkCenter(ArrayList<ArrayList<Block>> grid, int N){
        for (int i=1; i<N; i++){ //1-8, 1-8 in a 0-9 boundary
            for (int j=1; j<N; j++){
                int countCenter = 0;
                if (grid.get(i+1).get(j).isAlive()==true){ countCenter+=1; }
                if (grid.get(i+1).get(j+1).isAlive()==true){ countCenter+=1; }
                if (grid.get(i).get(j+1).isAlive()==true){ countCenter+=1; }
                if (grid.get(i-1).get(j+1).isAlive()==true){ countCenter+=1; }
                if (grid.get(i-1).get(j).isAlive()==true){ countCenter+=1; }
                if (grid.get(i-1).get(j-1).isAlive()==true){ countCenter+=1; }
                if (grid.get(i).get(j-1).isAlive()==true){ countCenter+=1; }
                if (grid.get(i+1).get(j-1).isAlive()==true){ countCenter+=1; }
                grid.get(i).get(j).setNeighborsAlive(countCenter);
            }
        }
    }
    public void updateNeighborsAlive(ArrayList<ArrayList<Block>> grid, int N){
        //edge cases: corners, edges, everything else
        //replace 9 with len-1 for each check method
        checkCorners(grid, N-1);
        checkEdges(grid, N-1);
        checkCenter(grid, N-1);
    }
    public void updateAlive(ArrayList<ArrayList<Block>> grid, int N){
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                boolean deadCon1 = grid.get(i).get(j).getNeighborsAlive()==2;
                boolean deadCon2 = grid.get(i).get(j).getNeighborsAlive()==3;
                boolean aliveCon = grid.get(i).get(j).getNeighborsAlive()==3;
                if (grid.get(i).get(j).isAlive()){
                    if (!(deadCon1||deadCon2)){
                        grid.get(i).get(j).setAlive(false);
                    }
                }
                else{//cell is currently dead
                    if (aliveCon){
                        grid.get(i).get(j).setAlive(true);
                    }
                }
            }
        }
    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getNeighborsAlive() {
        return neighborsAlive;
    }
    public void setNeighborsAlive(int neighborsAlive) {
        this.neighborsAlive = neighborsAlive;
    }

    public Point getPos() {
        return pos;
    }
    public void setPos(Point pos) {
        this.pos = pos;
    }
    
}
