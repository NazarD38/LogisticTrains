package WriteFile;

import Train.Train;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;



public class WriterToFile extends Thread{

    private ArrayList<Train> trains;
    private String filePath;

    public WriterToFile(ArrayList<Train> trains, String filePath) {

       this.trains=trains;

        this.filePath = filePath;
    }

    @Override
    public void run() {
        while (true) {

            updateFile();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateFile() {
        try (FileWriter fileWriter = new FileWriter(filePath);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (Train train:trains) {
                bufferedWriter.write(train + "\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
