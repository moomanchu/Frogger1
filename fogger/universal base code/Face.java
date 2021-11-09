import pkg.*;
public class Face{
	private Ellipse e;
	private Color c;
	private Rectangle boundbox;
	public Face(double x, double y,double a, double b){
		e = new Ellipse(x,y,a,b);
		c = new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255));
		e.setColor(c);
		
		boundbox = new Rectangle(x,y,a,b);
		
	}
	// public Face(double x, double y, c){
		// this(x,y);
		// e.setColor(c);
	// }
	public void translate(int x, int y){
		e.translate(x,y);
		boundbox.translate(x,y);
	}

	public int getFX(){
		return boundbox.getX();
	}
	public int getFY(){
		return boundbox.getY();
	}
	public int getFWidth(){
		return boundbox.getWidth();
	}
	public int getFHeight(){
		return boundbox.getHeight();
	}
	
	public void draw(){
		e.fill();
		boundbox.draw();
	}
}