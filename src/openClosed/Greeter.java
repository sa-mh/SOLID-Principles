package openClosed;

public class Greeter{

    private Greeting greetingType;

    public String greet(){
    	
        return this.greetingType.phrase();
        
    }
   public String greet(Greeting greet){
    	
        return greet.phrase();
        
    }

    public void setGreetingType(Greeting greetingType) {
        this.greetingType = greetingType;
    }
}
