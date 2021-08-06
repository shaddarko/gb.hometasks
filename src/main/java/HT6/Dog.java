package HT6;

public class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }
    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println(name + " проплыл " + length + " м");
        }
        else System.out.println("Собака не плыть более 10 м");
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println(name + " пробежал " + length + " м");
        }
        else System.out.println("Собака не может бежать более 500 м");
    }
}
