/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterPattern;

/**
 *
 * @author elcan
 */
public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
   }

    @Override
    public void playMp4(String fileName) {
          System.out.println("Playing mp4 file. Name: "+ fileName);
          
   }
    
}
