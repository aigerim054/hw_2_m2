public class IPhoun extends Phone{
    private boolean apple;

    @Override
    public void print() {
        super.print();
        System.out.println("iPhoun have apple logo" + apple);
    }

    public IPhoun(int memory, boolean apple) {
        super(memory);
        this.apple = apple;
    }
}
