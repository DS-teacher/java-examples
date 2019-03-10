package com.example05.controlflow;

public class ControllFlowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----if else-----");
		getIfThenElse();
		System.out.println("----switch-----");
		getSwitch();
		System.out.println("----switch String-----");
		getSwitchString();
		System.out.println("----while-----");
		getWhile();
		System.out.println("-----for------");
		getFor();
		System.out.println("-----foreach------");
		getForEach();
		System.out.println("-----break------");
		getBreak();
		System.out.println("-----continue------");
		getContinue();
		System.out.println("-----break label------");
		getBreakWithLabel();
		System.out.println("-----return------");
		getReturn();
		System.out.println("-----return a value------");
		System.out.println(getReturn("BO"));
	}

	/**
	 * 基本if else语句
	 */
	private static void getIfThenElse() {
		boolean isMoving = true;
		int gear = 5;
		int speed = 60;
		if (isMoving) {
			System.out.println("Moving");
			if (gear >= 5 && speed >= 60) {
				System.out.println("Speeding");
			} else {
				System.out.println("Normal");
			}
		} else {
			System.out.println("Stopped");
		}

		int testscore = 76;
		char grade;
		if (testscore >= 90) {
			grade = 'A';
		} else if (testscore >= 80) {
			grade = 'B';
		} else if (testscore >= 70) {
			grade = 'C';
		} else if (testscore >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("Grade = " + grade);
	}

	/**
	 * switch语句
	 */
	private static void getSwitch() {
		int season = 1;
		switch (season) {
		case 1:
			System.out.println("Spring");
			break;
		case 2:
			System.out.println("Summer");
			break;
		case 3:
			System.out.println("Autumn");
			break;
		case 4:
			System.out.println("Winter");
			break;
		// 当均不匹配时，执行default中代码
		default:
			System.out.println("Invalid season");
			break;
		}
	}

	/**
	 * 支持字符串的switch
	 */
	private static void getSwitchString() {
		String season = "Spring";
		switch (season) {
		case "Spring":
			System.out.println("花儿开啦！");
		case "Autumn":
			System.out.println("我喜欢" + season + "凉爽的天气！");
			break;
		case "Summer":
			System.out.println("虽然可以游泳！但是");
		case "Winter":
			System.out.println("我不喜欢" + season + "极端的天气！");
			break;
		// 当均不匹配时，执行default中代码
		default:
			System.out.println("Invalid season");
			break;
		}
	}
	private static void getWhile() {
		int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }
       /*
        * 代码从上至下执行，而条件判断在下部
        * 因此do代码块必然执行一次
        */
        do {
        	System.out.println("Count is: " + count);
            count++;
		} while (count <= 5);
	}
	
	/**
	 * for循环
	 */
	private static void getFor() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Count is: " + i);
		}
		int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
			System.out.println("number: " + numbers[i]);
		}
	}
	/**
	 * foreach循环
	 */
	private static void getForEach() {
		int[] numbers = {1,2,3,4,5};
		for (int i : numbers) {
			System.out.println("number: " + i);
		}
	}
	
	/**
	 * break
	 */
	private static void getBreak() {
		int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
			System.out.println("number: " + numbers[i]);
			if (numbers[i] == 3) {
				break;
			}
		}
        
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,3,5};
        for (int i = 0; i < nums1.length; i++) {
        	// break结束内层循环
			for (int j = 0; j < nums2.length; j++) {
				// 如果相同
				if (nums1[i] == nums2[j]) {
					System.out.println("2数组中相同的值：" + nums1[i]);
					break;
				}
			}
		}
	}
	
	private static void getContinue() {
		int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 3) {
				continue;
			}
			System.out.println("剩余的number: " + numbers[i]);
		}
	}
	
	private static void getBreakWithLabel() {
		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = { 6, 3, 5 };
		first: for (int i = 0; i < nums1.length; i++) {
			// break结束内层循环
			second: for (int j = 0; j < nums2.length; j++) {
				// 如果相同
				if (nums1[i] == nums2[j]) {
					System.out.println("2数组中相同的值：" + nums1[i]);
					break first;
				}
			}
		}
	}
	
	private static void getReturn() {
		int[] numbers = {1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 3) {
				System.out.println("number: " + numbers[i]);
				return;
			}
		}
		System.out.println("end");
	}
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	private static String getReturn(String name) {
		return "Hello " + name;
	}
}
