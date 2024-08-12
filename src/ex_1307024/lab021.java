package ex_1307024;

public class lab021 {

        public static void main(String[] args) {
            Dog myDog1 = new Dog("Fido", 3, "Golden Retriever", "Golden");
            myDog1.walk();
            myDog1.run();
            myDog1.sleep();
            myDog1.eat();
            System.out.println("My dog's name is " + myDog1.getName());
            System.out.println("My dog's age is " + myDog1.getAge());
        }

}
