public class FullName {
    String title;
    String fN;
    String mN;
    String lN;

    public FullName(String title, String fN, String mN, String lN){
        this.title = title;
        this.fN = fN;
        this.mN = mN;
        this.lN = lN;
    }

    @Override
    public String toString(){
        return this.title + ". " + this.fN + " " + this.mN + " " + this.lN;
    }

    public static void main(String[] args){

    }

}