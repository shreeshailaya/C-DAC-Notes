package beans;

public class Topic {
	int tid;   
	String tname;
	String tdesc;
	String uid;
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topic(int tid, String tname, String tdesc, String uid) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tdesc = tdesc;
		this.uid = uid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
	
}
