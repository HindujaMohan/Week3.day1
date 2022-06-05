package Week3.day1;

public class Smartphone extends Androidphone {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Smartphone smt = new Smartphone();
		smt.SaveContact();
		smt.sendMsg();
		smt.takeVideo();
		smt.takeVideo();
		smt.makeCall();
		System.out.println("connecting to Watspp");
		
	}
	public void takeVideo() {
		System.out.println("video calling");
	}


}
