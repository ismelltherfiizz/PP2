package ua.lviv.iot;

import java.util.*;

public class View {
    private Map<String, String> menu;
    private Map<Integer, Record> recordList = new HashMap<>();
    private static Scanner input = new Scanner(System.in, "UTF-8");
    private Scanner scanner = new Scanner(System.in, "UTF-8");
    private MusicStore musicStore = new MusicStore(recordList);
    private RecordWriter recordWriter = new RecordWriter();

    public static final void main(final String[] args) {
        View view = new View();
        view.show();
    }

    View() {
        menu = new LinkedHashMap<>();

        menu.put("1", "  1 - Create Manager");
        menu.put("2", "  2 - Print The List Of Records");
        menu.put("3", "  3 - Sort By Composer");
        menu.put("4", "  4 - Find Record By Recording Possibility");
        menu.put("E", "  E - Exit");

    }

    public final void outputMenu() {
        System.out.print("\nMENU:\n");
        for (String str : menu.values()) {
            System.out.print(str + "\n");
        }
    }

    public final void manager(final String num) {
        switch (num) {
            case "1": {
                musicStore.setRecordList(recordList);

                recordList.put(1, new Song("NIN", RecordGenre.ROCK, "Hurt", "The Downward Spiral",
                        375, "Trent Reznor", "Interscope"));
                recordList.put(2, new Song("David Bowie", RecordGenre.ROCK, "Ziggy Stardust", "Ziggy Stardust and the Spiders from Mars",
                        201, "David Bowie", "Apple"));
                recordList.put(3, new Song("Michael Jackson", RecordGenre.POP, "Smooth Criminal", "Bad",
                        257, "Michael Jackson", "Epic Records"));
                recordList.put(4, new Audiobook("The Kinks", RecordGenre.POP, "Ham On Rye", "Some",
                        1305, "Ray Davis", "Charles Bukowski"));
                recordList.put(5, new Audiobook("Hamburg orchestra", RecordGenre.CLASSIC, "The Idiot", "Baloon Concerto",
                        20003, "Ludwig van Beethoven", "Fedor Dostoevski"));
                recordList.put(6, new Song("Trent Reznor and Atticus Ross", RecordGenre.SOUNDTRACK, "Hand Covers Bruise", "The Social Network",
                        603, "Trent Reznor and Atticus Ross", "The Null Corporation"));

                recordWriter.writeToFile(recordList);
                break;
            }
            case "2": {
                for (Map.Entry<Integer, Record> record : recordList.entrySet()) {
                    System.out.println("'" + record.getValue().getRecordName() + "'" + " by " + "'" + record.getValue().getArtistName() + "'" + ";");
                }
                }
            case "3": {
                MusicStore.sortByComposer(recordList);
                break;
            }
            case "4": {
                String genre = scanner.next();
                Map<Integer, Record> records = null;
                switch (genre) {
                    case "rock":
                        records = musicStore.findByRecordingPossibility(RecordGenre.ROCK);
                        System.out.println();
                        break;
                    case "soundtrack":
                        records = musicStore.findByRecordingPossibility(RecordGenre.SOUNDTRACK);
                        System.out.println();
                        break;
                    case "classic":
                        records = musicStore.findByRecordingPossibility(RecordGenre.CLASSIC);
                        System.out.println();
                        break;
                    case "pop":
                        records = musicStore.findByRecordingPossibility(RecordGenre.POP);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Please type the correct genre");
                        System.out.println();
                        break;   
                }
                for (Map.Entry<Integer, Record> record : records.entrySet()) {
                    System.out.print(record.getValue().getArtistName() + "; ");
                }
                break;
            }


            case "E": {
                System.out.print("Bye\n");
                return;
            }
            default: {
                System.out.print("Menu has not this point\n");
            }
        }
    }

    public final void show() {
        String keyMenu;
        do {
            outputMenu();
            System.out.println("Please, select menu point");
            keyMenu = input.nextLine().toUpperCase();
            manager(keyMenu);
            do {
                System.out.println("\n  M - return menu\n  E - exit");
                keyMenu = input.nextLine().toUpperCase();
                if (keyMenu.equalsIgnoreCase("E")) {
                    manager(keyMenu);
                    return;
                }
            } while (!keyMenu.equalsIgnoreCase("M"));

        } while (!keyMenu.equalsIgnoreCase("E"));
    }
}
