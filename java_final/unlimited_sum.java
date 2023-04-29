package java_final;

public class unlimited_sum {
void Sum(int ... num) {
	int sum=0;
	for(int x:num) {
		sum=sum+x;
	}
	System.out.println("Sum : "+sum);
}
}
