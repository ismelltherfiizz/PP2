package ua.lviv.iot;

import javax.persistence.*;

@Entity
//@Table (name = "records")
public class Record {


    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "composer_name")
    private String composerName;

    @Column(name = "record_name")
    private String recordName;

    @Column(name = "record_length")
    private Integer recordLength;

    @Column(name = "album_name")
    private String albumName;

    @Column(name = "record_genre")
    private RecordGenre recordGenre;

    public Record() {}

    public Record(final String artistName, final RecordGenre recordGenre, final String recordName,
                  final String albumName, final int recordLength,
                  final String composerName) {
        setArtistName(artistName);
        setRecordGenre(recordGenre);
        setRecordName(recordName);
        setAlbumName(albumName);
        setRecordLength(recordLength);
        setComposerName(composerName);
    }

    public Record(final String artistName, final RecordGenre recordGenre, final String recordName,
                  final String albumName, final int recordLength,
                  final String composerName, final int id) {
        setArtistName(artistName);
        setRecordGenre(recordGenre);
        setRecordName(recordName);
        setAlbumName(albumName);
        setRecordLength(recordLength);
        setComposerName(composerName);
        setId(id);
    }

    protected String getHeaders() {
        return "artistName,recordGenre,recordName,composerName,recordLength,albumName";
    }

    protected String toCSV() {
        return  recordGenre +", " + recordName + ", " + composerName + ", " + recordLength + ", " + albumName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getRecordName() {
        return recordName;
    }
    public void setRecordGenre(RecordGenre recordGenre) {
        this.recordGenre = recordGenre;
    }
    public RecordGenre  getRecordGenre() {
        return recordGenre;
    }
    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public Integer getRecordLength() {
        return recordLength;
    }

    public void setRecordLength(Integer recordLength) {
        this.recordLength = recordLength;
    }

    public void setComposerName(String composerName) {
        this.composerName = composerName;
    }
    public String getComposerName() {
        return composerName;
    }

}
