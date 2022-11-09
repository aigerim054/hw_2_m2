public class Phone implements Printable {
    private int memory;

    @Override
    public void print() {
        System.out.println("memory" + memory);

    }

    public Phone(int memory) {
        this.memory = memory;
    }
}
