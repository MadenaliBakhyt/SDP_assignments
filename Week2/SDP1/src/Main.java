public class Main {
    public static void main(String[] args) {
        Door wd = new WoodenDoor("WoodenDoor1");
        wd.trylock();
        wd.tryopen();

        Door md = new MetalDoor("MetalDoor1");
        md.trylock();
        md.tryopen();
        md.setLockType(new Lockwithkey());
        md.tryopen();




    }
}
