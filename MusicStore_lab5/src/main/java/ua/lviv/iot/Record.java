package ua.lviv.iot;

/**
 * Created by user on 2/26/2018.
 */

abstract class Record {
    protected RecordGenre recordGenre;
    protected String artistName;
    protected String labelName;
    protected String recordName;
    protected String subgenreName;
    protected int releaseYear;
    protected double recordValue;
    protected int recordLength;
    protected String composerName;

}

class Song extends Record {
    private String producerName;
    private String albumName;
    private int compositionYear;
    private int songNumber;

    //pmd report: Avoid unused constructor parameters such as 'albumName' (albumName wasn't assigned)
    public Song(RecordGenre recordGenre, String artistName, String labelName, String subgenreName, String producerName, String recordName, String albumName,
                int releaseYear, double recordValue, int recordLength, int compositionYear, int songNumber, String composerName) {
        this.recordGenre = recordGenre;
        this.artistName = artistName;
        this.labelName = labelName;
        this.subgenreName = subgenreName;
        this.producerName = producerName;
        this.recordName = recordName;
        this.releaseYear = releaseYear;
        this.recordValue = recordValue;
        this.recordLength = recordLength;
        this.compositionYear = compositionYear;
        this.songNumber = songNumber;
        this.composerName = composerName;
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "recordGenre=" + recordGenre +
                ", artistName='" + artistName + '\'' +
                ", labelName='" + labelName + '\'' +
                ", recordName='" + recordName + '\'' +
                ", subgenreName='" + subgenreName + '\'' +
                ", releaseYear=" + releaseYear +
                ", recordValue=" + recordValue +
                ", recordLength=" + recordLength +
                ", composerName='" + composerName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", albumName='" + albumName + '\'' +
                ", compositionYear=" + compositionYear +
                ", songNumber=" + songNumber +
                '}';
    }
}

class Audiobook extends Record {
    private String dictorName;
    private String bookAuthor;
    private int bookLength;
    private int bookReleaseYear;

    public Audiobook(RecordGenre recordGenre, String artistName, String bookAuthor, String labelName, String subgenreName, int bookReleaseYear, String recordName,
                     int releaseYear, double recordValue, int recordLength, String dictorName, int bookLength, String composerName) {
        this.recordGenre = recordGenre;
        this.bookAuthor = bookAuthor;
        this.artistName = artistName;
        this.labelName = labelName;
        this.subgenreName = subgenreName;
        this.bookLength = bookLength;
        this.dictorName = dictorName;
        this.releaseYear = releaseYear;
        this.recordValue = recordValue;
        this.recordLength = recordLength;
        this.bookReleaseYear = bookReleaseYear;
        this.recordName = recordName;
        this.composerName = composerName;

    }

    @Override
    public String toString() {
        return "Audiobook{" +
                "recordGenre=" + recordGenre +
                ", artistName='" + artistName + '\'' +
                ", labelName='" + labelName + '\'' +
                ", recordName='" + recordName + '\'' +
                ", subgenreName='" + subgenreName + '\'' +
                ", releaseYear=" + releaseYear +
                ", recordValue=" + recordValue +
                ", recordLength=" + recordLength +
                ", composerName='" + composerName + '\'' +
                ", dictorName='" + dictorName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookLength=" + bookLength +
                ", bookReleaseYear=" + bookReleaseYear +
                '}';
    }
}
