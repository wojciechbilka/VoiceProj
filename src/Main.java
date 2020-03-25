import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        List<Voice> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);

        for (Voice v : list) {
            v.giveVoice();
        }
    }
}
