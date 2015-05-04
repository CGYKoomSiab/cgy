package cgy.tutorial.action;

import cgy.tutorial.services.TutorialServices;

public class TutorialAction {

	private String bestTutorialSite;
	private String language;
	
	
	public String execute(){
		TutorialServices tutorialService = new TutorialServices();
		setBestTutorialSite(tutorialService.getBestTutorialSite(getLanguage()));
		System.out.println(getLanguage());
		System.out.println(getBestTutorialSite());
		return "success";
	}

	public String getBestTutorialSite() {
		return bestTutorialSite;
	}

	public void setBestTutorialSite(String bestTutorialSite) {
		this.bestTutorialSite = bestTutorialSite;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
