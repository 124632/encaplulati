public class MovieTester {
	public static void main(String[] args) {
		System.out.println(" main method started....");

		Movies m1= new Movies();
		//m1.name="RBJD";
		m1.setName("RBJD");
		m1.setDuration(150);
		m1.setBudget(500000.00);
		m1.setNumActor(50);

		System.out.println("Movie details are");
		String mName=m1.getName();
		double budget=m1.getBudget();
		long length=m1.getDuration();
		int num=m1.getnumActor();

		System.out.println(mName+"\n"+budget+"\n"+length+"\n"+num);

		System.out.println("main method ended...");
	}
}