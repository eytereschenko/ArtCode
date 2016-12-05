package week5.io;

import week5.time_counter.Action;
import week5.time_counter.TimeCounter;

import java.io.*;

/**
 * Created by gorobec on 26.06.16.
 */
public class InputStreamIntro {
    public static void main(String[] args) throws IOException {
        TimeCounter ioReadByte = new TimeCounter();
        long readByteTime = ioReadByte.count(new Action() {
            @Override
            public void run() throws IOException {
                InputStream is = new FileInputStream
                        ("/home/gorobec/Java/development/Teaching/ArtCode/ACO13/home/week1.txt");
                OutputStream os = new FileOutputStream("/home/gorobec/Java/development/Teaching/ArtCode/ACO13/home/week5.txt");


                int readByte;

                while ((readByte = is.read()) != -1){
                    os.write(readByte);
                }
            }
        });
        System.out.println("readByteTime " + readByteTime);


        TimeCounter ioReadByteArray = new TimeCounter();
        long readByteArrayTime = ioReadByte.count(new Action() {
            @Override
            public void run() throws IOException {
                InputStream is = new BufferedInputStream(
                                new FileInputStream
                                ("/home/gorobec/Java/development/Teaching/ArtCode/ACO13/home/week1.txt"));
                OutputStream os = new BufferedOutputStream(
                                new FileOutputStream(
                                "/home/gorobec/Java/development/Teaching/ArtCode/ACO13/home/week6.txt"));


                byte[] byteArray = new byte[400];
                int byteCount;

                while ((byteCount = is.read(byteArray)) != -1){
                    System.out.println(byteCount);
                    os.write(byteArray, 0, byteCount);
                }
                os.flush();
                os.close();
            }
        });
        System.out.println("readByteArrayTime " + readByteArrayTime);
    }
}
