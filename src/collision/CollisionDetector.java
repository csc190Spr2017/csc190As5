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
       //calculate the intersection
       int x1 = Integer.max(r1.x, r2.x);
       int x2 = Integer.min(r1.x+r1.width-1, r2.x+r2.width-1);
       int y1 = Integer.max(r1.y, r2.y);
       int y2 = Integer.min(r1.y + r1.height-1, r2.y + r2.height-1);
       return x2>=x1 && y2>=y1;
    }
  
}
