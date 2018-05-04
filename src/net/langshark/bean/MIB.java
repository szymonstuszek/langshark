package net.langshark.bean;

public class MIB {
	//second part that contains the inside of the bottle
	
	//one string created out of details such as:
	//username, language, id - created at random and unique
	//id - how to ensure it's unique - UUID?
	//label used to store on the server and to indentify the MIB
	//label is added after finish
	private String label;
	private String userLogin;
	
	//do not allow that it is longer than 2 min
	private int audioLength;
	
	//do not allow bigger size than 4 MB?
	private double audioSize;
	
	//create as a separate class
	private String language;
	private enum language{ 
		english, german, polish
	};
	//from which country it has been sent from
	private enum country {
		UnitedKingdom, Poland, Germany
	};
	
	//
	private boolean active, visible, assigned, evaluated, spontaneous;
	private int age;
	private int dateOfCreation;
	
	
	
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getUserLogin() {
		return userLogin;
	}
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	public int getAudioLength() {
		return audioLength;
	}
	public void setAudioLength(int audioLength) {
		this.audioLength = audioLength;
	}
	public double getAudioSize() {
		return audioSize;
	}
	public void setAudioSize(double audioSize) {
		this.audioSize = audioSize;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public boolean isAssigned() {
		return assigned;
	}
	public void setAssigned(boolean assigned) {
		this.assigned = assigned;
	}
	public boolean isEvaluated() {
		return evaluated;
	}
	public void setEvaluated(boolean evaluated) {
		this.evaluated = evaluated;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(int dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	
	
	
	

}
