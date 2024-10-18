import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesReverseOrder() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");


        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast() {

        MovieManager manager = new MovieManager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //получение последних фильмов: когда в менеджере фильмов столько же, сколько в лимите.
    @Test
    public void findLast2() {

        MovieManager manager = new MovieManager(4);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");

        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test2() {
        MovieManager manager = new MovieManager(2);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");


        String[] expected = {"Film 1", "Film 2"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        MovieManager manager = new MovieManager(2);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");


        String[] expected = {"Film 1", "Film 2"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    //получение последних фильмов: когда в менеджере фильмов меньше чем лимит
    @Test
    public void test4() {
        MovieManager manager = new MovieManager(4);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");

        String[] expected = {"Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //получение последних фильмов: когда в менеджере фильмов больше чем лимит
    @Test
    public void test5() {
        MovieManager manager = new MovieManager(3);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");

        String[] expected = {"Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}




