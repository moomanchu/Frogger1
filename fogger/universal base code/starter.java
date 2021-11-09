import pkg.*;
import java.util.ArrayList;
import java.util.Random;

public class starter implements InputControl, InputKeyControl {

	public static Face f;
	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Car[] ac = new Car[30];
		f = new Face(600,700,30,30);
		f.draw();
		boolean b = true;
		for(int n=0;n<ac.length;n++){
			Color col = new Color(Canvas.rand(255),Canvas.rand(255),Canvas.rand(255));
			ac[n] = new Car(1,1,"AC/DC",col);
			ac[n].draw();
		}
		while(b == true){
			for(Car c: ac){
				c.Drive(5,0);
				if(c.Contains(f)){
					b = false;
					
				}
			}
		}
		System.out.println(b);
		
		
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here
		if(s.equals("a")){
			f.translate(-5,0);
		}
		if(s.equals("w")){
			f.translate(0,-5);
		}
		if(s.equals("s")){
			f.translate(0,5);
		}
		if(s.equals("d")){
			f.translate(5,0);
		}

	}
}
