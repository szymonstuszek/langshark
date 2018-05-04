package net.langshark.bean;

public class User implements UserCommons{
	//user stats need to be serialized on the server for example to 
	//have the sent messages count?
	
	//can a user be able to erase his MIB's?
	
	
	//how to handle users which do not use alphabet?
	private String firstName;
	private String lastName;
	private String email;
	private String login;
	
	//how to ensure security of the password?
	private String password;
	
	//get a list of countries and flags,
	//store the countries in an array?
	//for simplicity limit just to european countries and with alphabet?
	private enum country{
		Poland, UnitedKingdom, Germany
	};
	
	
	//separate enum class to store the languages
	//function to order them in alphabetical order
	//how to deal with german - austrian, swiss etc? -> copy from italki,
	//-> treat german as the main language, further option for austrian / swiss?
	//can user add any number of languages, can they be changed in settings
	
	
	
	//store the user's langauges in an array list?
	private String[] languages;
	private enum languages {
		polish, english, german
	}
	
	//
	public void getLanguages() {
		//return languages;
	}
	
	//
	private String nativeLanguage;
	private String learningLanguage;
	private String languageLevel;
	
	//separate enums for general badges and for country specific?
	private enum badges {
		explorer, listener
	};
	
	//have a method that runs to check if a user is premium?
	private boolean premium;
	// new users have access to premium features for a week
	//how to count the time, how to handle dates in java
	private boolean newUser;
	private boolean banned;
	
	private int accountAge;
	private int scores;
	private int warnings;
	
	private int messagesSent;
	private int messagesAssigned;
	
	//if a user does not want to receive feedback from a specific person / people
	private String[] noFeedbackFrom;
	
	public boolean canSendMIB() {
		if(banned) {
			return false;
		}
		
		if(newUser) {
			if(messagesSent >= MAX_MESSAGES_TO_SEND_NEW_USER) {
				return false;
			}
		} else if(messagesSent >= MAX_MESSAGES_TO_SEND) {
			return false;
		}
		
		
		
		return true;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNativeLanguage() {
		return nativeLanguage;
	}

	public void setNativeLanguage(String nativeLanguage) {
		this.nativeLanguage = nativeLanguage;
	}

	public String getLearningLanguage() {
		return learningLanguage;
	}

	public void setLearningLanguage(String learningLanguage) {
		this.learningLanguage = learningLanguage;
	}

	public String getLanguageLevel() {
		return languageLevel;
	}

	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public boolean isNewUser() {
		return newUser;
	}

	public void setNewUser(boolean newUser) {
		this.newUser = newUser;
	}

	public boolean isBanned() {
		return banned;
	}

	public void setBanned(boolean banned) {
		this.banned = banned;
	}

	public int getAccountAge() {
		return accountAge;
	}

	public void setAccountAge(int accountAge) {
		this.accountAge = accountAge;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}

	public int getWarnings() {
		return warnings;
	}

	public void setWarnings(int warnings) {
		this.warnings = warnings;
	}

	public int getMessagesSent() {
		return messagesSent;
	}

	public void setMessagesSent(int messagesSent) {
		this.messagesSent = messagesSent;
	}

	public int getMessagesAssigned() {
		return messagesAssigned;
	}

	public void setMessagesAssigned(int messagesAssigned) {
		this.messagesAssigned = messagesAssigned;
	}

	
	

}
