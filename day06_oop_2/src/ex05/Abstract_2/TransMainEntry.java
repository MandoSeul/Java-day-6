package ex05.Abstract_2;

abstract class Trans{
	abstract public void start(String str);
	abstract public void stop(String str);
	public abstract void display(String str);
}

class Subway extends Trans{
	String start, stop;
	@Override
	public void start(String str) {
		// TODO Auto-generated method stub
		start="파파파파파파파파";
	}

	@Override
	public void stop(String str) {
		// TODO Auto-generated method stub
		stop="끼이이이이익";}
		
	public void display(String str)
	{System.out.println(str+"가"+start+"하게 출발하고 "+stop+"하며 멈춥니다.");}
}

class Bus extends Trans{
	String start, stop;
	@Override
	public void start(String str) {
		// TODO Auto-generated method stub
		start = str;
	}

	@Override
	public void stop(String str) {
		// TODO Auto-generated method stub
		stop = str;
	}
	public void display(String str)
	{System.out.println(str+"가"+start+"하게 출발하고 "+stop+"하며 멈춥니다.");}
}

class Bicycle extends Trans{
	String start, stop;
	@Override
	public void start(String str) {
		// TODO Auto-generated method stub
		start = str;
	}

	@Override
	public void stop(String str) {
		// TODO Auto-generated method stub
		stop = str;
	}
	public void display(String str)
	{System.out.println(str+"가"+start+"하게 출발하고 "+stop+"하며 멈춥니다.");}
}

class Plane extends Trans{

	String start, stop;
	@Override
	public void start(String str) {
		// TODO Auto-generated method stub
		start = str;
	}

	@Override
	public void stop(String str) {
		// TODO Auto-generated method stub
		stop = str;
	}
	public void display(String str)
	{System.out.println(str+"가"+start+"하게 출발하고 "+stop+"하며 멈춥니다.");}
}
public class TransMainEntry {
	public static void main(String[] args) {
		Trans [] tra =new Trans[4];
		tra[0] = new Subway();
		tra[1] = new Bus();
		tra[2] = new Bicycle();
		tra[3] = new Plane();
		String[] name = {"지하철","버스","자전거","비행기"};
		for( int i =0; i<tra.length; i++){
			tra[i].start(name[i]);
			tra[i].stop(name[i]);
			tra[i].display(name[i]);
			
		}
		
		
}
}
