package Singleton;


public class Main {
    public static void main(String[] args) {
        ConfigurationManager config = ConfigurationManager.getInstance();
        System.out.println(config.getDbPassword());
        System.out.println(config.getDbUserName());
        System.out.println(config.getLogLevel());


    }

}
