/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProxyPattern;

/**
 *
 * @author elcan
 */
public class ProxyImage implements Image{
    private RealImage realImage;
   private String fileName;
public ProxyImage(){
    
}
   public ProxyImage(String fileName){
      this.fileName = fileName;
   }

   @Override
   public void display() {
       System.out.println("Proxyden SALAM");
      if(realImage == null){
         realImage = new RealImage(fileName);
          System.out.println("as");
      }
      realImage.display();
       
   }
    
}
