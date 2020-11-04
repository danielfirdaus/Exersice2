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
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Biodata
        personal obj1 = new personal();
        personal obj2 = new personal("Malaysia", "017-8484717");
        System.out.println("| R E S U M E |");
        System.out.println("Name: "+ obj1.name);
        System.out.println("Birthday: "+ obj1.birth);
        System.out.println("Age: "+ obj1.age);
        System.out.println("Gender: "+ obj1.gender);
        System.out.println("Address: "+ obj1.Add);
        
        System.out.println("Citizenship: "+ obj2.citizenship);
        System.out.println("Handphone: "+ obj2.hp);
        
        //Result 
        Exam obj3 = new Exam('B');
        System.out.println("Result Exam STIA1113: "+ obj3.STIA1113);
        
        //CGPA
        CGPA c = new CGPA();
        c.printgpa();
        System.out.println("Final CGPA: "+ c.calcgpa());
        
        //workskill
        workskill obj4 = new workskill();
        workskill obj5 = new workskill("Best Student Award", "Drawing");
        System.out.println("Work Experience: " + obj4.experience);
        System.out.println("Skill: " + obj4.skill);
        
        System.out.println("Award: " + obj5.award);
        System.out.println("Talent: " + obj5.talent);
    }
    
}
