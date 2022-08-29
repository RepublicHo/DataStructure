package ATDBagConcept;

/**
 * @Author Anthony Z.
 * @Date 20/6/2022
 * @Description: When defining a class that implements an interface, it's a good practice to
 * add the comments and headers of the public methdos to the class by copying them from the interface. 
 *
 */
public class ArrayBag<T extends Comparable<T>> implements BagInterface<T>{
    private final T[] bag;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 25;

    // just in case the constructor does not execute completely.
    private boolean integrityOK;
    // give a limit
    private static final int MAX_CAPACITY = 10000;

    public ArrayBag() {
//        Syntax error: we cannot use a generic type when allocating an array.
//        this.bag = new T[DEFAULT_CAPACITY];

//        Syntax error: we cannot assign an array of Object to an array of T.
//        this.bag = new Object[DEFAULT_CAPACITY];
        this(DEFAULT_CAPACITY);
    }

    public ArrayBag(int desiredCapacity){
        integrityOK = false;
        if(desiredCapacity <= MAX_CAPACITY){
            this.bag = (T[]) new Object[desiredCapacity];
            this.numberOfEntries = 0;
        }else{
            throw new IllegalStateException("capacity exceeds allowed maximum. ");
        }

        Math.sqrt(2);

    }

    @Override
    public int getCurrentSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean ifFull() {
        return numberOfEntries >= bag.length;
    }

    @Override
    public boolean add(T obj) {
        boolean result = true;
        if(ifFull()){
           result = false;
        }else{
            bag[numberOfEntries++] = obj;
        }
        return result;
    }

    @Override
    public boolean remove(T obj) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T obj) {
        return 0;
    }

    @Override
    public boolean contains(T obj) {
        return false;
    }


    // we
    @Override
    public T[] toArray() {
        T[] result = (T[]) new Object[numberOfEntries];
        for(int i=0; i<numberOfEntries; i++){
            result[i] = bag[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayBag<Integer> tempArr = new ArrayBag<>();

    }
}
