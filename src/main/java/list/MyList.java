package list;

public class MyList<T> {
    private T[] array = (T[])new Object[0];

    //------------------------------------------------------------

    public void add(T o) {
        T[] tmp = (T[]) new Object[size() + 1];

        System.arraycopy(array, 0, tmp, 0, size());
        tmp[tmp.length - 1] = o;

        array = tmp;
    }

    //--------------------------------------------------------------

    public int size() {
        return array.length;
    }

    //---------------------------------------------------------------

    public boolean remove(int i) {
        if (i < array.length && i >= 0) {
            T[] tmp = (T[]) new Object[size() - 1];

            System.arraycopy(array, 0, tmp, 0, i);
            System.arraycopy(array, i+1, tmp, i, size()-1-i);

            array = tmp;

            return true;
        }
        else
            return false;
    }

    //---------------------------------------------------------------

    public boolean remove(T o) {
        boolean contains = false;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                contains = true;
                index = i;
                break;
            }
        }

        if (contains) {

            T[] tmp = (T[]) new Object[size() - 1];

            System.arraycopy(array, 0, tmp, 0, index);
            System.arraycopy(array, index+1, tmp, index, size()-1-index);

            array = tmp;
            return true;
        }
        else
            return false;
    }

    //---------------------------------------------------------------

    public T get(int index) {
       if (index < array.length && index >= 0)
           return array[index];

       else
           return null;
    }

    //---------------------------------------------------------------

    public void printAllContext() {
        System.out.print("[ ");

        for (T t : array) {
            System.out.print(t + " ");
        }

        System.out.println("]");

    }
}
