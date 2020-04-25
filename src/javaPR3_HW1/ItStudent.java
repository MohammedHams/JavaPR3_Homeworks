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
class ItStudent extends Student
{
   double midMarks,projectMarks,finalMarks;
  
  
  
  
   double calcualteGrade(double midM,double projectM,double finalM)
   {
       double grade=midM*0.30+projectM*0.30+finalM*40;
       return grade;
      
   }
  
   public ItStudent(int id, String name, String major, double grade) {
       super(id, name, major, grade);
   }

   public ItStudent() {
       super();

   }}