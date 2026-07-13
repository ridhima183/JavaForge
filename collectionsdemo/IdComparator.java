package collectionsdemo;

import arraysdemo.Developer;

/**
 *Author : Bhavna
 *Date : 10-Jul-2026
 *Time :4:47:53 pm
 *email :ridhima.gadalay@gmail.com
 */
public class IdComparator implements Comparator<Developer>{

	public int compare(Developer d1, Developer d2) {

		if(d1.id==d2.id)
			return 0;
		else if (d1.id>d2.id)
			return 1;
		else
			return -1;

	}

}


