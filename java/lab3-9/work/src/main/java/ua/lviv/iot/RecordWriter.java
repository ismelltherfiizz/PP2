package ua.lviv.iot;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class RecordWriter {
    public void writeToFile(final Map<Integer, Record> rRecordList) {

        try (FileWriter fileWriter = new FileWriter("..\\lab9\\work\\src\\main\\Records.csv", false)) {
            for (Map.Entry<Integer, Record> record: rRecordList.entrySet()) {
                fileWriter.append(record.getValue().getHeaders());
                fileWriter.append(record.getValue().toCSV());
                fileWriter.append("\n");
            }
            fileWriter.close();
            System.out.print("CSV file was created successfully\n");
        } catch (IOException e) {
            System.out.print("Error!!!\n");
            e.printStackTrace();
        }
    }
}