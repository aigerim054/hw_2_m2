public class Redmi extends Phone {
    private boolean cleaner;

    @Override
    public void print() {
        super.print();
        System.out.println("redmi have cleaner" + cleaner);
    }

    public Redmi(int memory, boolean cleaner) {
        super(memory);
        this.cleaner = cleaner;
    }
}
