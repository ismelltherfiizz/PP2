package ua.lviv.iot;

import ua.lviv.iot.persistence.dao.RecordDao;

import javax.inject.Inject;
import java.io.Serializable;
import java.util.*;

public class MusicStore implements Serializable{

    private Map<Integer, Record> recordList = new HashMap<>();

    @Inject
    private RecordDao dao;

    public MusicStore() {
    }

    public MusicStore(final Map<Integer, Record> rRecordList) {
        setRecordList(rRecordList);
    }

    public final void addRecord(final Record record) {
        dao.persist(record);
//        recordList.put(record.getId(), record);
    }

    public Record findById(Integer id){
        return dao.findById(id);
    }

    public void deleteRecord(Integer id){
        dao.deleteById(id);
    }

    public boolean updateRecord(Integer id, Record record){
        return dao.update(record) != null;
    }

    public final Map<Integer, Record> findByRecordingPossibility(RecordGenre recordGenre) {
        Map<Integer, Record> result = new LinkedHashMap<>();
        for (Map.Entry<Integer, Record> rRecordList : recordList.entrySet()) {
            if (rRecordList.getValue().getRecordLength() <= 600 || rRecordList.getValue().getRecordGenre() == recordGenre) {
                result.entrySet().add(rRecordList);
            }
        }
        return result;
    }


    public static Map<Integer, Record> sortByComposer(Map<Integer, Record> recordList) {

        List<Map.Entry<Integer, Record>> list =
                new LinkedList<Map.Entry<Integer, Record>>(recordList.entrySet());


        Collections.sort(list, new Comparator<Map.Entry<Integer, Record>>() {
            public int compare(Map.Entry<Integer, Record> o1,
                               Map.Entry<Integer, Record> o2) {
                return (o1.getValue().getComposerName()).compareTo(o2.getValue().getComposerName());
            }
        });

        Map<Integer, Record> sortedMap = new LinkedHashMap<Integer, Record>();
        for (Map.Entry<Integer, Record> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
            System.out.println("'" + entry.getValue().getRecordName() + "'" + " by " + "'" + entry.getValue().getComposerName() + "'" + ";");

        }



        return sortedMap;
    }




    public final void setRecordList(final Map<Integer, Record> rRecordList) {
        recordList = rRecordList;
    }

    public Map<Integer, Record> getRecordList() {
        return recordList;
    }
}
