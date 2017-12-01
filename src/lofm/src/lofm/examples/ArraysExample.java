package lofm.examples;

public class ArraysExample {

    public void runExamples() {
        //Creating an array in one line
        String[] shoppingList = {"eggs", "milk", "fruit"};
        System.out.println("shoppingList length: " + shoppingList.length);

        //Creating an array separately
        //Specify size of the array
        String[] anotherShoppingList;
        anotherShoppingList = new String[4];
        System.out.println("anotherShoppingList length: " + anotherShoppingList.length);

        //Accessing array values
        System.out.println("Element 1: "+anotherShoppingList[1]);

        //Assigning all values at once
        anotherShoppingList = new String[]{"bread", "greens", "meat"};
        System.out.println("anotherShoppingList length: " + anotherShoppingList.length);
        System.out.println("Element 1: "+anotherShoppingList[1]);

        //Modifying array values
        anotherShoppingList[1] = "chicken";
        System.out.println("Element 1: "+anotherShoppingList[1]);

        //Iterating overs arrays
        String[] allItems = new String[6];
        for(int i=0; i<anotherShoppingList.length; i++) {
            allItems[i] = shoppingList[i];
            allItems[i + 3] = anotherShoppingList[i];
        }
        for(int i=0; i<allItems.length; i++) {
            System.out.println("allItems's element " + i + ": " + allItems[i]);
        }

        //Copying elements from one array to another
        System.arraycopy(allItems, 0, anotherShoppingList, 0, 3);
        System.out.println("shoppingList element 1: " + shoppingList[1]);
        System.out.println("anotherShoppingList element 1: " + anotherShoppingList[1]);

        //Given an array return the reversed array
        String tempItem;
        for (int i=0; i<(allItems.length/2); i++) {
            tempItem = allItems[i];
            allItems[i] = allItems[allItems.length - 1 - i];
            allItems[allItems.length - 1 - i] = tempItem;
        }
        for(int i=0; i<allItems.length; i++) {
            System.out.println("allItems's element " + i + ": " + allItems[i]);
        }
    }

}