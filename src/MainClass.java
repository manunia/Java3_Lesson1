/*
created by Maria L
 */

import java.util.ArrayList;
import java.util.Collections;

public class MainClass<T> {

    private T[] obj;

    //конструктор
    public MainClass(T[] obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void showType(){
        System.out.println("Тип Т: " + obj.getClass().getName());
    }

    public void printType(){
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i].toString()+" ");
        }
        System.out.println();
    }

    //1. Написать метод, который меняет два элемента массива местами.
    // (массив может быть любого ссылочного типа)
    public void changePlace(int i, int j){
        if (i <= obj.length && j <= obj.length){
            T temp = obj[i];
            obj[i] = obj[j];
            obj[j] = temp;
        }else {
            System.out.println("Exception! Incorrect index");
        }
    }

    //Написать метод, который преобразует массив в ArrayList
    public void massToList(T[] arr){
        ArrayList<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
    }

    public static void main(String[] args) {

        MainClass<String> strObj = new MainClass<String>(new String[]{"s", "p","o","m"});
        strObj.printType();
        strObj.changePlace(0,3);
        strObj.printType();
        strObj.showType();

        Animal[] animals = new Animal[]{
                new Animal("cat"),
                new Animal("horse"),
                new Animal("dog"),
                new Animal("puma")
        };
        MainClass<Animal> animalObj = new MainClass<Animal>(animals);
        animalObj.printType();
        animalObj.changePlace(3,1);
        animalObj.printType();

        animalObj.massToList(animals);
        animalObj.showType();



    }
}
