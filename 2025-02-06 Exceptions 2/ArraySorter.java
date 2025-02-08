import java.util.Arrays;
import java.util.Random;

public class ArraySorter{
    int[] array = new int[20];
    
    public ArraySorter(){
        this(200);
    }

    public ArraySorter(int maxRange) throws  IllegalArgumentException{
        if(maxRange < 0)
            throw new IllegalArgumentException(" Maximum Range should be a positive number.");
        Random rand = new Random();
        for(int i = 0; i < array.length; i++ ){
            array[i] = rand.nextInt(0, maxRange);
        }

    }

    public void getSorted() throws MyOwnException{
        if(array == null){
            throw new MyOwnException("Error in getSorted: Class variable array is a null pointer.");
        }
        if(array.length < 10 ){
            throw new MyOwnException("Error in getSorted: Array length is less than 10.");
        }
        int[] sort10 = Arrays.copyOfRange(array, 0, 10);
        Arrays.sort(sort10);
        System.arraycopy(sort10,0,array,0,10);
    }
}