import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Elefant elefant = new Elefant();

        List<Voice> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(elefant);

        for (Voice v : list) {
            v.giveVoice();
        }
    }
}
