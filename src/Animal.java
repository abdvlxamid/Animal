public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Я " + getName() + " и я говорю:");
        sound();
    }
}