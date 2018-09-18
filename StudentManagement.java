import  java.util.ArrayList;
import java.util.*;
public class StudentManagement {
    ArrayList<Student> Mang = new ArrayList<Student>();

    public static void main(String[] args) {
        Student sv = new Student();
        sv.setName("Nguyen Huy Hoang");
        sv.setId("17021191");
        sv.setEmail("huyhoangbn199@gmail.com");
        sv.setGroup("Nhom 1");
        System.out.println(sv.getName());
        System.out.println(sv.getInfo());

        Student s1 = new Student();
        System.out.println(s1.getInfo());

        Student s2 = new Student("Nguyen Huy Hoàng", "17021191", "huyhoangbn199@gmail.com");
        System.out.println(s2.getInfo());

        Student s3 = new Student(sv);
        System.out.println(s3.getInfo());


        Student d1 = new Student(sv);
        d1.setGroup("K59CLC");
        Student d2 = new Student(sv);
        d2.setGroup("K59CLC");
        Student d3 = new Student(sv);
        d3.setGroup("K59CB");

        if (sameGroup(d1, d2)) System.out.println("Ban cung lop");
        else System.out.println("Ban khac lop");
        if (sameGroup(d2, d3)) System.out.println("Ban cung lop");
        else System.out.println(("Ban khac lop"));
        if (sameGroup(d1, d3)) System.out.println("Ban cung lop");
        else System.out.println(("Ban khac lop"));

    }

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equalsIgnoreCase(s2.getGroup())) return true;
        else return false;
    }

    public void studentsByGroup() {
        Student p = new Student();
        for (Student st : Mang) {
            Student s1 = new Student();
            System.out.println(p.getClass());
        }
    }
    public void removeStudent(String id)
    {
        for(int i=0;i<Mang.size();i++)
        {
            Student student =Mang.get(i);
            if(student.getId().equals(id))
            {
                Mang.remove(i);
                break;
            }
        }
    }

}