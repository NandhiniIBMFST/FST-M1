package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = {10, 77, 10, 54, -11, 10};
		int searchNum = 10;
		int fixedSum = 30;
		for (int number : numArr) {
			System.out.println(number);
		}
		System.out.println("Result: "+result(numArr, searchNum, fixedSum));
	}
		
	public static boolean result(int[] numbers,int searchNum, int fixedSum) {	
		
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);

			if(numbers[i]==searchNum)
                sum = sum + searchNum;
            }
		return sum==fixedSum;
		}
			
		}
	
	


