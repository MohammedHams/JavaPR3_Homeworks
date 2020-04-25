package javaPR3_HW1;


/**
 *
 * @author MohammedHams
 */
abstract class Student
{
   int id;
   String name;
   String major;
   double grade;
  
   public Student(int id, String name, String major, double grade) {
       super();
       this.id = id;
       this.name = name;
       this.major = major;
       this.grade = grade;
   }
   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getMajor() {
       return major;
   }
   public void setMajor(String major) {
       this.major = major;
   }
   public double getGrade() {
       return grade;
   }
   public void setGrade(double grade) {
       this.grade = grade;
   }
   public Student() {
       super();
   }
   @Override
   public String toString() {
       return "Student [id=" + id + ", name=" + name + ", major=" + major
               + ", grade=" + grade + "]";
   }
  
  
}