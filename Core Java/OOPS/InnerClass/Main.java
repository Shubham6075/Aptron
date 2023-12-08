package core_java1.OOPs.InnerClass;

public class Main {
	public static void main(String[] args){

		OuterClass outer = new OuterClass();

		OuterClass.InnerClass inner = outer.new InnerClass();

		System.out.println(inner.y + outer.x) ;
	}
}
