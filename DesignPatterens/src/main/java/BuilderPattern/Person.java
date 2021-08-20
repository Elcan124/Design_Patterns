/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;


public class Person {

    private String name="", surname="", address="";
      private int age;
      public Person(){
      }

    private Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.age = builder.age;
        
    }

    public int getAge() {
        return age;
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{

        private String name, surname, address;
        private int age;

        public Builder(){ }

        public Builder whatisYourName(String name){
            this.name = name;
            return this;
        }
        
        public Builder whatISYoursurname(String surname){
            this.surname = surname;
            return this;
        }
        
        public Builder whatIsYouraddress(String address){
            this.address = address;
            return this;
        }
        public Builder howOldAreYou (int age){
            this.age= age;
            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }

}
