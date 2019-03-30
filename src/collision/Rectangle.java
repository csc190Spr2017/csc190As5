/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collision;

/**
 *
 * @author csc190
 */
public class Rectangle {
    /**
     * x and y are coordinates of the left-top corner
     * x axis goes to right
     * y axis goes DOWN
     */
    protected int x, y;
    protected int width, height;
    
    
    /**
     * Constructor. Takes the left-top corner coordinates and dimension
     * @param x
     * @param y
     * @param w
     * @param h 
     */
    public Rectangle(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }
    
    public Point [] getPoints(){
        //BUG2 forgot to return 4 points
        Point [] arrPoints = new Point [] {
            new Point(x,y),
            new Point(x+width-1, y),
            new Point(x, y+height-1),
            new Point(x+width-1, y+height-1)            
        };
        return arrPoints;
    }
    
     @Override
    public String toString(){
        return "(" + x + ", " + y + ", " + width + ", " + height + ")";
    }
    
    
}
