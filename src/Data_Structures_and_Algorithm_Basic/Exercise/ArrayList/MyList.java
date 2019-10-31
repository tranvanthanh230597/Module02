package Data_Structures_and_Algorithm_Basic.Exercise.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(int i) {
        int newSize = elements.length +i;
        elements = Arrays.copyOf(elements, newSize);
    }

    public MyList(int capaciity) {
        this.size = capaciity;
        elements = new Object[size];
    }

    public void add(int index, E e){
        ensureCapa(1);
        for (int i = elements.length -1 ; i > index; i--){
            elements[i] =elements[i-1];
        }
        elements[index] = e;
    }

    public boolean add(E e){
        ensureCapa(1);
        elements[elements.length-1] = e;
        return true;
    }
    public void set(int index , E e){
        elements[index] = e;
    }
    public E remove(int index){
        if ((index > (elements.length - 1)) || (index < 0)){
            throw new IndexOutOfBoundsException("Can not find Index");
        }
        else{
            E result = (E) elements[index];
            for (int i = index ; i < elements.length-1; i++){
                elements[i] = elements[i+1];
            }
            ensureCapa(-1);
            return result;
        }
    }
    public int size(){
        return elements.length;
    }

    public E clone(){
        MyList clone = new MyList(elements.length);
        for (int i = 0 ; i < elements.length; i++){
            clone.set(i,elements[i]);
        }
        return (E) clone;
    }

    public boolean contains (E value){
        int count = 0;
        for (Object element : elements) {
            if (value.equals(element)) {
                count++;
            }
        }
        return count > 0;
    }

    public int indexOf(E value){
        int result = -1;
        for (int i = 0;i <elements.length ; i++){
            if (value.equals(elements[i])) {
                result = i;
            }
        }
        return result;
    }
    public E get(int i){
        if (i < 0 || i >elements.length-1){
            throw new IndexOutOfBoundsException("Error");
        }
        else{
            return (E) elements[i];
        }
    }

    public String toString(){
      String  result  = "";
      for (int i = 0 ; i < elements.length ; i++){
          result += elements[i] + " ";
      }
      return result;
    }
}
