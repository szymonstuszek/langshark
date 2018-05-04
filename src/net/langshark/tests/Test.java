package net.langshark.tests;

import net.langshark.bean.User;

public class Test {
	// check if user can create a MIB after sending the max number
	public void test1() {
		User user1 = new User();

		user1.setMessagesSent(2);
		user1.setBanned(true);

		System.out.println("Can user send the message? " + user1.canSendMIB());
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.test1();
	}

}
