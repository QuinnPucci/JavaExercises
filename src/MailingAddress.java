public class MailingAddress {
    FullName fullName;
    String streetAddress;
    String city;
    String province;
    String postC;

    public MailingAddress(FullName fullName, String streetAddress, String city, String province, String postC){
        this.fullName = fullName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postC = postC;
    }

    @Override
    public String toString(){
        return this.fullName +": " + this.streetAddress + ", " + this.city + ", " + this.province + ", " + this.postC;
    }

    public static void main (String[] args){

    }
}
