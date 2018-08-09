package bigTask;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> box;
    private float boxWeight;

    public Box() {
        this.box = new ArrayList<T>();
    }

    //метод добавления фрукта в коробку
    public ArrayList addFruitInBox(T fruit){
        this.box.add(fruit);
        return box;
    }

    //метод который высчитывает вес коробки,
    // зная количество фруктов и вес одного фрукта
    public float  getWeight(){
        for (Fruit t:box) {
            boxWeight+=t.geWeight();
        }
        return boxWeight;
    }

    //метод compare, который позволяет сравнить текущую коробку с той,
    // которую подадут
    public boolean compare(Box box){
        if (this.boxWeight == box.getWeight()) return true;
        else return false;
    }

    //метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку
    public Box<T> emptBox(){
       Box<T> newBox = new Box<>();
        System.out.println("Фрукты пересыпаются:");
        for (T t:this.box) {
            System.out.println(t.getClass().getName() + " пересыпано в новую коробку");
            newBox.addFruitInBox(t);
        }
        this.box.removeAll(box);
        return newBox;
    }

    public void boxInfo() {
        if (box.isEmpty()) System.out.println("Коробка пуста.");
        else {
            System.out.println("Содержимое коробки:");
            for (T t : box) {
                System.out.println(t.getClass().getName());
            }
        }
    }
}
