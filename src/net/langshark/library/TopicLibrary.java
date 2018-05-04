package net.langshark.library;

public class TopicLibrary {
	//make the class abstract and separate it into 3 categories
	//standard, random, custom
	
	//category that has been done already - displays as green
	//
	
	
	//custom type has the active boolean flag:
	//available only to premium users and rank 10 users
	public enum topicType {
		standard, random, custom
	}
	
	public enum topicLevel {
		begginer, intermediate, advanced
	}
	
	//store an array with all the subjects
	private String subject;
	

}
