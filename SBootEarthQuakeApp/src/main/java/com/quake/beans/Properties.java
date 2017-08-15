/* Copyright 2017 freecodeformat.com */
package com.quake.beans;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Properties {

    private double mag;
    private String place;
    private long time;
    private long updated;
    private long tz;
    private String url;
    private String detail;
    private String felt;
    private String cdi;
    private String mmi;
    private String alert;
    private String status;
    private long tsunami;
    private long sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private long nst;
    private double dmin;
    private double rms;
    private float gap;
    @JsonProperty("magType")
    private String magtype;
    private String type;
    private String title;
    public void setMag(double mag) {
         this.mag = mag;
     }
     public double getMag() {
         return mag;
     }

    public void setPlace(String place) {
         this.place = place;
     }
     public String getPlace() {
         return place;
     }

    public void setTime(long time) {
         this.time = time;
     }
     public long getTime() {
         return time;
     }

    public void setUpdated(long updated) {
         this.updated = updated;
     }
     @Override
	public String toString() {
		return "Properties [mag=" + mag + ", place=" + place + ", time=" + time + ", updated=" + updated + ", tz=" + tz
				+ ", url=" + url + ", detail=" + detail + ", felt=" + felt + ", cdi=" + cdi + ", mmi=" + mmi
				+ ", alert=" + alert + ", status=" + status + ", tsunami=" + tsunami + ", sig=" + sig + ", net=" + net
				+ ", code=" + code + ", ids=" + ids + ", sources=" + sources + ", types=" + types + ", nst=" + nst
				+ ", dmin=" + dmin + ", rms=" + rms + ", gap=" + gap + ", magtype=" + magtype + ", type=" + type
				+ ", title=" + title + "]";
	}
	public long getUpdated() {
         return updated;
     }

    public void setTz(long tz) {
         this.tz = tz;
     }
     public long getTz() {
         return tz;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

    public void setDetail(String detail) {
         this.detail = detail;
     }
     public String getDetail() {
         return detail;
     }

    public void setFelt(String felt) {
         this.felt = felt;
     }
     public String getFelt() {
         return felt;
     }

    public void setCdi(String cdi) {
         this.cdi = cdi;
     }
     public String getCdi() {
         return cdi;
     }

    public void setMmi(String mmi) {
         this.mmi = mmi;
     }
     public String getMmi() {
         return mmi;
     }

    public void setAlert(String alert) {
         this.alert = alert;
     }
     public String getAlert() {
         return alert;
     }

    public void setStatus(String status) {
         this.status = status;
     }
     public String getStatus() {
         return status;
     }

    public void setTsunami(long tsunami) {
         this.tsunami = tsunami;
     }
     public long getTsunami() {
         return tsunami;
     }

    public void setSig(long sig) {
         this.sig = sig;
     }
     public long getSig() {
         return sig;
     }

    public void setNet(String net) {
         this.net = net;
     }
     public String getNet() {
         return net;
     }

    public void setCode(String code) {
         this.code = code;
     }
     public String getCode() {
         return code;
     }

    public void setIds(String ids) {
         this.ids = ids;
     }
     public String getIds() {
         return ids;
     }

    public void setSources(String sources) {
         this.sources = sources;
     }
     public String getSources() {
         return sources;
     }

    public void setTypes(String types) {
         this.types = types;
     }
     public String getTypes() {
         return types;
     }

    public void setNst(long nst) {
         this.nst = nst;
     }
     public long getNst() {
         return nst;
     }

    public void setDmin(double dmin) {
         this.dmin = dmin;
     }
     public double getDmin() {
         return dmin;
     }

    public void setRms(double rms) {
         this.rms = rms;
     }
     public double getRms() {
         return rms;
     }

    public void setGap(float gap) {
         this.gap = gap;
     }
     public float getGap() {
         return gap;
     }

    public void setMagtype(String magtype) {
         this.magtype = magtype;
     }
     public String getMagtype() {
         return magtype;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

}