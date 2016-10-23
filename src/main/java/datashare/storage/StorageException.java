package datashare.storage;

public class StorageExcepton extends RuntimeException {

    public StorageExcepton(String message) {
        super(message);
    }

    public StorageExcepton(String message, Trowable cause) {
        super(message, cause);
    }
}
