package com.quake.beans;
import java.util.Date;
/**
*/
public class Metadata {

    private long generated;
    private String url;
    private String title;
    private int status;
    private String api;
    private int count;
    public void setGenerated(long generated) {
         this.generated = generated;
     }
     public long getGenerated() {
         return generated;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setApi(String api) {
         this.api = api;
     }
     public String getApi() {
         return api;
     }

    public void setCount(int count) {
         this.count = count;
     }
     public int getCount() {
         return count;
     }
	@Override
	public String toString() {
		return "Metadata [generated=" + generated + ", url=" + url + ", title=" + title + ", status=" + status
				+ ", api=" + api + ", count=" + count + "]";
	}

}