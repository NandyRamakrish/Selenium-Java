package org.stepdefinition;

import org.tes.BaseClasss;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Fbapp extends BaseClasss{
@Before
private void precondition() {
	launchBrowser();
	windowMaximize();
}
@After
private void postcondition() {
	closeEntireBrowser();

}
}
