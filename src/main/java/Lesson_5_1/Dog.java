package Lesson_5_1;

public class Dog extends Animal {
    private static int count;
    private String name;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println(this.name + " пробежал " + length + " м.");
        } else if (length >= 0) {
            System.out.println(this.name + " не может столько бежать");
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println(this.name + " проплыл " + length + " м.");
        } else if (length >= 0) {
            System.out.println(this.name + " не может столько плавать");
        } else {
            System.out.println("Error");
        }
    }

    public static int getCount() {
        return count;
    }
}
