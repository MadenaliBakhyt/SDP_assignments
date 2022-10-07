public class ChocolateBall implements IceCream {
    private final IceCream decorated;
    private String name;
    private double price;
    private double total;
    public ChocolateBall(IceCream decorated){
        this.decorated=decorated;
        price=2.1;
        name="Chocolate ball : "+price+'\n'+decorated.getname();
        total+=price+decorated.gettotal();
    }

    @Override
    public void bill() {
        System.out.println(name);
        System.out.println("Total : "+total);
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public Double getprice() {
        return price;
    }

    @Override
    public Double gettotal() {
        return total;
    }
}