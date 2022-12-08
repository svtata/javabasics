import java.util.ArrayList;
import java.util.List;

public class ListCollectionClass {

    List<String> newList = new ArrayList<>();

    public void addAnimal(String animal) {
        newList.add(animal);
    }

    public void searchAnimal(String animal) {
        for (String desiredAnimal : newList) {
            if (desiredAnimal.equals(animal)) {
                System.out.println("Это животное есть в списке");
                return;
            }
        }
        System.out.println("Ничего не найдено");

    }

    public void removeAnimal(int index) {
        newList.remove(index);
    }

    public void printAnimal(){
        System.out.println(newList);
    }

    public static void main(String[] args) {
        ListCollectionClass animals = new ListCollectionClass();
        animals.addAnimal("бизон");
        animals.addAnimal("кабан");
        animals.addAnimal("кот");
        animals.addAnimal("кот");
        animals.addAnimal("лиса");
        animals.searchAnimal("кот");
        animals.removeAnimal(1);
        animals.printAnimal();
    }
}
