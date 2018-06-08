package ua.lviv.iot;

public class Song extends Record {

    private RecordGenre recordGenre;

    public String labelName;

    public Song(final String artistName, final RecordGenre recordGenre,
                final String recordName, final String albumName,
                final int recordLength, final String composerName,
                final String labelName) {
        super(artistName, recordGenre, recordName, albumName, recordLength, composerName);
        setLabelName(labelName);
    }

    public Song(final String artistName, final RecordGenre recordGenre,
                final String recordName, final String albumName,
                final int recordLength, final String composerName,
                final String labelName, final int id) {
        super(artistName, recordGenre, recordName, albumName, recordLength, composerName, id);
        setLabelName(labelName);
    }


    private void setLabelName(final String labelName) {
        this.labelName = labelName;
    }

    @Override
    public final String getHeaders() {
        return super.getHeaders() + ",labelName\n";
    }

    @Override
    public final String toCSV() {
        return super.getArtistName()  + ", " + super.toCSV() + ", " + labelName + "\n";
    }
}
