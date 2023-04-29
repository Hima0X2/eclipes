package abc;

public class Number {
	double n;
	private double number;
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public Number() {
		n=getNumber();
	}
boolean isZero() {
	if(getNumber()==0) {
		return true;
	}
	else {
		return false;
	}
}
boolean isPositive() {
	if(getNumber()>=0) {
		return true;
	}
	else {
		return false;
	}
}
boolean isNegative() {
	if(getNumber()<0) {
		return true;
	}
	else {
		return false;
	}
}
boolean isOdd() {
	if(getNumber()%2==1) {
		return true;
	}
	else {
		return false;
	}
}
boolean isEven() {
	if(getNumber()%2==0) {
		return true;
	}
	else {
		return false;
	}
}
boolean isPrime() {
	for(int i=2;i<getNumber();i++) {
		if(getNumber()%i==0) {
			return false;
		}
	}
	return true;
}
double f=1;
double getFactorial() {
	for(int i=1;i<=getNumber();i++) {
		f=f*i;
	}
	return f;
}
double getSquare() {
	return getNumber()*getNumber();
}
double getsqrt() {
	return Math.sqrt(getNumber());
}
double sum=0;
double x=n;
double sumDigit() {
	while(x%10!=0) {
		sum=sum+x%10;
		x=x/10;
	}
	return sum;
}
double a,b,c=0,p=getNumber(),d=getNumber();
boolean isAmstrong() {
	while(p%10!=0) {
		b=p%10;
		c=c+b*b*b;
		p=p/10;
	}
	if(c==d) {
		return true;
	}
	else {
		return false;
	}
}
double sum1=0,rev=getNumber();
double getReverse() {
	while(rev%10!=0) {
		sum1=sum1*10+rev%10;
		rev=rev/10;
	}
	return sum1;
}
}
