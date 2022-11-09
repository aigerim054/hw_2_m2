public class Main {
    public static void main(String[] args) {
        Phone sumsung = createObject("Sumsung");
        Phone iPhone = createObject("IPhone");
        Phone redmi = createObject("Redmi");
        sumsung.print();
        iPhone.print();
        redmi.print();
    }
    public static Phone createObject(String name){
        switch (name){
            case "Sumsung":
                 Sumsung sumsung = new Sumsung(64,false);
                return sumsung;
            case "IPhone":
                IPhoun iPhoun = new IPhoun(128,true);
                return iPhoun;
            case "Redmi":
                Redmi redmim = new Redmi(32,true);
                return redmim;

        }
        return null;
    }
}