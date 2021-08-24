package beans;

public class Topic {
	private int tid;
	private String name,desc,uid;
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Topic(int tid, String name, String desc, String uid) {
		super();
		this.tid = tid;
		this.name = name;
		this.desc = desc;
		this.uid = uid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	
}
