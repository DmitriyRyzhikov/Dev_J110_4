package Dev_J110;


public class Main {


    public static void main(String[] args) {
        // создаем два объекта типа Collectable
        Collectable bool = new BoolArray();  //коллекция на основе bolean массива
        Collectable boolBinary = new IntArrayBi(); //коллекция на основе int-битового массива
        System.out.println(bool.getSize());
        System.out.println(boolBinary.getSize() + "\n"); //печатаем размер обеих коллекций
        //печатаем обе коллекции. Все элементы по умолчанию false - "0".
        //работают методы getByIndex(int index) и toString().
        System.out.println(bool.toString());
        System.out.println(boolBinary.toString() + "\n");
        // стаивм в true (метод setTrue(int index))элемент с индексом 1 и печатаем то, что получилось
        bool.setTrue(1);
        boolBinary.setTrue(1);
        System.out.println(bool.toString());
        System.out.println(boolBinary.toString() + "\n");
        // инвертируем (метод inverting(int index))оба элемента с индексом 13 (в данном случае из false в true.
        bool.inverting(13);
        boolBinary.inverting(13);
        // ставим в true (метод setValue(int index, boolean value)) оба элемента с индексом 10, сбраываем в false элемент 1 у IntArrayBi и печатаем то, что получилось.
        bool.setValue(10, true);
        boolBinary.setValue(10, true);
        boolBinary.resetFalse(1);
        System.out.println(bool.toString());
        System.out.println(boolBinary.toString()+ "\n");
        // Считаем кол-во true (метод int howManyTrue()) и выводим это количество в консоль.
        System.out.println(bool.howManyTrue());
        System.out.println(boolBinary.howManyTrue());
    }
}
