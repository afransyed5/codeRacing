package com.lam.coder.topCoder;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.lam.coder.topCoder.WakingUpEasy;

public class WakingUpEasyTest {
	WakingUpEasy wake; 
	
	@Before
	public void setUp() throws Exception {
		wake = new WakingUpEasy();
	}

	@After
	public void tearDown() throws Exception {
		wake = null;
	}

	@Test
	public void countAlarmsTest() {
		Assert.assertEquals(4, wake.countAlarms(new int[] {5, 2, 4}, 13));
		Assert.assertEquals(1, wake.countAlarms(new int[] {5, 2, 4}, 3));
		Assert.assertEquals(10000, wake.countAlarms(new int[] {1}, 10000));
		Assert.assertEquals(203, wake.countAlarms(new int[] {42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37,
				  92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36,
				  95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69}, 9999));
	}
	
	@Test
	public void countAlarmsSystemTest() {
		Assert.assertEquals(4, wake.countAlarms(new int[] {5, 2, 4}, 13));
		Assert.assertEquals(1, wake.countAlarms(new int[] {5, 2, 4}, 3));
		Assert.assertEquals(10000, wake.countAlarms(new int[] {1}, 10000));
		Assert.assertEquals(203, wake.countAlarms(new int[] {42, 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82, 28, 62, 92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22, 17, 19, 96, 48, 27, 72, 39, 70, 13, 68, 100, 36, 95, 4, 12, 23, 34, 74, 65, 42, 12, 54, 69}, 9999));
		Assert.assertEquals(1, wake.countAlarms(new int[] {1}, 1));
		Assert.assertEquals(100, wake.countAlarms(new int[] {100}, 10000));
		Assert.assertEquals(10000, wake.countAlarms(new int[] {1}, 10000));
		Assert.assertEquals(1, wake.countAlarms(new int[] {100}, 1));
		Assert.assertEquals(48, wake.countAlarms(new int[] {42}, 2014));
		Assert.assertEquals(101, wake.countAlarms(new int[] {99}, 9999));
		Assert.assertEquals(909, wake.countAlarms(new int[] {11}, 9999));
		Assert.assertEquals(102, wake.countAlarms(new int[] {99}, 10000));
		Assert.assertEquals(910, wake.countAlarms(new int[] {11}, 10000));
		Assert.assertEquals(10, wake.countAlarms(new int[] {5, 2, 4, 7}, 42));
		Assert.assertEquals(187, wake.countAlarms(new int[] {54, 57, 62, 57, 14, 16, 43, 42, 16, 37, 45, 23}, 7289));
		Assert.assertEquals(70, wake.countAlarms(new int[] {45, 31, 53, 18, 38, 24, 18, 21, 36, 19, 60, 25, 61, 32, 20, 31, 70, 30, 58}, 2480));
		Assert.assertEquals(350, wake.countAlarms(new int[] {12, 9, 26, 14, 14}, 5238));
		Assert.assertEquals(386, wake.countAlarms(new int[] {22, 29, 28, 5, 11, 21, 29, 6, 10, 2, 27, 4, 10, 3, 25}, 5984));
		Assert.assertEquals(12, wake.countAlarms(new int[] {1, 24}, 146));
		Assert.assertEquals(42, wake.countAlarms(new int[] {7, 1, 52, 48, 31, 3, 31, 32, 55, 20, 52, 36, 30, 30, 21, 47, 31, 44, 5, 55, 8, 32, 52, 19, 8, 2, 48, 14, 11, 30, 31, 55, 9, 17, 37, 53, 40, 22, 53, 55, 9, 11, 4}, 1245));
		Assert.assertEquals(690, wake.countAlarms(new int[] {21, 1, 17, 20, 7, 18, 3, 8, 19, 14, 2, 21, 12, 7}, 8377));
		Assert.assertEquals(94, wake.countAlarms(new int[] {46, 45, 18, 54, 53, 4, 6, 15, 16, 1, 51, 37, 2, 1, 7, 11, 22, 45, 51, 37, 47, 35, 51, 18}, 2593));
		Assert.assertEquals(1553, wake.countAlarms(new int[] {4, 3, 4, 4, 3, 6, 5, 5, 5, 6, 6, 6, 5, 3, 5, 1, 6, 5, 6, 5, 5, 5, 5, 6, 1, 4, 6, 2, 6, 2, 6, 4, 3, 6, 4}, 7013));
		Assert.assertEquals(9, wake.countAlarms(new int[] {28, 41, 61}, 377));
		Assert.assertEquals(10000, wake.countAlarms(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10000));
		Assert.assertEquals(100, wake.countAlarms(new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100}, 10000));
		Assert.assertEquals(1, wake.countAlarms(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1));
		Assert.assertEquals(1, wake.countAlarms(new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100}, 1));
		Assert.assertEquals(396, wake.countAlarms(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}, 10000));
		Assert.assertEquals(136, wake.countAlarms(new int[] {51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100}, 10000));
		Assert.assertEquals(129, wake.countAlarms(new int[] {100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 59, 58, 57, 56, 55, 54, 53, 52, 51}, 10000));
		Assert.assertEquals(381, wake.countAlarms(new int[] {50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1}, 10000));
		Assert.assertEquals(10000, wake.countAlarms(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 10000));
		Assert.assertEquals(6495, wake.countAlarms(new int[] {2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2}, 10000));
		Assert.assertEquals(24, wake.countAlarms(new int[] {46, 52, 2, 73, 12, 45, 55, 93, 62, 66, 57, 38, 21, 88, 51, 7, 100, 45, 47, 36, 75, 90, 36, 77, 51, 89, 20, 65, 3, 67, 62, 84, 18, 7, 73, 9, 11, 45, 36, 5, 24, 37, 52, 58, 20, 2, 53, 45, 29, 31}, 1234));
		Assert.assertEquals(189, wake.countAlarms(new int[] {37, 2, 47, 11, 86, 77, 87, 49, 30, 38, 72, 86, 81, 5, 89, 2, 99, 87, 35, 16, 47, 10, 9, 45, 90, 71, 40, 87, 69, 79, 73, 69, 91, 11, 1, 43, 2, 31, 45, 42, 82, 74, 89, 51, 18, 54, 66, 77, 94}, 9876));
		Assert.assertEquals(192, wake.countAlarms(new int[] {3, 4, 4, 3, 6, 17, 23, 23, 12, 6, 18, 11, 15, 11, 7, 24, 11, 18, 23, 17, 11, 17, 12, 7}, 2424));
		Assert.assertEquals(5, wake.countAlarms(new int[] {80, 4, 28, 4, 16, 96, 72, 75, 72, 70, 77, 62, 3, 54, 23, 41, 54, 28, 44, 76, 33, 27, 98, 84, 52, 4, 14, 83, 44, 84, 14, 16, 65, 3, 48, 56, 19, 2, 37, 47, 50, 2, 59, 43, 68, 58, 98, 76, 27, 97}, 123));
		Assert.assertEquals(1, wake.countAlarms(new int[] {19, 55, 69, 65, 48, 91, 38, 13, 98, 71, 77, 5, 28, 6, 47, 33, 45, 45, 82, 93, 93, 49, 32, 68, 21, 39, 10, 24, 70, 54, 57, 72, 26, 88, 80, 82, 4, 49, 84, 89, 90, 46, 74, 72, 74, 35, 13, 69, 42, 98}, 12));
		Assert.assertEquals(8709, wake.countAlarms(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 9777));
		Assert.assertEquals(411, wake.countAlarms(new int[] {13, 13, 13, 42, 13, 13, 13, 13, 13, 13, 42, 13, 13, 42, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 42, 13, 42, 13, 13, 42, 13, 13, 13, 13, 42, 13, 13, 13, 42, 42, 13, 13, 13, 13, 13, 42, 13}, 7779));
		Assert.assertEquals(226, wake.countAlarms(new int[] {1, 1, 100, 1, 100, 100, 100, 1, 1, 100, 1, 100, 100, 100, 100, 100, 1, 1, 1, 100, 100, 100, 100, 1, 1, 1, 1, 100, 1, 1, 1, 1, 100, 100, 1, 1, 1, 100, 100, 1, 1, 1, 1, 100, 1, 1, 1}, 9912));
		Assert.assertEquals(91, wake.countAlarms(new int[] {98, 98, 99, 98, 99, 98, 99, 98, 99, 99, 99, 98, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 98, 98, 99, 99, 99, 99, 99, 99, 99, 98, 99, 98, 99, 99, 98, 99, 99, 99, 98, 99, 99}, 8888));
		Assert.assertEquals(22, wake.countAlarms(new int[] {33, 23, 33, 23, 33, 23, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 23, 33, 33, 33, 33, 33, 33, 33, 33, 33, 33, 23, 23, 33, 33, 33, 33, 33, 23, 23, 33, 33, 33, 33, 33, 33, 33, 33}, 666));
		Assert.assertEquals(3765, wake.countAlarms(new int[] {3, 2, 2, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 2, 3, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 2, 3, 2, 2}, 8901));
		Assert.assertEquals(5517, wake.countAlarms(new int[] {3, 1, 1, 1, 1, 3, 3, 1, 1, 3, 1, 3, 1, 3, 1, 1, 1, 3, 1, 3, 1, 3, 1, 1, 1, 3, 1, 1, 3, 1, 1, 1, 3, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1}, 9111));
		Assert.assertEquals(10000, wake.countAlarms(new int[] {1}, 10000));
		Assert.assertEquals(1, wake.countAlarms(new int[] {10}, 2));
		Assert.assertEquals(1, wake.countAlarms(new int[] {1, 2}, 1));
		Assert.assertEquals(4, wake.countAlarms(new int[] {5, 2, 4}, 13));
		Assert.assertEquals(2, wake.countAlarms(new int[] {1, 1, 10}, 2));
		Assert.assertEquals(1, wake.countAlarms(new int[] {1}, 1));
		Assert.assertEquals(2, wake.countAlarms(new int[] {1, 3}, 2));
		Assert.assertEquals(3, wake.countAlarms(new int[] {2}, 5));
		Assert.assertEquals(2, wake.countAlarms(new int[] {4, 3, 2}, 7));
		Assert.assertEquals(100, wake.countAlarms(new int[] {1, 2}, 150));
		Assert.assertEquals(5000, wake.countAlarms(new int[] {2}, 9999));
		Assert.assertEquals(1, wake.countAlarms(new int[] {2, 1}, 2));
		Assert.assertEquals(11, wake.countAlarms(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 11));
		Assert.assertEquals(4, wake.countAlarms(new int[] {5, 2, 4}, 16));
		Assert.assertEquals(1, wake.countAlarms(new int[] {5, 2, 4}, 3));
		Assert.assertEquals(57, wake.countAlarms(new int[] {1, 5, 2}, 152));
		Assert.assertEquals(3, wake.countAlarms(new int[] {5, 3, 20}, 10));
		Assert.assertEquals(3, wake.countAlarms(new int[] {3}, 8));
		Assert.assertEquals(2, wake.countAlarms(new int[] {1, 100}, 10));
		Assert.assertEquals(2, wake.countAlarms(new int[] {1, 1}, 2));
	}
}
