package ua.lviv.iot;

public class Audiobook extends Record {

    private String writerName;

    public Audiobook(final String artistName, final RecordGenre recordGenre,
                     final String recordName, final String albumName,
                     final int recordLength, final String composerName,
                     final String writerName) {
        super(artistName, recordGenre, recordName, albumName, recordLength, composerName);
        setWriterName(writerName);
    }

    public Audiobook(final String artistName, final RecordGenre recordGenre,
                     final String recordName, final String albumName,
                     final int recordLength, final String composerName,
                     final String writerName, final int id) {
        super(artistName, recordGenre, recordName, albumName, recordLength, composerName, id);
        setWriterName(writerName);
    }



    private void setWriterName(final String writerName) {
        this.writerName = writerName;
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + ",writerName\n";
    }

    @Override
    public final String toCSV() {
        return super.getArtistName() + ", "  + super.toCSV()  + "," + writerName + "\n";
    }
}
