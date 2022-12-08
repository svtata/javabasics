import java.util.HashMap;
import java.util.Map;

public class MapClass {
    Map<String, Integer> newMap = new HashMap<>();

    public void addStudent(String student, Integer mark) {
        newMap.put(student, mark);
    }

    public int searchStudentMark(String student) {
        return newMap.get(student);
    }

    public void removeStudent(String student) {
        newMap.remove(student);
    }

    public void printStudents(){
        System.out.println(newMap);
    }

    public static void main(String[] args) {
        MapClass students = new MapClass();
        students.addStudent("Иванов", 4);
        students.addStudent("Петрова", 3);
        students.addStudent("Андреев", 5);
        students.addStudent("Сидорова", 5);
        System.out.println(students.searchStudentMark("Андреев"));
        students.removeStudent("Андреев");
        students.printStudents();
    }
}
