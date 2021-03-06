package org.ostelco.dropwizard.firebase;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public final class FirebaseConfig  {
    @NotEmpty
    @JsonProperty("databaseName")
    private String databaseName;

    @NotEmpty
    @JsonProperty("configFile")
    private String configFile;

    public String getDatabaseName() {
        return databaseName;
    }

    public String getConfigFile() {
        return configFile;
    }
}
