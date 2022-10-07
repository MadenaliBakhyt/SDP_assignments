public class Cone implements IceCream {
    private double price;
    private String name;
    private double total;

    public Cone(){

        this.price=1.2;
        this.name=("Cone : "+price+'\n');
        this.total+=price;
    }


    @Override
    public void bill() {
        System.out.println(name);
        System.out.println("Total : "+total);
    }


    public Double getprice() {
        return price;
    }

    public String getname() {
        return name;
    }

    public Double gettotal() {
        return total;
    }
}