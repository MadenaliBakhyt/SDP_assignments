public class Main {
    public static void main(String[] args) {
        FilmsApp fapp =new FilmsApp();
        Users user1=new Users("Beka");
        Users user2=new Users("Arman");

        fapp.registerObserver(user1);
        fapp.registerObserver(user2);

        fapp.newFilm("Avengers","Kinopark");

        fapp.removeObserver(user1);

        fapp.newFilm("Naruto","Chaplin Cinema");

    }

}



