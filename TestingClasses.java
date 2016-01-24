public class TestingClasses {
	public static void main(String[] args) {
		
		Foo f1 = new Foo(5);
		Bar b1 = new Bar(5);
		Bar b2 = new Bar(1);
		
		b1.addThisToFoo(f1);
	}
}

class Foo {
	private int a;
	private Bar b;
	public Foo(int a) {
		this.a = a;
	}
	public int getQ() {
		return this.a;
	}
	public void incrementA() {
		add5ToA();
	}
	public void add5ToA() {
		this.a += 5;
	}
	public void addBar(Bar bar) {
		b = bar;
	}
}

class Bar {
	private int a;
	public Bar(int a) {
		this.a = a;
	}
	public int getQ() {
		return this.a;
	}
	public void addThisToFoo(Foo foo) {
		foo.addBar(this);
	}
}