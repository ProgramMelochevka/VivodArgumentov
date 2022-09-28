package by.home.maxzzzit;

// Вывод аргументов в консоль!
public class VivodArgumentov {
	public static void main(String[] args) {
		// так!
		for (String str : args) {
			System.out.println(str);
		}
		System.out.println();
		// или так!
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
