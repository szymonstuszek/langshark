package net.langshark.app;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import net.langshark.bean.MIB;
import net.langshark.bean.User;
import net.langshark.bean.UserCommons;



//steps:
//enter menu to send MIB - after each step next step shows automatically
//or should there be a next / previous button
//
//press the button to create MIB
//check if user can send a MIB
//if yes - language flags appear
//select the flag
//library - choose standard, random or custom - only available after reaching rank 10

public class CreatingMIBLogic implements UserCommons{

	
	public static void main(String[] args) {
		CreatingMIBLogic logic = new CreatingMIBLogic();
		User user = new User();
		MIB mib = new MIB();
		user.setBanned(false);
		user.setNewUser(false);
		user.setMessagesSent(3);
		logic.createMIB(user, mib);
		
	}
	
	
	
	//method called by a button or by a tap on the screen
	private void createMIB(User user, MIB mib) {
		//first check if user can send a MIB:
		//if user is not banned or has already sent more messages than allowed
		
		
		if(user.canSendMIB()) {
			
			//create an empty constructor or the object is passed
			
			
			//step 1
			//check what languages the user speaks
			//returns an array of Strings or enums that need to be transformed to Strings
			//gets the languages as a dropdown list
			//on the mobile app - empty bottle with a flag
			user.getLanguages();
			
			//wait for the selection
			//after click / tap:
			//the flag get attached to the bottle
			selectLanguage(mib);
			
			
			//go automatically or press button to continue?
			//Library step
			//go to the related Library - chosen on language
			//3 options to choose from standard, random(need to change the name, custom);
			
			
			//press standard
			//choose level
			//show categories
			//choose subject
			
			//press random
			//choose level
			//show categories
			//choose subject
			
			//press custom - future option
			
			
			//display the message
			//show keywords and/or an idiom
			//show picture - future option
			//start timer
			//user has option to prepare - cancels timer, MIB spontaneous = false - less points
			//after clicking ready or when timer runs out proceed to recording
			
			
			//recording: 3 second countdown - start speaking
			//counting down from 2 minutes
			//can repeat the recording
			//if repeats -  spontaneous = false
			
			//select done
			//paper appears in MIB
			//MIB gets corked
			//add labels
			
			//swipe to throw - upload to server
			//progress bar of the uploading - animation of a bottle floating when it's done, it moves out of the screen
			
			//file creation ended it goes to the server and gets stored there
			
			
		
			System.out.println("MIB created successfully!");
		// when user cannot send a message show him a popup and say why	
		} else {
		//if or else if blocks?
			System.out.println("Creating MIB failed:");
			
			if(user.isBanned()) {
				//popup with banned user
				System.out.println("You are banned and cannot send messages");
				System.out.println("Reach out to the administrator");
			}
			
			if(user.isNewUser()) {
				//new users can only send 1 message until they reach a certain rank or being a premium user?
				//to avoid users that login in to the website only to make pranks
				if(user.getMessagesSent() >= MAX_MESSAGES_TO_SEND_NEW_USER) {
					System.out.println("Max number of sent messages reached:" + MAX_MESSAGES_TO_SEND_NEW_USER);
					System.out.println("Wait till your message gets evaluated / or cancel your old message");
					System.out.println("After reaching rank 10 - you can send 3 MIB's per day");
				}
			} else {
				//regular users can send 3 messages a day
				if(user.getMessagesSent() >= MAX_MESSAGES_TO_SEND_NEW_USER) {
					System.out.println("Max number of sent messages reached:" + MAX_MESSAGES_TO_SEND);
					System.out.println("Wait till your messages get evaluated / or cancel your old messages");
				}
			}
			
		}
		
		
	}


	private void selectLanguage(MIB mib) {
		String testLanguage = "testLanguage";
		//makes the flag appear on the bottle
		mib.setLanguage(testLanguage);
	}


	
}
