package Lesson_5_1;

public class Cat extends Animal {

    private static int count;
    private String name;
    private boolean satiety;


    public Cat(String name) {
        this.name = name;
        count++;
    }

    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println(this.name + " пробежал " + length + " м.");
        } else if (length >= 0) {
            System.out.println(this.name + " не может столько бежать");
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(this.name + " не умеет плавать");
    }

    @Override
    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int eat(int countFoodNeed, int countFoodAvailable) {
        if (countFoodNeed <= countFoodAvailable) {
            satiety = true;
            return countFoodNeed;
        }
        else {
            satiety = false;
            return 0;
        }
    }


}
