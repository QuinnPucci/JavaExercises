/*-------------------------------
Name: Quinn
Student ID: 3742290
Course: COMP308
Description: Represents a someones full name using separate fields for title, first name,
middle name, and last name. toString method formats into a String
-------------------------------*/
public class FullName {
    // Attributes
    String title;
    String fN;
    String mN;
    String lN;

    // Constructor
    public FullName(String title, String fN, String mN, String lN){
        this.title = title;
        this.fN = fN;
        this.mN = mN;
        this.lN = lN;
    }

    // Returns the full name and title in a formatted string
    @Override
    public String toString(){
        return this.title + ". " + this.fN + " " + this.mN + " " + this.lN;
    }

    public static void main(String[] args){

    }

}