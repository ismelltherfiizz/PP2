package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

class ViewTest extends Output{

    private List<Record> recordList = new LinkedList<>();
    private View view = new View();

    @Test
    void testOutputMenu() {
        view.outputMenu();
        String menuExpected = "\nMENU:\n  1 - Create Manager\n  2 - Print The List Of Records\n" +
                "  3 - Sort By Composer\n  4 - Find Record By Recording Possibility\n" +
                "  E - Exit\n";
        assertEquals(menuExpected, output.toString());
    }

    @Test
    void managerMenu1() {
        view.manager("1");
        recordList.add(1, new Song("NIN", RecordGenre.ROCK, "Hurt", "The Downward Spiral",
                375, "Trent Reznor", "Interscope"));
        recordList.add(2, new Song("David Bowie", RecordGenre.ROCK, "Ziggy Stardust", "Ziggy Stardust and the Spiders from Mars",
                201, "David Bowie", "Apple"));
        recordList.add(3, new Song("Michael Jackson", RecordGenre.POP, "Smooth Criminal", "Bad",
                257, "Michael Jackson", "Epic Records"));
        recordList.add(4, new Audiobook("The Kinks", RecordGenre.POP, "Ham On Rye", "Some",
                1305, "Ray Davis", "Charles Bukowski"));
        recordList.add(5, new Audiobook("Hamburg Orchestra", RecordGenre.CLASSIC, "The Idiot", "Baloon Concerto",
                20003, "Ludwig van Beethoven", "Fedor Dostoevski"));
        recordList.add(6, new Song("Trent Reznor and Atticus Ross", RecordGenre.SOUNDTRACK, "Hand Covers Bruise", "The Social Network",
                603, "Trent Reznor and Atticus Ross", "The Null Corporation"));

        assertEquals("CSV file was created successfully\n", output.toString());
    }

    @Test
    void managerMenu2() {
        String expectedOut = "CSV file was created successfully\n" +
                "'Hurt' by 'NIN';\n" +
                "'Ziggy Stardust' by 'David Bowie';\n" +
                "'Smooth Criminal' by 'Michael Jackson';\n" +
                "'Ham On Rye' by 'The Kinks';\n" +
                "'The Idiot' by 'Hamburg orchestra';" +
                "'Hand Covers Bruise' by 'Trent Reznor and Atticus Ross';\n";
        view.manager("1");
        view.manager("2");
        assertEquals(expectedOut, output.toString());
    }



    @Test
    void managerMenuE(){
        view.manager("E");
        assertEquals("Bye\n", output.toString());
    }
    @Test
    void managerDefault() {
        String expectedOut = "Menu has not this point\n";
        view.manager("8");
        assertEquals(expectedOut, output.toString());
    }

    @Test
    void show() {
    }
}