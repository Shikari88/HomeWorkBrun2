package HWLesson4.Cats;

import java.util.Arrays;

// Есть класс Кот с полями имя, цвет, скорость, вес, мыши!
public class Cat {
    private String name;
    private String color;
    private double speed;
    private double weight;
    private Mouse[] countMouses;


    public Cat(String name, String color, double speed, double weight, Mouse[] countMouses) {
        setName(name);
        setColor(color);
        setSpeed(speed);
        setWeight(weight);
        setCountMouses(countMouses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.trim().length() < 1) throw new IllegalArgumentException("Значение name < 1");
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.trim().length() < 1) throw new IllegalArgumentException("Значение поля < 1");
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed < 0) throw new IllegalArgumentException("Скорость не может быть отрицательной");
        this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) throw new IllegalArgumentException("Вес не может быть меньше 0 кг");
        this.weight = weight;
    }

    public Mouse[] getCountMouses() {
        return countMouses;
    }

    public void setCountMouses(Mouse[] countMouses) {
        this.countMouses = countMouses;
    }

    //на вход(аргумент) метода приходит новая мышь
    public void catchMouse(Mouse mouse) {
    //если скорость текущего кота больше скорости текущей(входящей) мыши
        if (this.speed > mouse.getSpeed())
        for (int i = 0; i < countMouses.length; i++) {
            if(countMouses[i] == null) {
                //добавляем в массив
                countMouses[i] = mouse;
                return;
            }
        }
    }
    //*Кот может атаковать другого кота, если его вес больше веса атакующего,
    // то кот забирает всех мышей у атакующего кота
    public void attackCat(Cat cat) {
        if (this.weight > cat.getWeight()) {
            if (cat.countMouses == null) throw new IllegalArgumentException("У кота нет мышей");
            this.countMouses = Arrays.copyOf(cat.countMouses, cat.countMouses.length);
            cat.countMouses = null;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                ", countMouses=" + Arrays.toString(countMouses) +
                '}';
    }
}
