package HWLesson5.Instruments;

public class Drums implements Instruments {
    private double size;

    public Drums(double size) {
        setSize(size);
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size < 14) throw new IllegalArgumentException("Значение меньше минамально допустимого");
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Играют барабаны c размером: " + size);
    }
}
