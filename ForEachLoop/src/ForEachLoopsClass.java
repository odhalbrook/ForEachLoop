
public class ForEachLoopsClass
	{

		static String [] fiveElement = new String [5];
		static int [] fiveNumber = new int [5];
		public static void main(String[] args)
			{
				fiveElements();
				listTwo();
				doubleNumber();
				totalNums();
			}

		private static void fiveElements()
			{
				fiveElement [0] = "Fizz";
				fiveElement [1] = "Buzz";
				fiveElement [2] = "FizzBuzz";
				fiveElement [3] = "FizzBuzzFizz";
				fiveElement [4] = "FizzBuzzFizzBuzz";
				
				for(String s : fiveElement)
					{
						System.out.println(s);
					}
				
			}

		private static void listTwo()
			{
				for(String s : fiveElement)
					{
						System.out.print(s + " ");
					}
			}

		private static void doubleNumber()
			{
				fiveNumber [0] = 5;
				fiveNumber [1] = 10;
				fiveNumber [2] = 15;
				fiveNumber [3] = 20;
				fiveNumber [4] = 25;
				
				for(int i : fiveNumber)
					{
						System.out.println(i * 2);
					}
				
			}

		private static void totalNums()
			{
				int sum = 0;
				for(int i : fiveNumber)
					{
						sum += i;
					}
				System.out.println("The total is " + sum);
			}

	}
