package My_AppLication_LockedMe;

public class LockedMeMain {

	public static void main(String[] args) {
		
			// Create "LockedMe_main" folder if not present in current folder structure
		
				Business_Level_Operations.create_MainFolder_IfNot_Present("LockedMe_main");
				
			// Print the welcome screen in the console
				
				MenuOptions.welcome_Screen("LockedMe", "AfzalHussain M Gadag");
				
			//
				Menu_Operation_Handling.welcome_Screen_Inputs();
		
	}

}
