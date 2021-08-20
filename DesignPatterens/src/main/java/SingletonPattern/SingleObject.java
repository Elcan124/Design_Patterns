/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author elcan
 */
public class SingleObject {
    public String name;
private SingleObject(){
    
    }
      
   
    private static SingleObject instance =new SingleObject();//111

    public static SingleObject getInstance() {
 
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World !!!");
    }
}
 