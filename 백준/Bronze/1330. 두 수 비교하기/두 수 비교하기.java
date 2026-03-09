import java.util.*;

public class Main {
public static void main(String[] args) {		
        Scanner sca = new Scanner(System.in);
		int A = sca.nextInt();
		int B = sca.nextInt();
		if(A>B) System.out.println(">");
		else if(A<B) System.out.println("<");
		else System.out.println("==");
	}
}