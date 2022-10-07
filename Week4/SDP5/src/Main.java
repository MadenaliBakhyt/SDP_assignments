public class Main {
    public static void main(String[] args) {
        Cone ic1=new Cone();
        ChocolateBall ic2=new ChocolateBall(ic1);
        ChocolateBall ic3=new ChocolateBall(ic2);
        ic3.bill();

    }
}