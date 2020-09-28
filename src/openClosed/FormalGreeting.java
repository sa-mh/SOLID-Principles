package openClosed;

public class FormalGreeting implements Greeting{
	
	private String hello = "Good evening, Sir.";
	
	public  String phrase()
	{
		return hello;
	}
	public void setGreeting(String greeting)
	{
		hello = greeting;
	}
	public String getGreeting()
	{
		return hello;
	}

}
