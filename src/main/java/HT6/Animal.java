package HT6;

public class Animal {

    String name;

    public Animal() {
    }

    public void swim (int length) {
        System.out.println(name + " проплыл " + length + " м");
    }

    public void run (int length) {
        System.out.println(name + " пробежал " + length + " м");
    }

}
