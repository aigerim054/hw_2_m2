public class Sumsung extends Phone{
    private boolean pencil;

    @Override
    public void print() {
        super.print();
        System.out.println(" sumsung have pencil" + pencil);
    }

    public Sumsung(int memory, boolean pencil) {
        super(memory);
        this.pencil = pencil;
    }
}
