package ATDBagConcept;

/**
 * @Author Anthony Z.
 * @Date 18/6/2022
 * @Description: An interface that describes the operations of a bag of objects.
 *
 * It builds on the concepts of encapsulation and data abstraction
 * ATD is abstract data type, is a specification for a group of values
 * and the operations on those values.
 *
 * A collection is a typical collection that enables clients to add, remove,
 * retrieve and query the objects it presents.
 *
 * Note that methods within an interface are public by default, so you can omit public from their headers.
 */
public interface BagInterface<T extends Comparable<T> > {

    /**
     * Get the current number of entries in this bag
     * @return The integer number of entries currently in the bag.
     */
    int getCurrentSize();

    /**
     * See whether the bag is empty
     * @return
     */
    boolean isEmpty();

    /**
     * Add a new entry into this bag
     * @param obj  The object to be added as a new entry.
     * @return True if the addition is successful, or false if not.
     */
    boolean add(T obj);

    /**
     * Remove one occurrence of a given entry, if possible.
     * @param obj The entry to be removed.
     * @return True if the removal is successful, or false if not.
     */
    boolean remove(T obj);

    /**
     * Remove all entries from this bag.
     */
    void clear();

    /**
     * Count the number of times a given entry appears in the bag.
     * @param obj The entry to be counted.
     * @return The number of times an entry appears in the bag.
     */
    int getFrequencyOf(T obj);

    /**
     * Test whether the bag contains a given entry.
     * @param obj The entry to find.
     * @return True if the bag contains that entry, or false if not.
     */
    boolean contains(T obj);

    /**
     * Retrieve all entries in the bag.
     * @return a newly allocated array of all the entries in the bag.
     * Note: If the bag is empty, the returned array is empty.
     */
    T[] toArray();

}

/**
 * Design Decision
 *
 * The first draft of an ATD's specification may overlook or ignore situations that
 * you really need to consider. Once you have written the major portions of the specification,
 * you can concentrate on the details that make the specifications complete.
 *
 * What should happen when unusual conditions occur?
 *
 * 1. Throw an exception.
 * 2. Return a boolean value that indicates the success or failure of an operation.
 * 3. Assume that the invalid situations will not occur.
 * This assumption is not as naive as it might sound?
 * It's then up to the client to check if the precondition is satisfied before
 * invoking the method.
 *
 * For example, a precondition for the method remove might be the bag is not empty.
 * Notice that the client can use other methods of the ATD bags, such as
 * isEmpty or getCurrentSize, to help with this task.
 * As long as the client obeys the restriction, the invalid situation will not occur.
 *
 *
 *
 */
