public class Cat implements Voice, Paws {

    @Override
    public void giveVoice() {
        System.out.println("Miauuuu");
    }

    @Override
    public Integer pawsNumber() {
        return 4;
    }
}
