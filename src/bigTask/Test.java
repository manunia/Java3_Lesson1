package bigTask;

public class Test {

    public static void main(String[] args){
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();

        appleBox.addFruitInBox(apple1);
        appleBox.addFruitInBox(apple2);
        appleBox.addFruitInBox(apple3);
        //пытаемся положить апельсин в коробку с яблоками
        //appleBox.addFruitInBox(orange1);
        appleBox.boxInfo();
        System.out.println("Вес коробки с яблоками = " + appleBox.getWeight());

        orangeBox.addFruitInBox(orange1);
        orangeBox.addFruitInBox(orange2);
        orangeBox.addFruitInBox(orange3);
        //пытаемся положить яблоко к апельсинам
        //orangeBox.addFruitInBox(apple1);
        orangeBox.boxInfo();
        System.out.println("Вес коробки с апельсинами = " + orangeBox.getWeight());

        //сравним коробки
        System.out.println(orangeBox.compare(appleBox));

        //создадим еще одну коробку
        Box<Apple> appleBox2 = new Box<Apple>();
        //пересыпем в нее яблоки из первой коробки и сразу проверяем содержимое новой коробки
        appleBox.emptBox().boxInfo();
        //проверяем содержимое старой коробки
        appleBox.boxInfo();

    }
}
