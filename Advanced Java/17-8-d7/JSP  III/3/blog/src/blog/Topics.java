package blog;

public class Topics 
{
	private int topicid;
	private String name,desc,uid;
	public Topics(int tpoicid, String name, String desc, String uid) 
	{
		super();
		this.topicid = tpoicid;
		this.name = name;
		this.desc = desc;
		this.uid = uid;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int tpoicid) {
		this.topicid = tpoicid;
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
