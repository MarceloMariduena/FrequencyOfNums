import java.util.Scanner;

public class FrequenciyOfNums {
  public static void main(String[] args){
    
    // Scanner object
    Scanner input = new Scanner(System.in);
    
    System.out.println("This program outputs statistics on numbers inputed.");
    
    // Ppromps user for an string of numbers separated by spaces
    System.out.println("Please enter a sequence of numbers from 0 to 12 separated by spaces: ");
    
    // Takes in the raw data and assigns it to variable "values"
    String values = input.nextLine();
    
    // Gets rid of the spaces and assigns the string numbers to an array of string
    String[] splits = values.split("\\s+"); //This regex gets rid of one or mroe whitespaces
    
    // An empty array of integers with the length of splits is initialized
    int[] arrayOfInts = new int[splits.length];
    
    // Enhanced for-loop used to assign each converted (string to integer) value to the arrayOfInts
    int i = 0;
    for (String intString: splits) {
      arrayOfInts[i] = Integer.parseInt(intString); 
      i++; 
    }
    
    // Call the method to output the frequency of each num
    outputNumStats(arrayOfInts);
    
    // Closing the Scanner object
    input.close();
  }
  public static void outputNumStats(int[] intArray){
    int freqOf0 = 0;
    int freqOf1 = 0;
    int freqOf2 = 0;
    int freqOf3 = 0;
    int freqOf4 = 0;
    int freqOf5 = 0;
    int freqOf6 = 0;
    int freqOf7 = 0;
    int freqOf8 = 0;
    int freqOf9 = 0;
    int freqOf10 = 0;
    int freqOf11 = 0;
    int freqOf12 = 0;
      
    // Iterate through all the integers in the array
    for (int i = 0; i < intArray.length; i++){
      switch (intArray[i]){
        case 0:
        freqOf0++;
        break;
        case 1:
        freqOf1++;
        break;
        case 2:
        freqOf2++;
        break;
        case 3:
        freqOf3++;
        break;
        case 4:
        freqOf4++;
        break;
        case 5:
        freqOf5++;
        break;
        case 6:
        freqOf6++;
        break;
        case 7:
        freqOf7++;
        break;
        case 8:
        freqOf8++;
        break;
        case 9:
        freqOf9++;
        break;
        case 10:
        freqOf10++;
        break;
        case 11:
        freqOf11++;
        break;
        case 12:
        freqOf12++;
        break;
      }
    }
    System.out.println("[0]" + " -> " + freqOf0);
    System.out.println("[1]" + " -> " + freqOf1);
    System.out.println("[2]" + " -> " + freqOf2);
    System.out.println("[3]" + " -> " + freqOf3);
    System.out.println("[4]" + " -> " + freqOf4);
    System.out.println("[5]" + " -> " + freqOf5);
    System.out.println("[6]" + " -> " + freqOf6);
    System.out.println("[7]" + " -> " + freqOf7);
    System.out.println("[8]" + " -> " + freqOf8);
    System.out.println("[9]" + " -> " + freqOf9);
    System.out.println("[10]" + " -> " + freqOf10);
    System.out.println("[11]" + " -> " + freqOf11);
    System.out.println("[12]" + " -> " + freqOf12);
  }
  
}



