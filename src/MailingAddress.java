/*-------------------------------
Name: Quinn
Student ID: 3742290
Course: COMP308
Description: Represents a mailing address with a FullName object  recipient and address fields
for street, city, province, and postal code. toString method for formatting
-------------------------------*/
public class MailingAddress {

    // Attributes. One of which is a FullName object
    FullName fullName;
    String streetAddress;
    String city;
    String province;
    String postC;

    // COnstructor
    public MailingAddress(FullName fullName, String streetAddress, String city, String province, String postC){
        this.fullName = fullName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.province = province;
        this.postC = postC;
    }

    // Returns Mailing Address in a formatted string
    @Override
    public String toString(){
        return this.fullName +": " + this.streetAddress + ", " + this.city + ", " + this.province + ", " + this.postC;
    }

    public static void main (String[] args){

    }
}
