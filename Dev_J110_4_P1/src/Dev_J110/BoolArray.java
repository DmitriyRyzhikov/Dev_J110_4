

package Dev_J110;

import java.util.Arrays;

public class BoolArray implements Collectable{
    
    private final int size;
    private final boolean[] boolArray;

    public BoolArray() {
        size = SIZE;
        boolArray = new boolean[size];
    }
    
    //Метод, проверяющий элемент с заданным индексом. Возвращает  этот элемент;
    @Override
    public boolean getByIndex(int index) {
        checkIndex(index);
        return boolArray[index];
    }
    
    //Метод, устанавливающий элемент с заданным индексом в true;
    @Override
    public void setTrue(int index) {
        checkIndex(index);
        boolArray[index] = true;
    }
    
    //Метод, устанавливающий элемент с заданным индексом в заданное логическое значение;
    @Override
    public void setValue(int index, boolean value) {
        checkIndex(index);
        boolArray[index] = value;
    }
    
    //Метод, сбрасывающий (в false) элемент с заданным индексом;
    @Override
    public void resetFalse(int index) {
        checkIndex(index);
        boolArray[index] = false;
    }
    
    //Метод, инвертирующий элемент с заданным индексом;
    @Override
    public void inverting(int index) {
        checkIndex(index);
        boolArray[index] = !getByIndex(index);
    }
    
    //Метод, возвращающий количество элементов, установленных в true;
    @Override
    public int howManyTrue() {
        int count = 0;
        for(boolean b : boolArray) {
            if(b) count++;
        }
        return count;
    }
    
    //метод toString(), возвращающий последовательность нулей и единиц, где каждый символ представляет значение соответствующего элемента массива;
    @Override
    public String toString() {
        int[] result = new int[size];
        for(int i = 0; i < size; i++) {
           result[i] = getByIndex(i) ? 1 : 0; 
        }
        return Arrays.toString(result);
    }
    
}
