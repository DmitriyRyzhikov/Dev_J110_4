package Dev_J110;

interface Collectable {
    
    int SIZE = 1024;
    
    boolean getByIndex(int index);
    
    void setTrue(int index);
    
    void setValue(int index, boolean value);
    
    void resetFalse(int index);
    
    void inverting(int index);
    
    int howManyTrue();
    
    @Override
    String toString();
    
}
