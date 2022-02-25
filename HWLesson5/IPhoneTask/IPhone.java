package HWLesson5.IPhoneTask;

import java.util.Objects;

/*Создать класс iPhone с полями модель,вес,кол-во сим-карт,ширина,высота,тип материала(металл или стекло)
 и переопределить в нем методы toString /equals/hashCode*/
public class IPhone {
    private String model;
    private double weight;
    private int countSim;
    private int width;
    private int height;
    private String typeMaterial;

    public IPhone(String model, double weight, int countSim, int width, int height, String typeMaterial) {
        setModel(model);
        setWeight(weight);
        setCountSim(countSim);
        setWidth(width);
        setHeight(height);
        setTypeMaterial(typeMaterial);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.trim().length() < 1) {
            throw new IllegalArgumentException("Значение model < 1");
        };
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight < 1) throw new IllegalArgumentException("Некорректное значение");
        this.weight = weight;
    }

    public int getCountSim() {
        return countSim;
    }

    public void setCountSim(int countSim) {
        if(countSim < 1) throw new IllegalArgumentException("Некорректное значение");
        this.countSim = countSim;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(weight < 1) throw new IllegalArgumentException("Некорректное значение");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTypeMaterial() {
        return typeMaterial;
    }

    public void setTypeMaterial(String typeMaterial) {
        this.typeMaterial = typeMaterial;
    }

    @Override
    public String toString() {
        //если я правильно понял, то под настройкой toString "под себя"
        //понимается произвольное удаление/возврат полей(здесь они /**/)
        return "IPhone{" +
                "model='" + model + '\'' +
                /*", weight=" + weight +
                ", countSim=" + countSim +*/
                ", width=" + width +
                ", height=" + height +
                ", typeMaterial='" + typeMaterial + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //таже история и с equals
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPhone iPhone = (IPhone) o;
        return Double.compare(iPhone.weight, weight) == 0 && countSim == iPhone.countSim && width == iPhone.width && height == iPhone.height && Objects.equals(model, iPhone.model)/* && Objects.equals(typeMaterial, iPhone.typeMaterial)*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, weight, countSim, width, height, typeMaterial);
    }
}
