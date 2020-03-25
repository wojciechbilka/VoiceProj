public class Lion implements Voice,Paws {

    @Override
    public void giveVoice() {
        System.out.println("Roar");
    }

    @Override
    public Integer pawsNumber() {
        return 4;
    }
}
