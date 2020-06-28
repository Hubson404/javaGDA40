package generyki;

public interface MyStack<U> {

    public U push(U element);
    public U pop();
    public boolean isEmpty();
}