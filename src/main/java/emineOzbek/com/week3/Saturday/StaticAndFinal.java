package emineOzbek.com.week3.Saturday;

public class StaticAndFinal {
    public static void main(String[] args) {

        String movieName = Movie.movieName;

        Movie movie = new Movie();
        double imdb = movie.imdb;

        Math.max(4,5);

        System.out.println(Messages.productImageIsNotFound);

        String iban = Constants.IBAN;

        String name = "Emine";
        name  = "Burak";
    }
}
