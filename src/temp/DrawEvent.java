package temp;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


public class DrawEvent extends ApplicationEvent {

	public DrawEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "Draw Method called";
	}
	
}
