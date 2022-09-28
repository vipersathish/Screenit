package com.TrueTech.ScreenIT.NewFlow.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.TrueTech.ScreenIT.NewFlow.Pages.CandidateProfilePage;
import com.TrueTech.ScreenIT.NewFlow.Pages.DashBoardPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.LoginPage;
import com.TrueTech.ScreenIT.NewFlow.Pages.SelectInterviewerPage;
import com.TrueTech.ScreenIT.NewFlow.initializer.Initializer;

public class DeclineSetavailabilityRegressionFlow extends Initializer {

	@Test()

	public void screenitDeclineTest() throws IOException, AWTException, InterruptedException {

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

		SelectInterviewerPage.selectSingleinterviewer(sendkeysprop.getProperty("SELECTINTERVIEWERPAGE_CHOOSE_SINGLEINTERVIEWER"));

		SelectInterviewerPage.interviewerDoneButton();

		CandidateProfilePage.uploadResumeButton();

		CandidateProfilePage
				.uploadCandidateResume(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_UPLOADCANDIDATERESUME"));

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

		CandidateProfilePage.candidateStatus3();

		CandidateProfilePage.selectInterviewer();

		SelectInterviewerPage.selectSingleinterviewer(sendkeysprop.getProperty("SELECTINTERVIEWERPAGE_CHOOSE_ANOTHERINTERVIEW"));

		SelectInterviewerPage.interviewerDoneButton();

		CandidateProfilePage.setAvailability();

		CandidateProfilePage.clickSelectdata();

		CandidateProfilePage.selectDate(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_ANOTHER_SELECTDATE"));

		CandidateProfilePage.selectTime(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_ANOTHER_SELECTTIME"));

		CandidateProfilePage.selectSec(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_ANOTHER_SELECTSEC"));

		CandidateProfilePage.selectSuffix(sendkeysprop.getProperty("CANDIDATEPROFILEPAGE_ANOTHER_SELECTSUFFIX"));

		CandidateProfilePage.candidatestatus2();

		CandidateProfilePage.candidateStatus3();

		CandidateProfilePage.candidateStatus4();

		CandidateProfilePage.candidateStatus5();

		CandidateProfilePage.clickStatus();

		CandidateProfilePage.viewStatus();

		CandidateProfilePage.switchwindow();

		CandidateProfilePage.clickCloseButton();

		CandidateProfilePage.selectCandidadate();

		CandidateProfilePage.candidateStatus6();

	}
}
