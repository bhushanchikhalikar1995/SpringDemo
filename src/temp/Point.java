package temp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Point {

	private int x;
	private int y;
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	@Autowired
	public void setY(int y) {
		this.y = y;
	}
	
	
}
