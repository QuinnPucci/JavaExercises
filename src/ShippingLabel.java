public class ShippingLabel {
    MailingAddress shipFrom;
    MailingAddress shipTo;

    public ShippingLabel(MailingAddress shipFrom, MailingAddress shipTo){
        this.shipFrom = shipFrom;
        this.shipTo = shipTo;
    }

    @Override
    public String toString(){
        return "Shipping From " + this.shipFrom + "\nShipping Too " + this.shipTo;
    }

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
