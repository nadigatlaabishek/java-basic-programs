class Prime_numbers1to100
{
	public static void main(String[] args) 
	{
		int x=2;
		int PrimeCount =1;
		while (PrimeCount<=100)
		{
			int count=0;
			for (int a=1;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
			 	}
		   }
		   if (count==2)
			{
		
	       	System.out.println(PrimeCount+") "+x);
	      	PrimeCount++;
    	}
       	x++;
    }
}
}