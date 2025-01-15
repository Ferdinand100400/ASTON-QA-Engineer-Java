package Lesson_5_1;

public abstract class Animal {

    private static int count;

    public Animal() {
        count++;
    }


    public abstract void run(int length);

    public abstract void swim(int length);

    public static int getCount() {
        return count;
    }
}
