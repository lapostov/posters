import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ManagerTest {
    FilmManager manager = new FilmManager();

    @Test
    public void ShouldFindLastIfMore() {
        FilmManager manager = new FilmManager(12);
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");
        manager.addFilms("film8");

        String[] actual = manager.findLast();
        String[] expected = {"film8", "film7","film6","film5","film4","film3","film2","film1"};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindLast() {
        FilmManager manager = new FilmManager(2);
        manager.addFilms("film1");
        manager.addFilms("film2");
        manager.addFilms("film3");
        manager.addFilms("film4");
        manager.addFilms("film5");
        manager.addFilms("film6");
        manager.addFilms("film7");
        manager.addFilms("film8");

        String[] actual = manager.findLast();
        String[] expected = {"film8", "film7"};

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
