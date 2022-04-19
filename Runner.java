import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//______________________________________________________________________________________________________________________
public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
//______________________________________________________________________________________________________________________
////
////       1. Add "Coll" to the end of the list
//        scottishIslands.add("Coll");
//
////        2. Add "Tiree" to the start of the list
//        scottishIslands.add(0, "Tiree"); // the 0 is the index =0 for the first one
//
////        3. Add "Islay" after "Jura" and before "Mull"
//        scottishIslands.add(2, "Islay");
//
////        4. Print out the index position of "Skye"
//        System.out.println(scottishIslands.indexOf("Skye"));
//
////        5. Remove "Tresco" from the list by name
//        scottishIslands.remove("Tresco");
//
////        6. Remove "Arran" from the list by index
//        scottishIslands.remove(5);
//
////        7. Print the number of islands in your arraylist
//        System.out.println(scottishIslands.size());
//
////        8. Sort the list alphabetically
//        Collections.sort(scottishIslands);
//
////        9. Print out all the islands using a for loop
//        for (String island : scottishIslands) { //island is just a name for the thing we want
//            System.out.println(island);
//        }
//
//        System.out.println(scottishIslands);
//_____________________________________________________________________________________________________________________
//        NUMBERS
        List<Integer> numbers = new ArrayList<>(); // new we are creating something- creating a new
        // (numbers) is just a name given to the Array list
        // 'list' is the interface
        // Note that int is a primitive data type,
        //  while Integer= a wrapper class
        //Wrapper classes provide a way to use primitive data types ( int , boolean , etc..) as objects.

        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);
        //The addAll() is a method of Java Collections class which adds all of the specified elements to
        // the specified collection.

        System.out.println("numbers: " + numbers);
//----------------------------------------------------------------------------------------------------------------------
//        1. Print out a list of the even integers
        for (int number : numbers) {
            // modulus if numbers are divisible by 2 --> even numbers
            if ((number % 2) == 0) { //% = modulus.  All even numbers are divisible by 2 , with remainder of 0
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value

        System.out.println(Collections.max(numbers) - Collections.min(numbers));


//        3. Print true if the list contains a 1 next to a 1 somewhere

        //first condition:
        for (int i = 0; i < numbers.size(); i++) {
            //i=0 - initial value starting at number 0
            //included "int because when we storing a variable we need to include the data type
            //in the array list numbers get index i
            //now want to check if number will be number 1

            //second condition:
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                //if we get an i that equals 1 and the next number
                // (i++)= i+1 is also equal to one, then we have two 1s that are side by side
                // = true

                System.out.println(true);
            }
        }
//
//        4. Print the sum of the numbers

        // Declare a variable (sum) to store the sum of numbers and initialise it to 0
        int sum = 0;
        //create a for loop starting with a variable 'i' that starts at 0,
        // let i loop for as long as the  size of the elements in "numbers"
        //the size is the total number of occupied slots
        // i will increase by 1 (moving to the next number) each time

        for (int i = 0; i < numbers.size(); i++) {
            //the total sum = (sum =0) + the numbers that we move up by one each time
            sum = sum + numbers.get(i);
        }

        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

        int total = 0;

        for (int number : numbers) {
            if (number == (13)) {  //if I find number 13 then
                break;
            }            //...break

            //We then sum up the numbers

            total = total + number;
        }
        System.out.println(total);
    }
}









