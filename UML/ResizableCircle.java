package UML;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double redius) {
		super(redius);
	}
		@Override
		public void resize(int percent) {
			double c=(double)(percent)/100*redius;
			redius=c;
			System.out.println("Percent "+percent);
			System.out.println("new Redius "+redius);
			System.out.println("new Area "+Math.PI*redius*redius);
			System.out.println("new Perimeter "+2*Math.PI*redius);
			
		}
}
