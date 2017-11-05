package java8solutions;

import java.util.ArrayList;
import java.util.List;

/* Definition for an interval.*/
public class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
	public static void main (String [] argv){
		///(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)]
		Interval i1 = new Interval (0,1);
		Interval i2 = new Interval (3,5);
		Interval i3 = new Interval (4,8);
		Interval i4 = new Interval (9,12);
		Interval i5 = new Interval (9,10);
		List <Interval> al = new ArrayList <Interval>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		al.add(i4);
		al.add(i5);
		MergeSolution ms = new MergeSolution();
		List <Interval> l = ms.merge(al);
		
	}
}
