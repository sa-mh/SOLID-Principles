package openClosed;

public class CasualGreeting implements Greeting{

		private String hello = "Sup?";
		
		public String phrase()
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
