/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypePattern;

/**
 *
 * @author elcan
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
       ShapeCache.loadCache();
       
       Shape clonedShape1 = (Shape)  ShapeCache.getShape("1");
        System.out.println("Shape :"+clonedShape1.getType());
        Shape clonedShape2 = (Shape)  ShapeCache.getShape("2");
        System.out.println("Shape :"+clonedShape2.getType());
         Shape clonedShape3 = (Shape)  ShapeCache.getShape("3");
        System.out.println("Shape :"+clonedShape3.getType());
        
      
    }
    
}
