public class Movies {

	private String name;
	private double budget;
	private long duration;
	private int numActor;

	public Movies() {
		System.out.println(" Movie DC");
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

	public void setBudget(double budget) {
		this.budget=budget;
	}

	public double getBudget() {
		return this.budget;
	}

	public void setDuration(long duration) {
		this.duration=duration;
	}

	public long getDuration() {
		return this.duration;
	}
	
	public void setNumActor(int numActor) {
		this.numActor=numActor;
	}

	public int getnumActor() {
		return this.numActor;
	}
}