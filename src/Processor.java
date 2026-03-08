import java.lang.reflect.Array;
import java.util.*;

public class Processor {
    static void processor(Box box){ // alternatively to casting, I could have used Box<Item> here
        List<Fruit> fruitList = new ArrayList<>();
        List<Cheese> cheeseList = new ArrayList<>();
        List<Service> serviceList = new ArrayList<>();

        for (int i = 0; i < box.size(); i++ ){
            Item currentItem = (Item) box.getItem(i);
            // had to use casting here. was originally Item currentItem = box.getItem(i);
            if (currentItem instanceof Cheese){
                cheeseList.add((Cheese) currentItem);
                // had to use casting here too. this didn't work cheeseList.add(currentItem);
            } else if (currentItem instanceof Fruit) {
                fruitList.add((Fruit) currentItem);
            } else if (currentItem instanceof Service) {
                serviceList.add((Service) currentItem);
            }
        }
        System.out.println(fruitList);
        System.out.println(cheeseList);
        System.out.println(serviceList);

    }

    public static void main(String[] args){
        FoodBox boxOfStuff = new FoodBox();

        Fruit strawberry = new Fruit("Strawberry");
        Fruit pineapple = new Fruit("Pineapple");
        Fruit blueberry = new Fruit("Blueberry");

        Cheese mozza = new Cheese("Mozza");
        Cheese oldChed = new Cheese("Old Ched");
        Cheese swiss = new Cheese("swiss");

        Service deliver = new Service("Deviler");
        Service massage = new Service("Massage");
        Service call = new Service("Call");

        boxOfStuff.addItem(strawberry);
        boxOfStuff.addItem(pineapple);
        boxOfStuff.addItem(blueberry);
        boxOfStuff.addItem(mozza);
        boxOfStuff.addItem(oldChed);
        boxOfStuff.addItem(swiss);
        boxOfStuff.addItem(deliver);
        boxOfStuff.addItem(massage);
        boxOfStuff.addItem(call);

        processor(boxOfStuff);


    }
}
