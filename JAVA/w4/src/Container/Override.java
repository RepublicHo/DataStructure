package Container;

/**
 * @Author Anthony Z.
 * @Date 14/6/2022
 * @Description: How to override equals() and hashCode() in Java
 *
 * Why always override hashcode() if overriding equals()?
 *
 * == is reference equality, while equal is logical equality
 *
 * String strA = new String("eBay");
 * String strB = new String("eBay");
 * System.out.println(strA == strB); // false
 * System.out.println(strA.equals(strB)); // true
 *
 * 1. if you override equals, you must override hashCode.
 * 2. hashCode must generate equal values for equal objects.
 * 3. when they are both overridden, equals and hashCode must use the same set of fields
 * 4.
 *
 * https://crunchify.com/how-to-override-equals-and-hashcode-method-in-java/
 */
public class Override {
}
