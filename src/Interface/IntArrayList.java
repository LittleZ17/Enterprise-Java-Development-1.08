package Interface;

import java.util.Arrays;

public class IntArrayList implements IIntList{

    private int[] array;
    private int size;

    public IntArrayList() {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArr = new int[array.length * 3/2];
            System.arraycopy(array, 0, newArr, 0, array.length);
            array = newArr;
        }
        array[size] = number;
        size++;
    }


    @Override
    public int get(int id) {
        if (id >= size) {
            System.err.println("This id doesn't exist!");
        }
        return array[id];
    }
}
