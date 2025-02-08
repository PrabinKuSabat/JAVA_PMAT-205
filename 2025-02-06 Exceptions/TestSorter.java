
public class TestSorter {
    public static void main(String[] args) {
        ArraySorter sorter = null;
        int maxRange = 0;
        if(args.length > 0) {
            try {
                maxRange = Integer.parseInt(args[0]);

                sorter = new ArraySorter(maxRange);
            } catch(NumberFormatException nfe) {
                System.err.println("Error: Provided argument '" + args[0] + "' is not a valid integer.");
                nfe.printStackTrace();
            }
            try {
                sorter = new ArraySorter();
            } catch(IllegalArgumentException iae) {
                System.err.println("Error during ArraySorter creation: " + iae.getMessage());
                iae.printStackTrace();
                return;
            }
        }
        else{
            try {
                sorter = new ArraySorter();
            } catch(IllegalArgumentException iae) {
                System.err.println("Error during ArraySorter creation: " + iae.getMessage());
                iae.printStackTrace();
                return;
            }
        }

        try {
            sorter.getSorted();
        } catch(Exception e) {
            System.err.println("Exception occurred during sorting:");
            e.printStackTrace();
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < 10 && i < sorter.array.length; i++) {
            System.out.print(sorter.array[i] + " ");
        }

        System.out.println();
        for (int i = 10; i < sorter.array.length; i++) {
            System.out.print(sorter.array[i] + " ");
        }
        System.out.println("\n");

        // Forcing Exceptions
        // 1. Force a NullPointerException: Dispose (null out) the array and then call getSorted.
        // sorter.array = null;
        // try {
        //     sorter.getSorted();
        // } catch(NullPointerException npe) {
        //     System.err.println("Forced NullPointerException caught:");
        //     npe.printStackTrace();
        // }

        // // 2. Force an IndexOutOfBoundsException:
        // // Create a new array with fewer than 10 elements and assign it.
        // sorter.array = new int[5];
        // try {
        //     sorter.getSorted();
        // } catch(IndexOutOfBoundsException ioobe) {
        //     System.err.println("Forced IndexOutOfBoundsException caught:");
        //     ioobe.printStackTrace();
        // }

        // // Finally, dispose of the array.
        // sorter.array = null;
        // System.out.println("Array disposed.");
    }
}
