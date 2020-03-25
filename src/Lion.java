public class Lion implements Animal {

    private int paws = 4;

    public void setPaws(int paws) {
        this.paws = paws;
    }

    @Override
    public String giveVoice() {
        return "Roar";
    }

    @Override
    public Integer pawsNumber() {
        return paws;
    }
}
