/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	String mystring="My First-Assignment of Java Programming";
	int length=mystring.length();
	int count=0;
	for(int i=0;i<length;i++){
	    if(mystring.charAt(i)!=' '){
	        count++;
	    }
	}
	System.out.println("Total words = "+count);
	}
}