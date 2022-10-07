public class Messager implements Observer {
    private String customer;
    private String product;
    public Messager(String customer){
        this.customer = customer;
    }
    @Override
    public void update(String product) {
        this.product=product;
        message();
    }
     public void message(){
         System.out.println(customer+" new product "+ product);
     }
}