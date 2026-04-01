package ArrTasks;

public class AdultAge {
        private int age;

        public AdultAge(int age) {
            if (age <= 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным или равняться 0");
            }
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public boolean isAdult() {
            return age >= 18;
        }

        public static void main(String[] args) {

            AdultAge p1 = new AdultAge(20);
            AdultAge p2 = new AdultAge(15);

            System.out.println("20 лет -> " + p1.isAdult()); // true
            System.out.println("15 лет -> " + p2.isAdult()); // false

            try {
                AdultAge p3 = new AdultAge(-5);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

            try {
                AdultAge p3 = new AdultAge(0);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
