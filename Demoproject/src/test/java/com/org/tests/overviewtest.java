package com.org.tests;

import org.testng.annotations.Test;
import com.org.pages.settingspage;

public class overviewtest{
	
	@Test (priority =3)
	public void validatesettings() throws InterruptedException  {
		settingspage button = new settingspage();
		button.getBilling().click();
	}

	@Test (priority =4)
	
	public void validatechngepassword() throws InterruptedException {
		settingspage password = new settingspage();
		password.getChangeyourpassword().click();
}
	
	@Test (priority =5)
	
	public void validateoverview () throws InterruptedException {
		settingspage overview = new settingspage();
		overview.getOverview().click();
	}

@Test (priority =6)
	
	public void validatelearncoach () throws InterruptedException {
		settingspage learn = new settingspage();
		learn.getLearnbycoach().click();
	}

@Test (priority =7)

public void validateneil() throws InterruptedException {
	settingspage neil = new settingspage();
	neil.getNeilPatel().click();
}

@Test (priority =8)

public void validateprompt() throws InterruptedException {
	settingspage prompt = new settingspage();
	prompt.getNeilPatelchat().sendKeys("hi neil patel what are the best practice to learn efficientky about the seo");	
}

@Test (priority =9)
public void validatesendchat() throws InterruptedException {
	settingspage sendchat = new settingspage();
	sendchat.getSend().click();
	
}	
@Test (priority = 10)
public void validatesendone() throws InterruptedException {
	settingspage sendone = new settingspage();
	sendone.getSendone().sendKeys("What are the key benefits of seo according to the Neil patel ");

}
@Test (priority =11)
public void validatePromptone() throws InterruptedException {
	settingspage Promptone = new settingspage();
	Promptone.getPromptone().click();
	
}
}
