/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypePattern;

import java.util.Hashtable;

/**
 *
 * @author elcan
 */
public class ShapeCache {
    private static Hashtable<String , Shape> shapeMap = new Hashtable<String,Shape>();
    
    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return  (Shape) cachedShape.clone();
    }
    
    public static void loadCache(){
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);
        
        Square sq= new Square();
        sq.setId("2");
        shapeMap.put(sq.getId(), sq);
        
        
        Rectangle rtg = new Rectangle();
        rtg.setId("3");
        shapeMap.put(rtg.getId(), rtg);
    }
    
    
}
