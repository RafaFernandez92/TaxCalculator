/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxcalculator;

/**
 *
 * @author Lecturer
 */
public class TaxCalculator1 {

    /**
     * @param args the command line arguments
     */
    public static double prsiResult(double income) {
             double prsi = income * 0.04;
             
             return prsi()
                     }
            
    public static double payeResult(double income) {
        
        double payeCutoff = 40000;
        paye = 0;
        if (income > payeCutoff) {
            paye += payeCutoff * 0.2;
            paye += (income - payeCutoff) * 0.4;
        } else {
            paye = income * 0.2;
    }
     }
    public static double uscResult(double income) {
        
        double usc = {0.005, 0.02, 0.04, 0.08};
        
        
        if (income < 12012) {
            usc = income * 0.005;
        } else {
            usc += 12012 * 0.005;
            income -= 12012;
        } 
        
        if (income < 10908) {
            usc += income * 0.02;
        } else {
            usc += 10908 * 0.02;
            income -= 10908;
        }
        
        if (income < 47198) {
            usc += income * 0.04;
        } else {
            usc += 47198 * 0.04;
            income -= 47198;
            
            usc += income * 0.08;
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        double income = 100000;
        double payeCutoff = 40000;
        double[] uscRates = {0.005, 0.02, 0.04, 0.08};
        double[] uscBands = {0, 12012, 10908, 47198};
        
//        double usc2 = 0;
//        double income2 = 50000;
//        for (int i = 0; i < uscRates.length-1; i++) {
//            if (income2 < uscBands[i+1]) {
//                usc2 += income2 * uscRates[i];
//                break;
//            } else {
//                usc2 += uscBands[i+1] * uscRates[i];
//                income2 -= 
//            }
//        }

        double income = 100000;
        
        double prsi = income * 0.04;
        
        double paye = 0;
        if (income > payeCutoff) {
            paye += payeCutoff * 0.2;
            paye += (income - payeCutoff) * 0.4;
        } else {
            paye = income * 0.2;
        }
        
        double usc = 0;
        if (income < 12012) {
            usc = income * 0.005;
        } else {
            usc += 12012 * 0.005;
            income -= 12012;
        } 
        
        if (income < 10908) {
            usc += income * 0.02;
        } else {
            usc += 10908 * 0.02;
            income -= 10908;
        }
        
        if (income < 47198) {
            usc += income * 0.04;
        } else {
            usc += 47198 * 0.04;
            income -= 47198;
            
            usc += income * 0.08;
        }
        
        System.out.println(paye + prsi + usc + income);
    }
    
}
