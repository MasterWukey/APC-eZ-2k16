
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		String trimcheck= statement.trim();
		if (trimcheck.length()<1)
			response="Say something, please";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0) 
			response = "Tell me more about your family.";
			else if (statement.indexOf("Mrs.Dreyer")>=0)						//teacher: mrs. Dreyer
				response="She sounds like a great teacher!";
			else if (statement.indexOf("school")>=0)							//extra word #1: school
				response="School is exciting!";
			else if ( statement.indexOf("reddit")>=0)
				response="ah, yes. The front page of the internet";				//extra word #2: reddit
			else if (statement.indexOf("programming")>=0)
				response="Certainly. the computer is man's best friend";		//extra word #3: programming
			else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}
		else if (whichResponse==4){
			response="well duh";
		}
		else if (whichResponse==5){
			response= "people are so boring these days";
		}

		return response;
	}
}
