package assignment2.compareClass;

import assignment2.Comperer;
import assignment2.Students;

public class MeritCompare implements Comperer {


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Students s1 = (Students)o1;
		Students s2 = (Students)o2;
		return (int) (s1.getMarks()-s2.getMarks());
	}

}
