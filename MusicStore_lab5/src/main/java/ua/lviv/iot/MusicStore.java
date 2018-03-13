package ua.lviv.iot; /**
 * Created by user on 2/26/2018.
 */

import java.util.Comparator;
import java.util.LinkedList;


class MusicStore {

    protected LinkedList<Record> records = new LinkedList();


    public void setRecord(Record Hurt, Record Ziggy, Record SmoothCriminal, Record Symphony9, Record HandCoversBruise, Record HamOnRye, Record HLAH) {
        records.add(Hurt);
        records.add(Ziggy);
        records.add(SmoothCriminal);
        records.add(Symphony9);
        records.add(HandCoversBruise);
        records.add(HamOnRye);
        records.add(HLAH);

    }


    public void findByRecordingPossibility(RecordGenre recordGenre) {
        System.out.println(recordGenre + " records which you can write to CD:");
        for (Record record : records) {
            //pmd report: These nested if statements could be combined
            if (record.recordLength <= 600 || record.recordGenre == recordGenre) {


                System.out.println("'" + record.recordName + "'" + " by " + "'" + record.artistName + "'" + " (" + record.recordLength + " seconds);");

            }
        }

    }




    public void sortByComposer() {

        System.out.println("Records sorted by composer: ");
        records.sort(new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.composerName.compareTo(o2.composerName);
            }
        });
        for (Record record : records) {
            System.out.println("'" + record.recordName + "'" + " by " + "'" + record.composerName + "'" + ";");
        }
    }

}