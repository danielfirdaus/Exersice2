/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author Danielfirdaus
 */
public class personal {
    String name;
    String birth;
    String age;
    String gender;
    String citizenship;
    String Add;
    String hp;
    
    personal(){
        this.name = "Muhammad Daniel Firdaus Bin Mazilan";
        this.birth = " 2 July 1998";
        this.age = "22";
        this.gender = "Male";
        this.Add = "No 28, Jalan Pjs 2C/11G, \nTaman Medan 46000 \nPetaling Jaya, Selangor";
    }  
    
    personal (String a, String b){
        this.citizenship = a;
        this.hp = b;
    }
}
