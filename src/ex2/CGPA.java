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
public class CGPA {
    double gpa[] = new double [4];
    double sum;
    double cgpa;
    
CGPA(){
    this.gpa = new double [] {3.63,3.5,3.3};
}

public void printgpa(){
    for (int i=0;i<gpa.length;i++){
        System.out.println("GPA semester" + (i+1) + ":" + gpa[i]);
    }
}

public double calcgpa(){
    for(int i=0;i<gpa.length;i++){
        sum += gpa[i];
    }
    cgpa = sum/gpa.length;
    return cgpa;
}
}
