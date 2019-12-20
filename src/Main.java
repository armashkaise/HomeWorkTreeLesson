public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        //добавление элементов
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.printValues();
        //System.out.println(myArrayList.count());

        //добавление новых элементов
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.printValues();

        //добавление нового элемента в середину массива
        myArrayList.add(4, 100);
        myArrayList.printValues();

        //вывод количества элементов
        System.out.println("Количество элементов в массиве: " + myArrayList.count());

        //удаление элемента
        myArrayList.delete(2);
        myArrayList.printValues();

        //удаление всех элементов массива
        myArrayList.deleteAll();
        myArrayList.printValues();
    }

}
