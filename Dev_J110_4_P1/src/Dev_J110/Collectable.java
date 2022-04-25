package Dev_J110;

interface Collectable {
    
    int SIZE = 1024;
    
    //метод, проверяющий, находится ли значение параметра почти всех методов интерфейса в диапазоне допустимых значений.  
    default void checkIndex(int index) {
        if(index < 0 || index >= SIZE)
            throw new ArrayIndexOutOfBoundsException("Значение заданного индекса не входит в диапазон допустимых значений.");
    }
     default int getSize() {
        return SIZE;
    }
    //Метод, проверяющий элемент с заданным индексом. Возвращает  этот элемент;
    boolean getByIndex(int index);
    //Метод, устанавливающий элемент с заданным индексом в true;
    void setTrue(int index);
    //Метод, устанавливающий элемент с заданным индексом в заданное логическое значение;
    void setValue(int index, boolean value);
    //Метод, сбрасывающий (в false) элемент с заданным индексом;
    void resetFalse(int index);
    //Метод, инвертирующий элемент с заданным индексом;
    void inverting(int index);
    //Метод, возвращающий количество элементов, установленных в true;
    int howManyTrue();
    //метод toString(), возвращающий последовательность нулей и единиц, где каждый символ представляет значение соответствующего элемента массива;
    @Override
    String toString();
    
}
