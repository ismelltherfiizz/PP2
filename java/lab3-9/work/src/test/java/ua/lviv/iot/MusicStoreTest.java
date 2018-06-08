package ua.lviv.iot;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MusicStoreTest {
    private Map<Integer, Record> recordList = new HashMap<>();
    private Map<Integer, Record> result = new HashMap<>();
    private RecordWriter recordWriter = new RecordWriter();

    private MusicStore musicStore = new MusicStore(recordList);

    private void setList() {
        recordList.put(1, new Song("NIN", RecordGenre.ROCK, "Hurt", "The Downward Spiral",
                375, "Trent Reznor", "Interscope"));
        recordList.put(2, new Song("David Bowie", RecordGenre.ROCK, "Ziggy Stardust", "Ziggy Stardust and the Spiders from Mars",
                201, "David Bowie", "Apple"));
        recordList.put(3, new Song("Michael Jackson", RecordGenre.POP, "Smooth Criminal", "Bad",
                257, "Michael Jackson", "Epic Records"));
        recordList.put(4, new Audiobook("The Kinks", RecordGenre.POP, "Ham On Rye", "Some",
                1305, "Ray Davis", "Charles Bukowski"));
        recordList.put(5, new Audiobook("Ludwig", RecordGenre.CLASSIC, "The Idiot", "Baloon Concerto",
                20003, "Ludwig van Beethoven", "Fedor Dostoevski"));
        recordList.put(6, new Song("Trent Reznor and Atticus Ross", RecordGenre.SOUNDTRACK, "Hand Covers Bruise", "The Social Network",
                603, "Trent Reznor and Atticus Ross", "The Null Corporation"));

    }

    @Test
    void findByRecordingPossibility() {
        setList();
        result.put(1, recordList.get(5));
        //assertEquals(result, musicStore.findByRecordingPossibility(RecordGenre.CLASSIC));
        result.clear();
        result.put(1, recordList.get(1));
        result.put(2, recordList.get(2));
       // assertEquals(result, musicStore.findByRecordingPossibility(RecordGenre.ROCK));

    }

    @Test
    void sortByComposer() {
        setList();
        result.putAll(recordList);

        musicStore.sortByComposer(recordList);

            assertEquals(recordList.get(1).getComposerName(), result.get(1).getComposerName());



    }





    @Test
    void csvTest() {
        setList();
        recordWriter.writeToFile(recordList);
        //result = recordReader.readFromCSV(RecordGenre.ROCK);
        for (Map.Entry<Integer, Record> aResult : result.entrySet()) {
            System.out.print(aResult.getValue().toCSV());
        }
    }

}