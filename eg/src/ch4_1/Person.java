package ch4_1;

public class Person {
	private String id,name,sex;//���֤�ţ��������Ա�
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
		this("","����","");
	}
	public void eat(String food) {
		System.out.println("�����"+food);
	}
	public void sleep(double time) {
		System.out.println("˯��"+time+"Сʱ");
	}
	public void walk(int distance) {
		System.out.println("����"+distance+"��");
	}
}
