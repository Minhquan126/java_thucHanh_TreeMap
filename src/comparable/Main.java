package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("quan",20,"Nghe An");
        Student student1 = new Student("ngan",10,"Thanh Hoa");
        Student student2 = new Student("men",22,"Phu Tho");
        Student student3 = new Student("tuan anh",30,"Hung Yen");
        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(student);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(listStudent,ageComparator);
        System.out.println("Sawp xep theo tuoi");
        for (Student st: listStudent) {
            System.out.println(st.toString());
        }
    }


}
