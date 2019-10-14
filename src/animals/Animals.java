/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author uxer
 */
public class Animals {

    static class Dog{
        String name;
        int age;
        String breed;
        
        public Dog(String newname){
            name = newname;
        }
        
        public void butangEdad(int newage){
            age = newage;
        }
        
        public void setBreed(String newbreed){
            breed = newbreed;
        }
    }
    
    public static void main(String[] args) {
    
        Dog dogObject = new Dog("Bruno");
        
        dogObject.butangEdad(5);
        dogObject.setBreed("Askal");
        
        System.out.println(dogObject.name + " is " + dogObject.age + " yrs old");
        System.out.println(dogObject.name + "'s breed is " + dogObject.breed);
    }
}
