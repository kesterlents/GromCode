package lesson29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ruslan on 18.09.2018.
 */
public class IteratorIntro {
    public static void main(String[] args) {
        Set<File> files = new HashSet<>();
        File file1 = new File ("pict.txt", 100);
        File file2 = new File ("home.txt", 178);
        File file3 = new File ("home444.txt", 1765);

        files.add(file1);
        files.add(file2);
        files.add(file3);

        System.out.println(files);

        Iterator<File> fileIterator = files.iterator();
        while (fileIterator.hasNext()){
            System.out.println(fileIterator.next().getFileName());
        }
    }

}
