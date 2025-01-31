package string;

public class StringBuilderEx3 {
	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Hello Everyone!");
		b.delete(0, 5);

		System.out.println(b);
	}

}
