package Dev_J110;


public class Main {


    public static void main(String[] args) {

        Collectable bool = new BoolArray();
        Collectable boolBinary = new IntArrayBi();
     
        System.out.println(bool.toString());
        System.out.println(boolBinary.toString());
        bool.setTrue(1);
        boolBinary.setTrue(1);
        System.out.println(bool.toString());
        System.out.println(boolBinary.toString());
        bool.inverting(13);
        boolBinary.inverting(13);
        bool.setValue(10, true);
        boolBinary.setValue(10, true);
        System.out.println(bool.toString());
        System.out.println(boolBinary.toString());
        System.out.println(bool.howManyTrue());
        System.out.println(boolBinary.howManyTrue());
    }
    
}
