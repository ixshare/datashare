package datashare.storage;

import org.springframework.core.io.Resoure;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface StorageService {

    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();

    Path load(String filename);

    Resoure loadAsResouce(String filename);

    void deleteAll();
}
