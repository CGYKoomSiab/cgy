package cgy.tutorial.services;

public class TutorialServices {
	
	public String getBestTutorialSite(String language){
		if(language.equals("java")){
			return "Java CGY tee hee";
		} else {
			return "Language not supported yet";
		}
	}
}
