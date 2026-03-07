import java.util.*;

public class Box<T> {
    private List<T> items;
    private T item;

    public Box(){
        this.items = new ArrayList<>();
    }

    void addItem(T item){
        items.add(item);
    }

    T getItem(int index) {
        T target = items.get(index);
        return target;
    }

    List<T> getAllItems(){
        return items;
    }

    int size(){
        return items.size();
    }

    public static void main(String[] args){
        Box newBox = new Box();
        newBox.addItem("Cat");
        newBox.addItem(5.67879);
        newBox.addItem(4);
        newBox.getAllItems();
        newBox.size();

        Box<Integer> intBox = new Box<>(); // a box that only holds ints
        intBox.addItem(5);
        intBox.addItem(6);
        intBox.addItem(42);

        intBox.getItem(1);
        intBox.getAllItems();
        intBox.size();

        Box<String> stringBox = new Box<>(); // a box that only hold string
        stringBox.addItem("cats");
        stringBox.addItem("dogs");
        stringBox.addItem("foxes");

        stringBox.getItem(0);
        stringBox.getAllItems();
        stringBox.size();
    }
}
