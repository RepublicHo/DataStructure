package InterfaceTest;

/**
 * @Author Anthony Z.
 * @Date 17/6/2022
 * @Description:
 *
 * A Java interface can be derived from several interfaces,
 * even though you cannot derive a class from several classes.
 *
 * a class interface does not include data fields, constructors.
 * private or protected methods.
 *
 * But we can define named constants so that classes that inherits this
 * interface can make use of.
 */
public interface Callable extends Nameable, Capable{
    public static final double MILES_PER_KILOMETER = 0.623456;

    /**
     *
     */

    public void come(String petName);
}
