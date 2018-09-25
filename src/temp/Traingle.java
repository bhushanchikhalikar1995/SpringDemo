package temp;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


public class Traingle  implements ApplicationContextAware,BeanNameAware,shape{

	Point pointA;
	Point pointB;
	Point pointC;
	
	ApplicationContext context =null;
	
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	
	
	
	
	//private String type;
	
/*	public Traingle(String type)
	{
		this.type=type;
	}
	
	
	public String getType() {
		return type;
	}
*/

/*	public void setType(String type) {
		this.type = type;
	}
*/

/*	public void draw()
	{
		System.out.println(getType()+" Traingle Drawn.");
	}
*/	
	public void draw()
	{
		System.out.println("For Point A:"+getPointA().getX()+" , "+getPointA().getY());
		System.out.println("For Point B:"+getPointB().getX()+" , "+getPointB().getY());
		System.out.println("For Point C:"+getPointC().getX()+" , "+getPointC().getY());
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		
		this.context=arg0;
		
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("++"+arg0);
	}
;	
}
