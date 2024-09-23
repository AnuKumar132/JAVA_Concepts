package org.lang;

public class StateDetails {
     private void southIndia() {
		// TODO Auto-generated method stub
          System.out.println("South India");
	}
     private void northIndia() {
 		// TODO Auto-generated method stub
           System.out.println("North India");
 	}
public static void main(String[] args) {
	LanguageInfo a = new LanguageInfo();
	a.tamilLanguage();
	a.englishLanguage();
	a.hindiLanguage();
	
	StateDetails b = new StateDetails();
	b.southIndia();
	b.northIndia();
}
}
