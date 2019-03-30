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
public class CollisionDetector {
    public boolean isCollide(Rectangle r1, Rectangle r2){
        
        int counter1 = 0;
        for(Point pt: r1.getPoints()){
            if(isPointInRectangle(pt, r2)){
                counter1++;
            }
        }
        
        //TEST r2
        int counter2 = 0;
        for(Point pt: r2.getPoints()){
            if(isPointInRectangle(pt, r1)){
                counter2++;
            }
        }
        return counter1>0 || counter2>0;
    }
    protected boolean isPointInRectangle(Point pt, Rectangle r){
        return pt.x>=r.x && pt.x<r.x+r.width && pt.y>=r.y && pt.y<r.y+r.height;
    }
}
