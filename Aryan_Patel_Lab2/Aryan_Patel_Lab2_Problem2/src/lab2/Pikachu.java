package lab2;//your package name

public class Pikachu{
	public static void main(String[] args) {
		Pokemon myPokemon = new Pokemon("Pikachu", 'M', 18);
		System.out.println(myPokemon);
		System.out.println("The gender of "+ myPokemon.getName() + " is " + myPokemon.getGender() + "." );
		myPokemon.sound();
		myPokemon.firstSkill();
		myPokemon.secondSkill();
		myPokemon.setName("pikachu");
		System.out.println(myPokemon);
	}
}