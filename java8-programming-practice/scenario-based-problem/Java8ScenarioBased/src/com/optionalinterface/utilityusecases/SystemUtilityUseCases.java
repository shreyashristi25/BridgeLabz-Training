package com.optionalinterface.utilityusecases;
import java.util.* ;

public class SystemUtilityUseCases {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input system values from user 
        System.out.print("Enter configuration value (or press Enter if missing): ");
        String configValue = sc.nextLine();
        if (configValue.isEmpty()) configValue = null;

        System.out.print("Enter environment variable (or press Enter if missing): ");
        String envVariable = sc.nextLine();
        if (envVariable.isEmpty()) envVariable = null;

        System.out.print("Enter file path (or press Enter if missing): ");
        String filePath = sc.nextLine();
        if (filePath.isEmpty()) filePath = null;

        System.out.print("Enter API response (or press Enter if missing): ");
        String apiResponse = sc.nextLine();
        if (apiResponse.isEmpty()) apiResponse = null;

        System.out.print("Enter user preference (or press Enter if missing): ");
        String userPreference = sc.nextLine();
        if (userPreference.isEmpty()) userPreference = null;

        ConfigSystem system = new ConfigSystem(configValue, envVariable, filePath, apiResponse, userPreference);

        // Read configuration value safely
        System.out.println("\nConfiguration Value: " + system.configValue.orElse("Default Config"));

        // Fetch environment variable safely
        System.out.println("Environment Variable: " + system.envVariable.orElse("ENV_NOT_SET"));

        // Return default file path if missing
        System.out.println("File Path: " + system.filePath.orElse("/default/path/config.txt"));

        // Handle API response safely
        System.out.println("API Response: " + system.apiResponse.orElse("No response from API"));

        // Avoid null check while fetching user preferences
        System.out.println("User Preference: " + system.userPreference.orElse("Default Preference"));

        sc.close();
    }


}
