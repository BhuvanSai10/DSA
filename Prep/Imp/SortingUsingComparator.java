package DSA.Prep.Imp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age =age;
    }
}

public class SortingUsingComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Bhuvan",21));
        students.add(new Student("Mukunda",19));
        students.add(new Student("Raghu",23));
        students.add(new Student("Venkat",20));
        students.add(new Student("vignesh",18));



//        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
////                if (o1.age>o2.age){
////                    return 1;
////                }else if(o1.age<o2.age){
////                    return -1;
////                }
////                else{
////                    return 0;
////                }
//                return s1.age-s2.age;
//
//            }
//        };
//
//        Collections.sort(students,comparator);
        Collections.sort(students,(s1,s2)->s1.age-s2.age); // lambda expression

        for (Student stud :students){
            System.out.print(stud.name+" ");
            System.out.println(stud.age);
        }
    }
}
