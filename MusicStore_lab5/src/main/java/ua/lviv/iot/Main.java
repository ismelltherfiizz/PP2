package ua.lviv.iot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Record Hurt = new Song(RecordGenre.ROCK, "Nine Inch Nails", "Interscope", "Industrial", "Alan Moulder",
                "Hurt", "The Downward Spiral", 1994, 2.49, 375, 1993, 15, "Trent Reznor");
        Record Ziggy = new Song(RecordGenre.ROCK, "David Bowie", "Apple", "Glam rock", "Ken Scott",
                "Ziggy Stardust", "Ziggy Stardust and the Spiders from Mars", 1973, 2, 201, 1972,
                4, "David Bowie");
        Record SmoothCriminal = new Song(RecordGenre.POP, "Michael Jackson", "Epic Records", "Funk", "Quincy Jones",
                "Smooth Criminal", "Bad", 1987, 1.5, 257, 1985, 1, "Michael Jackson");
        Record Symphony9 = new Song(RecordGenre.CLASSIC, "Hamburg orchestra", "Apple", "Symphony", "None",
                "Symphony No. 9", "Baloon Concerto", 1979, 4, 1023, 1822,
                4, "Ludwig van Beethoven");
        Record HandCoversBruise = new Song(RecordGenre.SOUNDTRACK, "Trent Reznor and Atticus Ross", "The Null Corporation",
                "Dark ambient", "Trent Reznor and Atticus Ross", "Hand Covers Bruise", "The Social Network",
                2010, 5, 603, 2010, 1, "Trent Reznor and Atticus Ross");
        Record HLAH = new Song(RecordGenre.ROCK, "Nine Inch Nails", "TVT Records",
                "Industrial", "Flood", "Head Like a Hole", "Pretty Hate Machine",
                1989, 1, 270, 1988, 1, "Trent Reznor");
        Record HamOnRye = new Audiobook(RecordGenre.POP, "The Kinks", "Charles Bukowski", "EMI", "Punk", 1956,
                "Ham On Rye", 1995, 7.50, 1305, "Mike Patton", 347, "Ray Davis");

        Scanner in = new Scanner(System.in);
        MusicStore musicStore = new MusicStore();
        musicStore.setRecord(Hurt, Ziggy, SmoothCriminal, Symphony9, HandCoversBruise, HamOnRye, HLAH);
        int switcher = 0;
        do {
            System.out.println("Press 1 to find records which you can write to CD");
            System.out.println("Press 2 to sort records by composer");
            System.out.println("Press 3 to exit");
            switcher = in.nextInt();
            switch (switcher) {
                case 1:
                    System.out.println("Please type the genre");
                    Scanner inSec = new Scanner(System.in);
                    String switcherSec = inSec.next();
                    switch (switcherSec) {
                        case "rock":
                            musicStore.findByRecordingPossibility(RecordGenre.ROCK);
                            System.out.println();
                            break;
                        case "soundtrack":
                            musicStore.findByRecordingPossibility(RecordGenre.SOUNDTRACK);
                            System.out.println();
                            break;
                        case "classic":
                            musicStore.findByRecordingPossibility(RecordGenre.CLASSIC);
                            System.out.println();
                            break;
                        case "pop":
                            musicStore.findByRecordingPossibility(RecordGenre.POP);
                            System.out.println();
                            break;
                        default:
                            System.out.println("Please type the correct value");
                            System.out.println();
                            break;
                    }
                    break;
                case 2:
                    musicStore.sortByComposer();
                    System.out.println();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please type the correct value");
                    System.out.println();
                    break;
            }
        }
        while (switcher != 1 || switcher != 2 || switcher != 3);

    }

}
