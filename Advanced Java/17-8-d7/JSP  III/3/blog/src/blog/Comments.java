package blog;

public class Comments 
{
	private int cid,topicid;
	private String text,uid;
	public Comments(int cid,String text,int topicid, String uid)
	{
		super();
		this.cid = cid;
		this.topicid = topicid;
		this.text = text;
		this.uid = uid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getTopicid() {
		return topicid;
	}
	public void setTopicid(int topicid) {
		this.topicid = topicid;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
}
