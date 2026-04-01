package ArrTasks;

public class EnumDays {

    public enum DayOfWeek {

        MONDAY(false),
        TUESDAY(false),
        WEDNESDAY(false),
        THURSDAY(false),
        FRIDAY(false),
        SATURDAY(true),
        SUNDAY(true);

        private final boolean weekend;

        DayOfWeek(boolean weekend) {
            this.weekend = weekend;
        }

        public boolean isWeekend() {
            return weekend;
        }

        public static DayOfWeek parseDay(String input) {
            if (input == null) {
                throw new IllegalArgumentException("Строка не должна быть null");
            }
            return DayOfWeek.valueOf(input.trim().toUpperCase());
        }
    }
    public static void main(String[] args) {

        DayOfWeek day = DayOfWeek.parseDay("Saturday");

        System.out.println(day);                // SATURDAY
        System.out.println(day.isWeekend());   // true

    }
}