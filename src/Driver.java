public class Driver {
    public static void main(String[] args){
        MiniEvent fanson = new MiniEvent("FansOn", 2000);
        MiniEvent sprinklerson = new MiniEvent("SprinklersOn", 3000);
        MiniEvent lightson = new MiniEvent("LightsOn", 1000);

        new Thread(lightson).start();
        new Thread(fanson).start();
        new Thread(sprinklerson).start();
    }
}
