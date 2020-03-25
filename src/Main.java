import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Elephant elephant = new Elephant();
        Lion lion = new Lion();
        Salmon salmon = new Salmon();


        List<Voice> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(elephant);
        list.add(lion);
        list.add(salmon);

        for (Voice v : list) {
            v.giveVoice();
        }

    }
}
