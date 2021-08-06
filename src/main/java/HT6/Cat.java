package HT6;

public class Cat extends Animal {

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void swim(int length) {
        System.out.println("Коты не умеют плавать");
    }

    @Override
    public void run(int length) {
    if (length <= 200) {
        System.out.println(name + " пробежал " + length + " м");
    }
    else System.out.println("Кот не может бежать больше 200 м");
    }
}

