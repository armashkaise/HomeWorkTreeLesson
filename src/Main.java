public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();

        myArrayList.add(1, 2, 3, 4, 5);
        myArrayList.printValues();
        //System.out.println(myArrayList.count());

        myArrayList.add(6, 7, 8);
        myArrayList.printValues();
       // System.out.println(myArrayList.count());

        myArrayList.clear();
        myArrayList.printValues();
    }

}
