package Generics;

import java.util.Comparator;
import java.util.PriorityQueue;

 class pQueue {

     public static void main(String[] args) {
         PriorityQueue<Student> q=new PriorityQueue<Student>(new Comparator<Student>() {
             @Override
             public int compare(Student o1, Student o2) {
                 return o1.getGrade()-o2.getGrade();
             }
         });
         q.offer(new Student("pranshsant",'A'));

         q.offer(new Student("fureqan",'B'));

         q.offer(new Student("hasan",'c'));
         q.offer(new Student("fh",'A'));

         System.out.printf("quuete is %s\n",q);
     }



     private static class Student
     {
        private final String name;
        private  final char grade;

         public Student(String name, char grade) {
             this.name = name;
             this.grade = grade;
         }

         public String getName() {
             return name;
         }

         public char getGrade() {
             return grade;
         }

         @Override
         public String toString() {
             return "Student{" +
                     "name='" + name + '\'' +
                     ", grade=" + grade +
                     '}';
         }
     }
}
