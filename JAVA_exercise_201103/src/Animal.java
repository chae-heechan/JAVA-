public abstract class Animal {
	String name;
	public abstract String getName(String name);
	public abstract void bark(); 
	public abstract void introduce();
	
	public static void main(String[] args) {
		Dog d = new Dog("치와와", "뭉치");
		d.introduce();
		Cat c = new Cat(7, "마이클");
		c.introduce();
	}
}

class Dog extends Animal{
	String breed;
	
	public Dog(String breed, String name) {
		this.breed = breed;
		this.name = name;
	}
	public String getName(String name) {
		return this.name;
	}
	public void bark() {
		System.out.println("멍!");
	}
	public void introduce() {
		System.out.print(this.breed + "의 " + this.name + "이다. ");
		bark();
	}
	
}
 
class Cat extends Animal{
		int age;
		
		public Cat(int age, String name) {
			this.age = age;
			this.name = name;
		}
		public String getName(String name) {
			return this.name;
		}
		public void bark() {
			System.out.println("냥!");
		}
		public void introduce() {
			System.out.print(this.age + "세의 " + this.name + "이다. ");
			bark();
		}
	}