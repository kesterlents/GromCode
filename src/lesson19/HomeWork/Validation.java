package lesson19.HomeWork;

/**
 * Created by Ruslan on 29.05.2018.
 */
public class Validation {
    void validationFile(Storage storage, File file) throws Exception {
        if (file != null) {
            findDuplicates(storage, file);
            checkSizeFile(storage, file);
            checkFormatFile(storage, file);
        }
    }

    void findDuplicates(Storage storage, File file) throws Exception {
        for (File strgFile : storage.getFiles()) { //is storage consists of such file to add?
            if (strgFile != null && strgFile.getId() == file.getId())
                throw new Exception("file " + file.getId() + " is containing in storage " + storage.getId());
        }
    }

    void checkSizeFile(Storage storage, File file) throws Exception {
        long curStorSize = 0;
        for (File file1 : storage.getFiles()) { //calculating current size of storage
            if (file1 != null)
                curStorSize += file1.getSize();
        }
        if (curStorSize + file.getSize() > storage.getStorageSize())
            throw new Exception("file " + file.getId() + " can't add in " + storage.getId());
    }

    void checkFormatFile(Storage storage, File file) throws Exception {

        //is format of file suitable for adding in storage?
        for (String format : storage.getFormatsSupported()) {
            if (file.getFormat().equals(format))
                return;
        }
        throw new Exception("file " + file.getId() + " can't add in " + storage.getId());
    }
}
