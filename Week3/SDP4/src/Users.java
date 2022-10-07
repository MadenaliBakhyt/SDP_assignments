public class Users implements Observer {
    private String user;
    private String film;
    private String theatre;
    public Users(String user){
        this.user = user;
    }
    @Override
    public void update(String film,String theatre) {
        this.film =film;
        this.theatre=theatre;
        message();
    }
     public void message(){
         System.out.println("Hello "+ user);
         System.out.println("Tomorrow at "+theatre+" the film "+film);
     }
}