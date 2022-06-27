package InterfaceTest;

/**
 * @Author Anthony Z.
 * @Date 17/6/2022
 * @Description:
 *
 * When we use data abstraction, we focus on what we want to do with without worrying
 * about how to accomplish the task. That is, we ignore the details of how we manipulate it.
 *
 * We should also specify the action a method should take if it encounters an unusual situation.
 *
 * Usually, we would test the class to fully understand the interface.
 */
public interface Nameable {
    public void setName(String petName);
    public String getName();

}
