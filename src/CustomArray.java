import java.util.Arrays;

public class CustomArray {

    private int[] array;
    private int size;

    public int getSize(){
        return size;
    }
public  void removeAll(){
        size = 0;
    System.out.println("Delete");
}
    public CustomArray() {
        array = new int[10];
        size = 0;
    }

    private void checkSize() {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public void add(int value) {
        checkSize();
        array[size++] = value;
    }

    public void add(int value, int index) {
        if (index >= 0 && index <= size) {
            checkSize();
            System.arraycopy(array, index, array, index + 1, size - index);
            array[index] = value;
            size++;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            size--;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void edit(int index, int newValue) {
        if (index >= 0 && index < size) {
            array[index] = newValue;
        } else {
            System.out.println("Invalid index.");
        }
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        System.arraycopy(array, 0, result, 0, size);
        return Arrays.toString(result);
    }
    public int get(int index){
        return array[index];
    }
    }