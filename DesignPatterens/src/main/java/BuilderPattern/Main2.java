/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author elcan
 */
public class Main2 {
    public static void main(String[] args) {
        
        String s= "";
        System.out.println(s.valueOf(s)); 
        Person p = new Person.Builder()
                
              .whatisYourName("ELcan")
              .whatISYoursurname("Mahmudov")
              .howOldAreYou(20)
              .whatIsYouraddress(" ")
                .build();
        System.out.println(p.getName());
        System.out.println(p.getAddress());
        System.out.println(p.getSurname());
        System.out.println(p.getAge());
              
        Person p2 = new Person.Builder()
                .howOldAreYou(20)
                .whatIsYouraddress("None")
                .build();
      System.out.println(p2.getName());
        System.out.println(p2.getAddress());
        System.out.println(p2.getSurname());
        System.out.println(p2.getAge());
    }
}
