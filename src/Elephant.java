public class Elephant implements Animal {

    private int paws = 4;

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String giveVoice() {
        return "Toot tooot";
    }

    @Override
    public Integer pawsNumber() {
        return paws;
    }
}
