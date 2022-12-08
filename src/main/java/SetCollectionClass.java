import java.util.HashSet;
import java.util.Set;

public class SetCollectionClass {
    Set<Integer> newHashSet = new HashSet<>();

    public void addNumber(int number) {
        newHashSet.add(number);
    }

    public void searchNumber(int number) {
        for (int i = 0; i < newHashSet.size(); i++) {
            if (newHashSet.contains(number)) {
                System.out.println("Номер найден!");
                return;
            }
        }
        System.out.println("Номер не найден!");
    }

    public void removeNumber(int number) {
        newHashSet.remove(number);
    }

    public void printNumbers() {
        System.out.println(newHashSet);
    }


    public static void main(String[] args) {
        SetCollectionClass numbers = new SetCollectionClass();
        int a = 0;
        while (a <= 5) {
            numbers.addNumber(1 + a);
            a++;
        }
        numbers.searchNumber(4);
        numbers.removeNumber(4);
        numbers.printNumbers();
    }
}
