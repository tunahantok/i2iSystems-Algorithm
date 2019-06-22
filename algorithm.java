import java.util.Random;


public class algorithm {
	
	public static void main(String arg[])	
	{
		Random r = new Random();
		int[] numbers = new int[5];
		int temp = 0;
		System.out.print("Random Sayýlar \n");
		for (int i=0; i < numbers.length; ++i) {
			numbers[i]=r.nextInt(10);
			System.out.println(numbers[i]);
		    for (int j=1; j < (numbers.length - i); ++j) {
		        if (numbers[j-1] > numbers[j]) {
		            temp = numbers[j-1];
		            numbers[j-1] = numbers[j];
		            numbers[j] = temp;
		        }
		    }
		}
		int numDup = 0, dupCount = 0;
		int previous = -1;
		for (int i=0; i < numbers.length; ++i) {
		    if (numbers[i] == previous) {
		        ++numDup;
		        if (numDup == 1) {
		            ++dupCount;
		            if (dupCount == 1) {
		                System.out.print(numbers[i]);
		            }
		            else {
		                System.out.print("\n Tekrar eden sayýlar: " + numbers[i]);
		            }
		        }
		    }
		    else {
		        previous = numbers[i];
		        numDup = 0;
		    }
		}

		System.out.println("\nTekrar etme sayýlarý:s: " + dupCount);
		
				}
				
			}
	

	
	
	 
	

