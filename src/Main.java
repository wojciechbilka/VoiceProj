import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Elephant elephant = new Elephant();
        Lion lion = new Lion();
        Salmon salmon = new Salmon();

        // Voice List
        List<Voice> listVoice = new ArrayList<>();
        listVoice.add(dog);
        listVoice.add(cat);
        listVoice.add(elephant);
        listVoice.add(lion);
        listVoice.add(salmon);

        for (Voice v : listVoice) {
            System.out.println(v.getClass().getSimpleName() + " goes " + v.giveVoice());
        }

        // Paws List
        List<Paws> listPaws = new ArrayList<>();
        listPaws.add(dog);
        listPaws.add(cat);
        listPaws.add(elephant);
        listPaws.add(lion);
        listPaws.add(salmon);

        for (Paws v : listPaws) {
            System.out.println(v.getClass().getSimpleName() + " has " + v.pawsNumber() + " paws.");
        }

        // Animal List
        Elephant elephant1 = new Elephant();
        elephant1.setPaws(32);

        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(dog);
        listAnimal.add(cat);
        listAnimal.add(elephant);
        listAnimal.add(lion);
        listAnimal.add(salmon);
        listAnimal.add(elephant1);

        for (Animal v : listAnimal) {
            System.out.println(v.getClass().getSimpleName() + " goes " + v.giveVoice() + " and has " + v.pawsNumber() + " paws.");
        }
    }
}
