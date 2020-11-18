public abstract class Animal {
	String name;
	public abstract String getName(String name);
	public abstract void bark(); 
	public abstract void introduce();
	
	public static void main(String[] args) {
		Dog d = new Dog("ġ�Ϳ�", "��ġ");
		d.introduce();
		Cat c = new Cat(7, "����Ŭ");
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
		System.out.println("��!");
	}
	public void introduce() {
		System.out.print(this.breed + "�� " + this.name + "�̴�. ");
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
			System.out.println("��!");
		}
		public void introduce() {
			System.out.print(this.age + "���� " + this.name + "�̴�. ");
			bark();
		}
	}