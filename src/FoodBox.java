/*
This is an extension of the generic container box, that holds specifically my created class Item.
 */

public class FoodBox extends Box<Item> {
    // mental model: this is a specialized sub Box that holds my real created class Item
    public static void main(String[] args){
        FoodBox boxOfFood = new FoodBox();

        Fruit apple = new Fruit("Apple");
        Fruit mango = new Fruit("Mango");
        Cheese parmesan = new Cheese("Parmesan");
        Cheese gouda = new Cheese("Gouda");

        boxOfFood.addItem(apple);
        boxOfFood.addItem(mango);
        boxOfFood.addItem(parmesan);
        boxOfFood.addItem(gouda);

        System.out.println(boxOfFood.getItem(1));
        System.out.println(boxOfFood.getItem(3));
        System.out.println(boxOfFood.getAllItems());
        System.out.println(boxOfFood.size());
    }

}
