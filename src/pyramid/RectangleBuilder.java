package pyramid;

public class RectangleBuilder {
	
	public static void main(String args[]){
		ExpandableRectangle rect = new ExpandableRectangle();
		rect.setValues(10, 25, "adf");
		float area = rect.getArea();
		System.out.println("Area of rect is "+area);
		rect.enlarge(3);
		System.out.println("Area of rect is "+rect.getArea());
		
		System.out.println("Perimeter of rect is "+rect.getPerimeter());
		boolean isSquare = rect.isSquare();
		if(isSquare){
			System.out.println("Area of rect is square");
		}else{
			System.out.println("Area of rect is not square");
		}
	}
}
