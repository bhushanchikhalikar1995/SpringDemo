package temp;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Component
@Service
//@Repository
//@Controller
public class circle implements shape,ApplicationEventPublisherAware{

	Point pointA;
	ApplicationEventPublisher publisher;
	
	public Point getPointA() {
		return pointA;
	}
	//@Required
	//@Autowired
	@Resource(name="pointC")
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw()
	{
		System.out.println("Center is:"+pointA.getX()+" , "+pointA.getY());
		DrawEvent draw=new DrawEvent(this);
	
		publisher.publishEvent(draw);
	}
	
	@PostConstruct
	public void initiliazeCircle() {
		System.out.println("Init");
	}
	
	@PreDestroy
	private void destroyCircle() {
		System.out.println("Destroy");
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		// TODO Auto-generated method stub
		this.publisher=arg0;
		
	}
}
