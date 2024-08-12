package ex_1307024;


    public class Dog {

        private String name;
        private int age;
        private String breed;
        private String color;

        public Dog(String name, int age, String breed, String color) {
            this.name = name;
            this.age = age;
            this.breed = breed;
            this.color = color;
        }

        public void walk() {
            System.out.println(name + " is walking.");
        }

        public void run() {
            System.out.println(name + " is running.");
        }

        public void sleep() {
            System.out.println(name + " is sleeping.");
        }

        public void eat() {
            System.out.println(name + " is eating.");
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getBreed() {
            return breed;
        }

        public String getColor() {
            return color;
        }
    }

