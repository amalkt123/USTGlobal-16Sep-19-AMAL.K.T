package com.ustglobal.studentapp.qspiders;

import com.ustglobal.studentapp.jspiders.Angular;
import com.ustglobal.studentapp.jspiders.*;

public class TestA {
	public static void main(String[] args) {
		QTP q=new QTP();
		q.teachQtp();
		Selenium s=new Selenium();
		s.teachSelenium();
		//com.ustglobal.studentapp.jspiders.Angular a= new com.ustglobal.studentapp.jspiders.Angular();
		Angular a1=new Angular();
		a1.teachAngular();
		React r=new React();
		r.teachReact();
	}

}
