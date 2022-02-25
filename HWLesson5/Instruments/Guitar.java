package HWLesson5.Instruments;

public class Guitar implements Instruments {
    private int countStrings;

    public Guitar(int countStrings) {
        this.countStrings = countStrings;
    }

    public int getCountStrings() {
        return countStrings;
    }

    public void setCountStrings(int countStrings) {
        if (countStrings < 1) throw new IllegalArgumentException("Должна быть хоть одна струна");
        this.countStrings = countStrings;
    }

    @Override
    public void play() {
        System.out.println("Играет Гитара c " + countStrings + " струнами");
    }
}
