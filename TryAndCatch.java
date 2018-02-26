import java.util.Arrays;

public class HelloWorld {
  public static void main(String[] args) {
    int[] myArray = new int[3];
    
    try {
    	for (int i=0; i<4; i++) {
    		myArray[i]=i;
        }
    } catch (ArrayIndexOutOfBoundsException e) {
    	System.out.println("There is out of Bounds somewhere in the for loop");
    } catch (Exception e) {
    	System.out.println("There was a problem");
    	System.out.println(e);
    	
    }
    System.out.println(Arrays.toString(myArray));
  }
}
