package HWLesson4.Cats;
//Есть класс Мышь, которая имеет только одно поле - скорость
public class Mouse {
    private double speed;

    public Mouse(double speed) {
        setSpeed(speed);
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if(speed < 0) throw new IllegalArgumentException("Скорость не может быть отрицательной");
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                '}';
    }
}
