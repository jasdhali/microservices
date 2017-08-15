package com.quake.beans;

public class Features {

    private String type;
    private Properties properties;
    private Geometry geometry;
    private String id;
    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setProperties(Properties properties) {
         this.properties = properties;
     }
     public Properties getProperties() {
         return properties;
     }

    public void setGeometry(Geometry geometry) {
         this.geometry = geometry;
     }
     public Geometry getGeometry() {
         return geometry;
     }

    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }
	@Override
	public String toString() {
		return "Features [type=" + type + ", properties=" + properties + ", geometry=" + geometry + ", id=" + id + "]\n\r";
	}
     
}