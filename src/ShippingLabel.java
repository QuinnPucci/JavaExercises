/*-------------------------------
Name: Quinn
Student ID: 3742290
Course: COMP308
Description: Represents a shipping label containing a ship-from and ship-to MailingAddress object.
The label is printed by creating a ShippingLabel and printing it, which is formatted using toString
-------------------------------*/
public class ShippingLabel {
    // Attributes are two Mailing Adress objects
    MailingAddress shipFrom;
    MailingAddress shipTo;

    // Constructor
    public ShippingLabel(MailingAddress shipFrom, MailingAddress shipTo){
        this.shipFrom = shipFrom;
        this.shipTo = shipTo;
    }

    // String formatting
    @Override
    public String toString(){
        return "Shipping From " + this.shipFrom + "\nShipping Too " + this.shipTo;
    }

    // Testing done in Main method as per instructions.
    public static void main(String[] args){
        FullName someGuy = new FullName("Mr", "Bob", "Bobby","Bobbert");
        System.out.println(someGuy.toString());
        MailingAddress somePlace = new MailingAddress(someGuy, "123 Some Lane", "SomeTown", "Alberta", "T1A2B3");
        System.out.println(somePlace.toString());
        FullName shipper = new FullName("Mrs", "Ship", "Shippy", "Shippington");
        System.out.println(shipper.toString());
        MailingAddress fromHere = new MailingAddress(shipper, "789 Ship Road", "Calgary", "Alberta", "Z9Y5V4");
        System.out.println(fromHere.toString());
        ShippingLabel label = new ShippingLabel(fromHere, somePlace);
        System.out.println(label);
    }

}
