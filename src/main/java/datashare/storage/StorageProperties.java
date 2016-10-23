package datashare.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

    private String location = "upoad-dir";

    public String getLocation() {
        return location;
    }
}
