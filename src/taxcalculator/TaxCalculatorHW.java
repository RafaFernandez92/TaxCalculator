/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculator;

import java.util.Scanner;

/**
 *
 * @author Lecturer
 */
public class TaxCalculatorHW {


    public static void main(String[] args) {
        double income = userEntry ();
        double paye = payeTotal(income);
        double prsi = prsiTotal(income);
        double usc = uscTotal(income);
        double TotalTax = (paye + prsi + usc);
        double salaryAT = income - TotalTax;
    
    System.out.println("Introduce your salary: " + income);
    System.out.println("Paye is equal to: " + paye);
    System.out.println("Prsi is equal to: " + prsi);
    System.out.println("Usc is equal to: " + usc);
    System.out.println("Your salary after taxes is:" + salaryAT);
    }       
    
    public static double userEntry (){
        Scanner Data = new Scanner (System.in);
        double income = Data.nextDouble();
        return income;
    }
    
    public static double payeTotal(double income) {
        double paye = 0;
        double payeCutoff = 40000;
        if (income > payeCutoff) {
            paye += payeCutoff * 0.2;
            paye += (income - payeCutoff) * 0.4;
        } else {
            paye = income * 0.2;
        }
        return paye;
    }
    
    public static double prsiTotal(double income) {
        double prsi = income * 0.04;
        
        return prsi;}
    
    public static double uscTotal(double income) {
        double usc = 0;
        if (income < 12012) {
            usc = income * 0.005;
        } else {
            usc += 12012 * 0.005;
            income -= 12012; } 
        if (income < 10908) {
            usc += income * 0.02;
        } else {
            usc += 10908 * 0.02;
            income -= 10908;}
        if (income < 47198) {
            usc += income * 0.04;
        } else {
            usc += 47198 * 0.04;
            income -= 47198;}
            
        usc += income * 0.08;
        return usc;   
          }
        
        
        
        
   
    }
    
    
    
    
    
    
    
 //   public static double
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

