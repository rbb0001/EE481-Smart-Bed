
import java.lang.Math;

public class detectPosition {
	
	public static double[] position(double weight1, double weight2, double weight3, double weight4) {
		//This code computes an approximate x and y position for either the upper or lower section of the body
		double xWeight = 0;
		double yWeight = 0;
		double[] pos = new double[2];
		
		//Finds x and y components
		//Origin is in the middle of the sensors
		xWeight = (weight2/Math.sqrt(2) + weight4/Math.sqrt(2) - weight1/Math.sqrt(2) - weight3/Math.sqrt(2))/((50/Math.sqrt(2))*2);
		yWeight = (weight1/Math.sqrt(2) + weight2/Math.sqrt(2) - weight3/Math.sqrt(2) - weight4/Math.sqrt(2))/((50/Math.sqrt(2))*2);
	
		
		pos[0] = xWeight;
		pos[1] = yWeight;
		return pos;
	}

}
