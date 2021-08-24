package entities;

public class Question 
{
	int qid;
	String qtext,opt1,opt2,opt3,op4;
	char ans;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String qtext, String opt1, String opt2, String opt3, String op4, char ans) {
		super();
		this.qid = qid;
		this.qtext = qtext;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.op4 = op4;
		this.ans = ans;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQtext() {
		return qtext;
	}
	public void setQtext(String qtext) {
		this.qtext = qtext;
	}
	public String getOpt1() {
		return opt1;
	}
	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}
	public String getOpt2() {
		return opt2;
	}
	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}
	public String getOpt3() {
		return opt3;
	}
	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}
	public String getOp4() {
		return op4;
	}
	public void setOp4(String op4) {
		this.op4 = op4;
	}
	public char getAns() {
		return ans;
	}
	public void setAns(char ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qtext=" + qtext + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
				+ ", op4=" + op4 + ", ans=" + ans + "]";
	}
	
	
	
	
}
