
package Dev_J110;


import java.util.Arrays;



public class IntArrayBi implements Collectable {
    
    private final int size;
    private final int[] intArray;

    public IntArrayBi() {
        size = SIZE;
        intArray = new int[size/32];
    }
    
    //Метод, проверяющий элемент с заданным индексом. Возвращает  этот элемент;
    @Override
    public boolean getByIndex(int index) {
        checkIndex(index);
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = 1 << bitIndex;
        return (element & mask) == mask;
    }
    
    //Метод, инвертирующий элемент с заданным индексом;
    @Override
    public void inverting(int index) {
        checkIndex(index);
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = 1 << bitIndex;
        intArray[elementIndex] = element ^ mask;
    }
    
    //Метод, устанавливающий элемент с заданным индексом в заданное логическое значение;
    @Override
    public void setValue(int index, boolean value) {
        checkIndex(index);
        if(value) 
           setTrue(index);
        else
           resetFalse(index);
    }
    
    //Метод, устанавливающий элемент с заданным индексом в true;
    @Override
    public void setTrue(int index){
        checkIndex(index);
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = 1 << bitIndex;
        intArray[elementIndex] = element | mask;
    }
    
    //Метод, сбрасывающий (в false) элемент с заданным индексом;
    @Override
    public void resetFalse(int index){
        checkIndex(index);
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = ~(1 << bitIndex);
        intArray[elementIndex] = element & mask;
    }
    
    //Метод, возвращающий количество элементов, установленных в true;
    @Override
    public int howManyTrue() {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(getByIndex(i))
                count++;
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

