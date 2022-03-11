import java.util.ArrayList;

/**
 * Class to work with
 */
class Violator {

    public static List<Box<? extends Bakery>> defraud() {
        List<Box<? extends Bakery>> list = new ArrayList<>();
        Box b1 = new Box();
        b1.put(new Cake());
        Box b2 = new Box();
        b2.put(new Paper());
        list.add(b1);
        list.add(b2);
        //list.addAll(List.of(b1, b2));
        return list;
    }

}