package HWLesson5.Instruments;

public class App {
    /*2.Normal
        А) Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
        Б) Интерфейс Инструмент содержит метод play().
        Г)Гитара содержит переменные класса количество Струн,  Барабан - размер, Труба - диаметр.
        Д) Реализовать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
    */
    public static void main(String[] args) {

        Guitar guitar = new Guitar(7);
        Drums drums = new Drums(20);
        Trumpet trumpet = new Trumpet(32.8);

        guitar.play();
        drums.play();
        trumpet.play();
    }
}
