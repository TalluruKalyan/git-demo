package com.medplus.git.gitdemo;

public class App {
	public void appData(String data) {
		
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("this is get demo");
		}
		else {
			System.out.println("this is not git and another one and adding other content ");
		}
	}
  public static void main(String[] args) {
    App app = new App();
    app.appData("git");
  }
}
