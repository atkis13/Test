
public class Dog {
	
	private String name;
	private int size;
	
	public String  getName() {
		return name;
	}

	public void setName(String aname) {
		name = aname;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	
	public void bark(int numBark) {
		while (numBark >0) {
			if (size>60) {
				System.out.println(name + " says ham ham");
				numBark--;
			}
			else if (size<60 && size>14) {
				System.out.println(name + " says hum him");
				numBark--;
			}
			else {
				System.out.println(name + " says yip tip");
				numBark--;
			}
		}
	}
	

}
