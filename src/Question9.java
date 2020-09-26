public class Question9 {
    public class Cat {
        private String name, color, address;
        private int age, weight;

        // Constructor 1
        public Cat(String name) {
            this.name = name;
            weight = 150;
            age = 23;
            color = "black";
        }

        // Constructor 2
        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            color = "black";
        }

        // Constructor 3
        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
            weight = 150;
            color = "black";
        }

        // Constructor 4
        public Cat(int weight, String color) {
            this.weight = weight;
            this.color = color;
            age = 23;
        }

        // Constructor 5
        public Cat(int weight, String color, String address) {
            this.weight = weight;
            this.color = color;
            age = 23;
            address = "Gamble Heights";
        }
    }

    public static void main(String[] args) {

    }
}
