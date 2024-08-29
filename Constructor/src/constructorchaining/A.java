package constructorchaining;

public class A {

	A(int x){
		this(10.6);
		System.out.println(1);
	}
	A(double y){
		System.out.println(2);
	}
}
