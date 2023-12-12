package Lab2;
public class TVs extends Electronics {
	public double screenSize;
	public int hdmiPortCount;
	private boolean aiCompatible;
	private int moviesWatched = 0;
	private boolean movieActive = false;
	
	public TVs (double weight, double cost, String model, String deviceName, double screenSize, int hdmiPortCount, boolean aiCompatible) {
		super (weight, cost, model, deviceName);
		
		this.screenSize = screenSize;
		this.hdmiPortCount = hdmiPortCount;
		this.aiCompatible = aiCompatible;
	}
	public boolean getMovieStatus () {
		return movieActive;
	}
	public int getMovieCount () {
		return moviesWatched;
	}
	public String getAICompatibility () {
		String response = "";
		if (aiCompatible == true) {
			response = "yes";
		}
		else {
			response = "no";
		}
		return response;
	}
	
	public String playMovie () {
		if (movieActive == false) {
			movieActive = true;
			return "A movie has started";
		}
		else {
			return "A movie is already playing, stop it first to start a new one";
		}
	}
	public String endMovie () {
		if (movieActive == false) {
			return "No movie is playing";
		}
		else {
			movieActive = false;
			return "The movie has been turned off";
		}
	}
}
