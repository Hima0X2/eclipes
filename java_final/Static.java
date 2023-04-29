package java_final;
public class Static {
	static int cnt;
	static {
		cnt=0;	
	}
	int cnt1=0;
void display() {
	cnt1++;
	System.out.println(cnt1);
}
 void dis() {
	cnt++;
	System.out.println(cnt);
}
}
