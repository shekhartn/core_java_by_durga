package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		A a = (s) -> "Shekhar T";
		B b = (s) -> "Suresh";
		System.out.println("A->" + a.m1("123"));
		System.out.println("B->" + b.m2("123"));

		Addable addable = (x, y) -> x + y;
		System.out.println("Addable:::" + addable.add(10, 20));

		// forEach
		List<String> list = new ArrayList<String>();
		list.add("Shekhar");
		list.add("Suresh");
		list.add("Karthik");
		list.add("Ramesh");
		list.forEach((s) -> System.out.print(s + "\t"));

		// threads
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Thread-1::" + (i + 1));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		// new Thread(r1).start();
//		new Thread(()->{
//			for(int i=0;i<10;i++) {
//				System.out.println("Thread-2::"+(i+1));
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
//		}).start();

		List<Product> products = new ArrayList<Product>();

		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(3, "Keyboard", 300f));
		products.add(new Product(2, "Dell Mouse", 150f));
		products.add(new Product(1, "Samsung A5", 17000f));
		products.add(new Product(3, "Iphone 6S", 65000f));
		products.add(new Product(2, "Sony Xperia", 25000f));
		products.add(new Product(4, "Nokia Lumia", 15000f));
		products.add(new Product(5, "Redmi4 ", 26000f));
		products.add(new Product(6, "Lenevo Vibe", 19000f));
		System.out.println("Products without sorting::" + products);

		// comparator
		Collections.sort(products, (ob1, ob2) -> ob1.name.compareTo(ob2.name));
		System.out.println("Products with sorting::" + products);

		// filter
		Stream<Product> prods = products.stream().filter(product -> product.price > 20000);
		prods.forEach(prod -> System.out.println(prod));

		// method references
		// Referring static method
		Sayable sayable1 = MethodReference1::saySomething;
		Sayable sayable2 = MethodReference2::sayGoodbye;
		// Calling interface method
		sayable1.say();
		sayable2.say();
		System.out.println();
		new Thread(MethodReference2::sayGoodbye).start();
		new Thread(MethodReference2::sayGoodbye).start();
		
		//BiFunction
		BiFunction<Integer, Integer, Integer> arithmetic=Arithmetic::add;
		System.out.println(arithmetic.apply(10, 15));
		
		//Function
		Function<String, String> wish= Wishable::wish;
		System.out.println(wish.apply("Karthik T"));
		System.out.println(wish.apply("Shekhar T"));
		System.out.println(wish.apply("Ramesh T"));
		
		BiFunction<Integer, Float, Float> adder1=Arithmetic::add;
		BiFunction<Float, Float, Float> adder2=Arithmetic::add;
		
		System.out.println();
		//instance method reference
		Sayable say=new MethodReference1()::sayHello;
		say.say();
		
		//constructor method reference
		Messageable message=Message::new;
		message.getMessage("Hello");
		
	}

}

@FunctionalInterface
interface A {
	String m1(String s);
}

@FunctionalInterface
interface B {
	String m2(String s);
}

interface Addable {
	int add(int a, int b);
}
interface Wishable {
	static String wish(String name) {
		return "Hello Mr."+name+", Goog morning";
	}
}

interface Sayable {
	void say();
}

class MethodReference1 {
	
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
	
	public void sayHello() {
		System.out.println("Hello, this is non static method.");
	}
}

class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
	public static float add(int a, float b) {
		return a + b;
	}
	public static float add(float a, float b) {
		return a + b;
	}
}
class MethodReference2 {  
    public static void sayGoodbye(){  
        System.out.println("Hello, this is good bye static method.");  
    }  
}

interface Messageable{
	Message getMessage(String message);
}
class Message{
	Message(String message){
		super();
		System.out.println(message);
	}
}