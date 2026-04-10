package Singleton;


public class ConfigurationManager {

    private static ConfigurationManager configurationManager;

    // Конфигурационные параметры
    private String dbURL;
    private String dbUserName;
    private String dbPassword;
    private String fileStoragePath;
    private String logLevel;
    private String logFilePath;


    private ConfigurationManager() {
        loadConfiguration();
    }

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void loadConfiguration() {
        this.dbURL = "jdbc:mysql://localhost:3306/mydb";
        this.dbUserName = "root";
        this.dbPassword = "password";
        this.fileStoragePath = "/data/files/";
        this.logLevel = "INFO";
        this.logFilePath = "/logs/app.log";
    }


    public String getDbURL() {
        return dbURL;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getFileStoragePath() {
        return fileStoragePath;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }
}