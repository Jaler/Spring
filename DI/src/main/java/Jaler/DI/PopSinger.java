package Jaler.DI;

public class PopSinger implements Singer{
	private String song = "Wahaha";
	
	public PopSinger(){
		
	}
	
	public PopSinger(String song){
		this.song = song;
	}
	
	public void sing() {
		System.out.println("I am singing " + song );
	}

}
