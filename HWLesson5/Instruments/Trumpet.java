package HWLesson5.Instruments;

public class Trumpet implements Instruments{
    private double diameter;

    public Trumpet(double diameter) {
        setDiameter(diameter);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (diameter < 10) throw new IllegalArgumentException("Значение меньше минамально допустимого");
        this.diameter = diameter;
    }




    @Override
    public void play() {
        System.out.println("Играет труба c диаметром: " + diameter);
    }
}
