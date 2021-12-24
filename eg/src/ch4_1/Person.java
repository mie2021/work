package ch4_1;

public class Person {
	private String id,name,sex;//身份证号，姓名，性别
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String id, String name, String sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public Person() {
		this("","佚名","");
	}
	public void eat(String food) {
		System.out.println("今天吃"+food);
	}
	public void sleep(double time) {
		System.out.println("睡了"+time+"小时");
	}
	public void walk(int distance) {
		System.out.println("走了"+distance+"步");
	}
}
