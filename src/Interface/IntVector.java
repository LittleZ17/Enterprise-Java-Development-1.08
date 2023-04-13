package Interface;
import java.util.Arrays;

public class IntVector implements IIntList{
    private int[] array;
    private int size;

    public IntVector() {
        this.array = new int[20];
        this.size = 0;
    }
    @Override
    public void add(int number) {
        //System.out.println("Length array executed add(): "+array.length);
        if (size == array.length) {
            array = Arrays.copyOf(array,  array.length * 2);
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

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
