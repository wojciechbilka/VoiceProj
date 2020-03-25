public class Elephant implements Voice, Paws{

    public void giveVoice() {System.out.println("Toot tooot");
    }

    @Override
    public Integer pawsNumber() {
        return 4;
    }
}
