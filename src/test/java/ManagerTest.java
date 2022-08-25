import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ManagerTest {
    FilmManager manager = new FilmManager();

    @Test
    public void test() {
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");
        manager.addFilms("film8");

        String[] actual = manager.findLast(3);
        String[] expected = {"film8", "film7", "film6"};

        assertArrayEquals(expected, actual);
    }

    @Test
      public void ShouldAddFilms() {
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");

        String[] expected = {"film1", "film2", "film3"};
        String[] actual = manager.addFilms();

        assertArrayEquals(expected, actual);
    }
}
