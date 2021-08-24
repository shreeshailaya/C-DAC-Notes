package beans;

public class Comments {
	private int cid;
	private String text;
	private int tid;
	private String uid;
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int cid, String text, int tid, String uid) {
		super();
		this.cid = cid;
		this.text = text;
		this.tid = tid;
		this.uid = uid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
