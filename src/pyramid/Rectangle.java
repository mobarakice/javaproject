package pyramid;

class Rectangle{
		
		float length;
		float width;
		private String name;
		
		void setValues(float length, float width, String name){
			this.length = length;
			this.width = width;
			this.name = name;
		}
		
	    float getArea(){
			
			return length*width;
		}
		
		float getPerimeter(){
			
			return 2*(length+width);
		}
		
		
		boolean isSquare(){
			if(length==width) return true;
			else return false;
		} 
		
		
		/* public static void main(String args[]){
				int a;
				Rectangle rect = new Rectangle();
				Rectangle rect1 = new Rectangle();
				rect.setValues(10,11,"rect");
				float area = rect.getArea();
				System.out.println("Area of rect is "+area);
				boolean isSquare = rect.isSquare();
				if(isSquare){
					System.out.println("Area of rect is square");
				}else{
					System.out.println("Area of rect is not square");
				}
		} */

}
