package New180;

public class B {
	
	void primeNumber(int n)
	{
		int cnt = 0;
		for(int i =1; i <= n; i++)
		{
			if(n % i == 0)
			{
				cnt++;
			}
		}
		if(cnt == 2)
		{
			System.out.println(n+"is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}

}
