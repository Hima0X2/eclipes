package practice;

public class ResizableCircle extends Circle implements Resizable{
 public ResizableCircle(double radius) {
	super(radius);
}

@Override
public void resize(int percent) {
	this.radius=radius+(percent)/100;
	System.out.println("Percent "+this.radius);
	System.out.println("new Area "+2*Math.PI*this.radius);
	System.out.println("new Perimeter "+Math.PI*this.radius*this.radius);	
}
 
}
