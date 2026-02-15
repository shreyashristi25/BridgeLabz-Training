package com.optionalinterface.utilityusecases;
import java.util.* ;

public class ConfigSystem {

	Optional<String> configValue;
    Optional<String> envVariable;
    Optional<String> filePath;
    Optional<String> apiResponse;
    Optional<String> userPreference;

    //constructor
    public ConfigSystem(String configValue, String envVariable, String filePath, String apiResponse, String userPreference) {
        this.configValue = Optional.ofNullable(configValue);
        this.envVariable = Optional.ofNullable(envVariable);
        this.filePath = Optional.ofNullable(filePath);
        this.apiResponse = Optional.ofNullable(apiResponse);
        this.userPreference = Optional.ofNullable(userPreference);
    }

}
