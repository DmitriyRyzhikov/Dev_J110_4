
package Dev_J110;


import java.util.Arrays;



public class IntArrayBi implements Collectable {
    
    int size = SIZE;
    int[] intArray = new int[size/32];
    
    @Override
    public boolean getByIndex(int index) {
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = 1 << bitIndex;
        return (element & mask) == mask;
    }
    
    @Override
    public void inverting(int index) {
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = 1 << bitIndex;
        intArray[elementIndex] = element ^ mask;
    }
    
    @Override
    public void setValue(int index, boolean value) {
        if(value) 
           setTrue(index);
        else
           resetFalse(index);
    }
    
    @Override
    public void setTrue(int index){
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = 1 << bitIndex;
        intArray[elementIndex] = element | mask;
    }
    
    @Override
    public void resetFalse(int index){
        int elementIndex = index/32;
        int bitIndex = index % 32;
        int element = intArray[elementIndex];
        int mask = ~(1 << bitIndex);
        intArray[elementIndex] = element & mask;
    }
    
    @Override
    public int howManyTrue() {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(getByIndex(i))
                count++;
        }        
    return count;
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        for(int i = 0; i < size; i++) {
           result[i] = getByIndex(i) ? 1 : 0; 
        }
        return Arrays.toString(result);
    }
    
    
    
}

