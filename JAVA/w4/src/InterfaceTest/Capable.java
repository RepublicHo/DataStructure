package InterfaceTest;

/**
 * @Author Anthony Z.
 * @Date 17/6/2022
 * @Description:
 *
 * When you write a class that defines the methods declared in the interface, we say
 * that the class implements the interface. A class that implements an interface must define a body for every method
 * that the interface specifies. The interface, however, may not declare every method in the class.
 *
 * The interface does not declare constructors for a class and cannot declare static or final methods.
 * However, such methods can be declared as final within a class that implements the interface.
 *
 * Note that methods within an interface are public by default, so you can omit public from their headers.
 *
 * The interface is a good place to provide comments that specify each methods' purpose.
 *
 * When an interface extends another interface, it has all the methods of the inherited interface.
 */
public interface Capable {
//  By using an interface as a variable's type,
    public void giveLastNameTo(Capable aName);
}
