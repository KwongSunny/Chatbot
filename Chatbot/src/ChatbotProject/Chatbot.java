package ChatbotProject;

public class Chatbot {

	private String userName;
	private Topic sunny;
	private boolean chatting;
	
	public Chatbot()
	{
		sunny = new ChatbotSunny();
		userName = "unknown user";
		chatting = true;
	}
	
	public void startTalking() 
	{
		ChatbotMain.print("Welcome to our chatbot! What is your name?");
		userName = ChatbotMain.getInput();
		chatting = true;
		while(chatting)
		{
			ChatbotMain.print("What do you want to talk about?");
			String response = ChatbotMain.getInput();
			if(sunny.isTriggered(response))
			{
				chatting = false;
				sunny.startChatting(response);
			}
			else
			{
				ChatbotMain.print("I'm sorry. I don't understand.");
			}
		}
	}
}
