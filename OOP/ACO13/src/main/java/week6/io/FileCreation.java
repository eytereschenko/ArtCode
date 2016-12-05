package week6.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by gorobec on 02.07.16.
 */
public class FileCreation {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/gorobec/dir1");

        deleteFile(file.getAbsolutePath());

    }

    private static void deleteFile(String path) {
        File file = new File(path);

        if(file.isFile()){
            file.delete();
        } else {
            File[] files = file.listFiles();

            for (File file1 : files) {
                deleteFile(file1.getAbsolutePath());
            }
            file.delete();
        }

    }
}
