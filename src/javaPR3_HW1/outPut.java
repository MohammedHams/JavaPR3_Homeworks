/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaPR3_HW1;
/**
 *
 * @author MohammedHams
 */
import java.util.*;
import java.io.*;
public class outPut {
   public static void main(String[] args) throws IOException
   {
Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       Student[] studentList=new Student[size];
       for(int i=0;i<size;i++)
       {
           int id=sc.nextInt();
           String name=sc.next();
           String major=sc.next();
           System.out.println("1.It Student\n2.Arts Student");
           int choice=sc.nextInt();
           if(choice==1)
           {
               double midM=sc.nextDouble();
               double projectM=sc.nextDouble();
               double finalM=sc.nextDouble();
               ItStudent itStudent=new ItStudent();
               double grade=itStudent.calcualteGrade(midM,projectM,finalM);
               Student student=new ItStudent(id,name,major,grade);
               studentList[i]=student;
              
           }
           else
           {
               double midM=sc.nextDouble();
               double projectM=sc.nextDouble();
               double finalM=sc.nextDouble();
               ArtStudent artStudent=new ArtStudent();
               double grade=artStudent.calcualteGrade(midM,projectM,finalM);
               Student student=new ArtStudent(id,name,major,grade);
               studentList[i]=student;
              
           }
                      
       }
       //Now we need to sort the objects in descending order according to grade;


       //Here we are sorting the array of objects according to grade in descending order by using lamba expressions
       Arrays.sort(studentList, (a,b) -> Double.compare(b.getGrade(),a.getGrade()));
       BufferedWriter outputWriter = null;
outputWriter = new BufferedWriter(new FileWriter("arroutput.txt"));
       for (Student studentList1 : studentList) {
//writing output into text file
outputWriter.write(studentList1.toString());
outputWriter.newLine();
System.out.println(studentList1.toString());
       }
       outputWriter.flush();
   outputWriter.close();
   }}