public class Main {
    public static void main(String[] args) {
        // Создаем животных
        Animal dog = new Dog("salom");
        Animal duck = new Duck("hary");
        Animal cat = new Cat("gary");

        System.out.println("Kuchu: " + dog.getName());
        dog.sound();

        System.out.println("\nO'rdak: " + duck.getName());
        duck.sound();

        System.out.println("\nMushuk: " + cat.getName());
        cat.sound();

        dog.printInfo();
        duck.printInfo();
        cat.printInfo();
    }
}