/*
Simple hierarchy for use with the generic container class Box.
these will work together in a short series of exercises im doing
 */

public class Item {
   private String name;

   public Item(String name){
       this.name = name;
   }

    @Override
    public String toString() {
        return name;

        // return super.toString();
    }

    public static void main(String[] args){
       Cheese cheddar = new Cheese("Cheddar");
       Fruit raspberry = new Fruit("Raspberry");
       Service delivery = new Service("Delivery");

       System.out.println(cheddar.toString());
       System.out.println(raspberry.toString());
       System.out.println(delivery.toString());
    }
}

class Cheese extends Item{

    public Cheese(String name) {
        super(name);
    }
}

class Fruit extends Item{

    public Fruit(String name){
        super(name);
    }
}

class Service extends Item{

    public Service(String name){
        super(name);
    }
}


