
public class Test2 {

	public static void main(String[] args) 
	{
		int N = 2;
		System.out.println(solution(N));
	}
	
	public static int solution(int input1) 
	{
			if(input1 == 1) 
			{
				return 4;
			}
			int countB = 1;
			int countS = 1;
			int prev_countB;
			int prev_countS;
			
			for(int i = 2; i<=input1; i++) 
			{
				prev_countB = countB;
				prev_countS = countS;
				
				countS = prev_countB + prev_countS;
				countB = prev_countS;
		
			}
			
			int result = countS + countB;
			return result*result;
			
			// AAA gaya AA gay dekho dil churane aa gaya
			// AAA gaya AA gaya dekho dil churane AA gaya
	}

}
