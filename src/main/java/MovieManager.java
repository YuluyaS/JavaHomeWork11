public class MovieManager {

    private final int limit;
    private String[] movies = new String[0];

    public MovieManager() {
        this.limit = 5;
    }

    public MovieManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i ++) {
            tmp [i] =  movies[i];
        }
        //System.out.println("movies.length"+movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        }
        else if (movies.length > limit) {
            //resultLength = movies.length;
            resultLength = limit;
            //System.out.println("> resultLength="+resultLength);
        }
        else {
            resultLength = limit;
            //System.out.println("= resultLength="+resultLength);

        }
        String[] tmp = new String[resultLength];
        //for (int i = 0; i < movies.length; i++) {
        //    tmp[i] = movies[movies.length - 1 - i];
        //    System.out.println("i="+i+" = "+movies[movies.length - 1 - i]);
        //}

        for (int i = 0; i < resultLength; i++) {
            tmp[i] = movies[resultLength - 1 - i];
            //System.out.println("i="+i+" = "+movies[resultLength - 1 - i]);
        }

        return tmp;
    }
}
