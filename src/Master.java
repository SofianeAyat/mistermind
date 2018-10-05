import java.util.*;

public class Master 
{
	int count;
	int code_user [] = new int [4];
	int code[]=new int [4];
	int score=1;
	
	public void jeu() 
	{		
		
		Master a =new Master();
		a.aleatoir_code();
		a.choisir();
		
		a.comparer();
		a.replay();
		
	}
		
	private void aleatoir_code()
	{
		for(int i= 0; i<code.length; i++)
		{
			code[i] = alea(0, 9);
		} 
		System.out.println("le code est a trouver est: "+Arrays.toString(code));

	}

	public static int alea(int Min, int Max)
	{
		return (int) (Math.random()*(Max-Min))+Min;
	}
		
	private void choisir()
	{
		for ( count = 0 ; count < 4 ; count ++ ) 
		{
				System.out.println ("Veuillez entrer un nombre entre 0 et 9:" );
				Scanner sc = new Scanner (System.in);
				code_user[count] = sc.nextInt();
		}
		System.out.println ("Ton code est " + code_user[0]+ code_user[1]+ code_user[2]+ code_user[3]);
	}
	
	private void comparer()
	{
		for(int i = 0; i < 4; i++)
		{ //Tu fais une boucle
			if(code_user[i]==(code[i]))
		    {
				System.out.println(+ code_user[i] + " V");
			}else {
				System.out.println(+ code_user[i] + " X");
			}
		}
	}

	private void replay()
	{
		for ( int c = 0 ; c < 8 ; c ++ ) 
		{
			if(code_user[c]!=(code[c]))
		    {
				choisir();
				System.out.println("ton code est bon");
				score++;
				System.out.println("ton score est : "+score);


		    }else {
				System.out.println("ton code est faux");
		    }
		}
	}
}
			