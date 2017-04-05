import java.io.*;
import java.util.*;
class Permutation{
 static int count=0;
public static void permutations(String str) { 
    permutation("", str); 
}

private static void permutation(String prefix, String str) {
    int n = str.length();
    if (n == 0) 
	{   count++;
		System.out.println(prefix);
    }
	else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    }
}
	public static void main(String[] felight){
		System.out.println("Enter String:");
		String str=new Scanner(System.in).nextLine();
		System.out.println(" All Permutation of \""+str+"\":");
		 permutations(str);
		 System.out.println("Total Permutation  of \""+str+"\" :: "+count);
	}
}
  
