package com.quake.beans;
import java.util.List;
/**
 * 
 * @author jaspal
 *
 */
public class EarthDataRoot {

    private String type;
    private Metadata metadata;
	private List<Features> features;
    private List<Double> bbox;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setMetadata(Metadata metadata) {
         this.metadata = metadata;
     }
     public Metadata getMetadata() {
         return metadata;
     }

    public void setFeatures(List<Features> features) {
         this.features = features;
     }
     public List<Features> getFeatures() {
         return features;
     }

    public void setBbox(List<Double> bbox) {
         this.bbox = bbox;
     }
     public List<Double> getBbox() {
         return bbox;
     }
     @Override
 	public String toString() {
 		return "EarthDataRoot [type=" + type + ", metadata=" + metadata + ", features=" + features + ", bbox=" + bbox
 				+ "]";
 	}
}