package list;

public class Main {
    public static void main(String[] args) {
        MyList<Double> l = new MyList<Double>();
        l.add(1.1);
        l.add(2.2);
        l.add(3.3);
        l.add(4.4);

        l.remove(0);
        l.printAllContext();
        l.remove(2.2);

        l.printAllContext();
        System.out.println(l.get(1));
    }
}
