public class Salmon implements Animal {

    private int paws = 0;

    public void setPaws(int paws) {
        this.paws = paws;
    }

    @Override
    public String giveVoice () {
        return "Blub blub"; }

    @Override
    public Integer pawsNumber() {
        return paws;
    }
}
