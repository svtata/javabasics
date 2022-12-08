import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, String> students = new java.util.TreeMap<>();
        students.put("Яковлев", "Иван");
        students.put("Семенов", "Кирилл");
        students.put("Ситников", "Андрей");
        students.put("Васильева", "Вера");
        System.out.println(students);
    }
}
