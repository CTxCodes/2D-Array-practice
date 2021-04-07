/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cjt1496
 */
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class ApplicantCompare {
    
    public void compareTwoStudents(){
        double studentOneGPA;
        double studentTwoGPA;
        
        double studentOneSAT;
        double studentTwoSAT;
        
        double studentOneACT;
        double studentTwoACT;
        
        Scanner input = new Scanner(System.in);
       
        double[][] students = new double[2][3];
        
        
            System.out.println("Enter First Student GPA score");
          
            students[0][0] = input.nextDouble(); 
            studentOneGPA = students[0][0];
            
            System.out.println("Enter First Student SAT score");
           
            students[0][1] = input.nextDouble();
            studentOneSAT = students[0][1];
            
            System.out.println("Enter First Student ACT score");
   
            students[0][2] = input.nextDouble();
            studentOneACT = students[0][2];
            
            System.out.println("Enter Second Student GPA score");
          
            students[1][0] = input.nextDouble();
            studentTwoGPA = students[1][0];
            
            System.out.println("Enter Second Student SAT score");
            
            students[1][1] = input.nextDouble();
            studentTwoSAT = students[1][1];
            
            System.out.println("Enter Second Student ACT score");
            
            students[1][2] = input.nextDouble();
            studentTwoACT = students[1][2];
            
            for (int row = 0; row < students.length; row++){
                System.out.printf("%7d Student: ", (row + 1));
                
            for (int col = 0; col < students[row].length; col++){
                
                System.out.print(students[row][col] + " "); //change the %5d to however much space you want
            }
                System.out.println(); //Makes a new row
        }
            
            if(studentOneGPA > studentTwoGPA){
                              System.out.println("Student One is more qualified their GPA is higher: " + studentOneGPA);
                         
                           } else if (studentOneGPA < studentTwoGPA){
                               System.out.println("Student Two is more qualified their GPA is higher: " + studentTwoGPA);
                          
                           }
                           if(studentOneSAT > studentTwoSAT){
                               System.out.println("Student One is more qualified their SAT score is higher: " + (int)studentOneSAT);
                           
                           } else if (studentOneSAT > studentOneSAT){
                               System.out.println("Student Two is more qualified their SAT score is higher: " + (int)studentTwoSAT);
                           }
                           if(studentOneACT > studentOneACT){
                               System.out.println("Student One is more qualified their ACT score is higher: " + (int)studentOneACT);
                           } else if (studentOneACT < studentTwoACT){
                               System.out.println("Student Two is more qualified their ACT score is higher: " + (int)studentTwoACT);
                           } else if (studentOneACT == studentTwoACT){
                               System.out.println("Both Students are qualified");
                           }
            
            

                         
  }
                
               
 } 
                   
           
              
        
               
        
    
        
    

