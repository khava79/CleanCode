package Singleton;

public class Main2 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("Приложение запущено");
        logger.warning("Система перегружена");
        logger.error("Ошибка!");

    }
}
