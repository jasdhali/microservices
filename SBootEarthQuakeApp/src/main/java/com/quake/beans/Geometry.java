package com.quake.beans;
import java.util.List;
/**
 * 
 * @author jaspal
 *
 */
public class Geometry {

    private String type;
    private List<Double> coordinates;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setCoordinates(List<Double> coordinates) {
         this.coordinates = coordinates;
     }
     public List<Double> getCoordinates() {
         return coordinates;
     }
	@Override
	public String toString() {
		return "Geometry [type=" + type + ", coordinates=" + coordinates + "]";
	}
     
}