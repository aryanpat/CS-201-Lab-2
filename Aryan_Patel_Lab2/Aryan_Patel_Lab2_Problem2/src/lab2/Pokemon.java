package lab2;

public class Pokemon {
	
	private String name;
	private char gender;
	private int age;
	
	public Pokemon(String theName, char theGender, int theAge){
		name = theName;
		gender = theGender;
		age = theAge;
	}
	
	public String getName(){
		return name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPokemon(String theName, char theGender, int theAge) {
		name = theName;
		gender = theGender;
		age = theAge;
	}
	
	public void setName(String theName) {
		name = theName;
	}
	
	public void setAge(int theAge) {
		age = theAge;
	}
	
	public void setGender(char theGender) {
		gender = theGender;
	}
	
	public String toString() {
		return "My pokemon " + name + " is " + age + " years old.";
	}
	
	public void sound() {
		System.out.println(name + " says: Pika Pika!");
	}
	
	public void firstSkill() {
		System.out.println(name + " uses: Thunderbolt!");
	}
	
	public void secondSkill() {
		System.out.println(name + " uses: Quick Attack!" );
	}
		
}

	

			
