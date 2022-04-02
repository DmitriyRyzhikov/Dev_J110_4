

package Dev_J110;

import java.util.Arrays;

public class BoolArray implements Collectable{
    
    private int size = SIZE;
    boolean[] boolArray = new boolean[size];

    
    @Override
    public boolean getByIndex(int index) {
      return boolArray[index];
    }
    
    @Override
    public void setTrue(int index) {
        boolArray[index] = true;
    }
    
    @Override
    public void setValue(int index, boolean value) {
        boolArray[index] = value;
    }
    
    @Override
    public void resetFalse(int index) {
        boolArray[index] = false;
    }
    
    @Override
    public void inverting(int index) {
        boolArray[index] = !getByIndex(index);
    }
    
    @Override
    public int howManyTrue() {
        int count = 0;
        for(boolean b : boolArray) {
            if(b) count++;
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
