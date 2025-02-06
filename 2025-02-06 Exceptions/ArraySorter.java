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

    public void getSorted(){
        try {
            int[] sort10 = Arrays.copyOfRange(array, 0, 10);
            Arrays.sort(sort10);
            System.arraycopy(sort10,0,array,0,10);
        } catch (IndexOutOfBoundsException I) {
            System.err.println("Error: Index out of bound Exception thrown in getSorted method.");
        }
        catch(IllegalArgumentException A ){
            System.err.println("Error: Illegal Argument Exception in getSorted method.");
        }
        catch(NullPointerException N ){
            System.err.println("Error: Null Pointer detected in getSorted. One of the arrays is pointing to null.");
        }
    }
}