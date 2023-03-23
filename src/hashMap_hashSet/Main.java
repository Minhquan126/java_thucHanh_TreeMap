package hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("quan",23,"Nghe An");
        Student student2 = new Student("ngan",20,"Thanh Hoa");
        Student student3 = new Student("men",18,"Phu Tho");
        Map<Integer,Student> hashmap = new HashMap<>();
        hashmap.put(1,student1);
        hashmap.put(2,student2);
        hashmap.put(3,student3);
        hashmap.put(4,student1);
        for (Map.Entry<Integer,Student> student: hashmap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("-----set--------");
        Set<Student> listStudent = new HashSet<Student>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student1);
        for (Student student:listStudent) {
            System.out.println(student.toString());
        }
    }
}
