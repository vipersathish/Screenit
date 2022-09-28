package com.TrueTech.ScreenIT.NewFlow.testCases;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.TrueTech.ScreenIT.NewFlow.Pages.CandidateProfilePage;
import com.TrueTech.ScreenIT.NewFlow.Pages.DashBoardPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.EmailPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.LoginPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.SelectInterviewerPage;
import com.TrueTech.ScreenIT.NewFlow.initializer.Initializer;


public class SelectedRegressionFlow extends Initializer{
	

	@Test( priority=1 ,  description = "screenit selected flow")           
	
	public void loginpage() throws IOException, AWTException, InterruptedException{
		
		
		initialize();
		
		driver.get(envprop.getProperty("LOGINURL"));
	
		LoginPage.enterEmail(sendkeysprop.getProperty("LOGINPAGE_ENTER_EMAIL"));
		
		LoginPage.enterPassword(sendkeysprop.getProperty("LOGINPAGE_ENTER_PASSWORD"));
		
		LoginPage.clickSigninButton();
		
		
		DashBoardPage.uploadIdButton();
		
		DashBoardPage.uploadJDFile(sendkeysprop.getProperty("DASHBOARDPAGE_UPLOADJDFILE"));

		DashBoardPage.submitButton();	
		
		DashBoardPage.verifyLabelText();
		
		DashBoardPage.selectyear(sendkeysprop.getProperty("DASHBOARDPAGE_SELECT_YEARS"));
		
		DashBoardPage.selectmonth(sendkeysprop.getProperty("DASHBOARDPAGE_SELECT_MONTHS"));
		
		DashBoardPage.choosePrimarySkill(sendkeysprop.getProperty("DASHBOARDPAGE_SELECT_PRIMARYSKILLS"));
		
		DashBoardPage.chooseSecondarySkill(sendkeysprop.getProperty("DASHBOARDPAGE_SELECT_SECONDARYSKILLS"));
		
		DashBoardPage.jobDescription(sendkeysprop.getProperty("DASHBOARDPAGE_TYPE_JOBDESCRIPTION"));
		
		DashBoardPage.remark(sendkeysprop.getProperty("DASHBOARDPAGE_TYPE_REMARK"));
		
		DashBoardPage.clickPost();
		
		DashBoardPage.profilecards();
		
		CandidateProfilePage.selectInterviewer();
		
	//	SelectInterviewerPage.selectAllinterviewer();
		
		SelectInterviewerPage.selectSingleinterviewer(sendkeysprop.getProperty("SELECTINTERVIEWERPAGE_CHOOSE_SINGLEINTERVIEWER"));
		
	//	SelectInterviewerPage.selectMultiinterviewers(0, 2, 4);
		
	//	SelectInterviewerPage.scrollup();
		
		
		
		SelectInterviewerPage.interviewerDoneButton();
		
		CandidateProfilePage.uploadResumeButton();
		
		CandidateProfilePage.uploadCandidateResume(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_UPLOADCANDIDATERESUME"));
		
		CandidateProfilePage.candidateSubmit();
		
		CandidateProfilePage.candidateStatus1();
		
		CandidateProfilePage.setAvailability();
		
		CandidateProfilePage.clickSelectdata();
		
		CandidateProfilePage.selectDate(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_SELECTDATE"));
		
		CandidateProfilePage.selectTime(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_SELECTTIME"));
		
		CandidateProfilePage.selectSec(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_SELECTSEC"));
		
		CandidateProfilePage.selectSuffix(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_SELECTSUFFIX"));
		
		
		CandidateProfilePage.candidatestatus2();
		
		CandidateProfilePage.candidateDetails();
		
		CandidateProfilePage.clickCandidateInformation();
		
		CandidateProfilePage.editCandidateInfo(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_EDITINFO"));
		
		CandidateProfilePage.editcandidateinfoendname(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_EDITENDINFO"));
		
		
		EmailPage.OpenNewTab();
		
		driver.get(envprop.getProperty("EmailURL"));
		
		EmailPage.enterEmail(sendkeysprop.getProperty("EMAILPAGE_TYPE_EMAIL"));
		
		EmailPage.enterNextButton();
		
		EmailPage.enterPassword(sendkeysprop.getProperty("EMAILPAGE_TYPE_PASSWORD"));
		
		EmailPage.clickSignin();
		
		EmailPage.clickSignin();
		
		EmailPage.enterSendItems();
		
		EmailPage.clickScheduleRequest();
		
		EmailPage.clickLink();
		
		EmailPage.clickAcceptorDecline(sendkeysprop.getProperty("EMAILPAGE_CLICK_ACCEPTORDECLINE"));
		
		EmailPage.retrunBackOriginalWindow();
		
		CandidateProfilePage.candidateStatus3();
		
		EmailPage.BackToMail();
		
		EmailPage.clickInterviewSchedule();
		
		EmailPage.clickInterviewLink();
		
		EmailPage.retrunToMeeting();
		
		EmailPage.enterName(sendkeysprop.getProperty("EMAILPAGE_TYPE_NAME"));
		
		EmailPage.enterMeetingId();
		
		CandidateProfilePage.candidateStatus4();
		
		CandidateProfilePage.candidateStatus5();
		
		CandidateProfilePage.clickStatus();
		
		CandidateProfilePage.viewStatus();
		
		CandidateProfilePage.switchwindow();
		
		CandidateProfilePage.clickCloseButton();
		
		CandidateProfilePage.selectCandidadate();
		
		CandidateProfilePage.candidateStatus6();
		
		DashBoardPage.clickHome();
		
		DashBoardPage.clickProfile();
		
		DashBoardPage.clickHome();
		
		DashBoardPage.clickSchedule();
		
		DashBoardPage.clickHome();
		
		DashBoardPage.clickSit();
		
		DashBoardPage.clickHome();
		
		DashBoardPage.clickSelected();
		

					
	}

	@AfterSuite()
	
	public void teardown() throws IOException{
		
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileHandler.copy(src, new File("C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenITFlow.DDD\\Screenshot.png"));
		
	}
		
	
	
}
				
					