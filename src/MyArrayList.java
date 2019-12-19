import java.sql.Array;

public class MyArrayList {
    private int[] values;
    private int count = 0;

    public void add(int... val){

        if (count == 0){
            values = val;
        }
        else {
            int[] newValues = new int[values.length + val.length];
            System.arraycopy(values, 0, newValues, 0, values.length);
            System.arraycopy(val, 0, newValues, values.length, val.length);
            values = newValues;
        }
        count += val.length;
    }

    public int count(){
        return count;
    }

    public void clear(){
        int [] i = null;
        values = i;
    }


    public int[] getValues(){
        return values;
    }

    public void printValues(){
        //int[] val = getValues();
        for (int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
