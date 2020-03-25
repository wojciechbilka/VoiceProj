public class Dog implements Voice, Paws {

    @Override
    public void giveVoice() {
        System.out.println("Whoff");
    }


    @Override
    public Integer pawsNumber() {
        return 4;
    }
}
