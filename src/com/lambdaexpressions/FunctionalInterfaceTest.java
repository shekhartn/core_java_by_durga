package com.lambdaexpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaceTest implements Interface2,Interface1 {
	
	private Map<Integer,String> getProductDetails(List<Product> products){
		if(!Objects.isNull(products)) {
			return products.stream()
					.filter(p->p.price>30000)
					.collect(Collectors.toMap(p->Integer.valueOf(p.id),p->p.name));
		}
		return null;
	}
	
	private <T extends List<Product>, U, R extends Map<Integer,String>> BiFunction<T, U, R> callWithBody(Function<T, R> function){
		return (body,name)->{
			System.out.println("Name::"+name);
			return call(function,body);
		};
	}
	
	private <T, R> R call(Function<T, R> function,T body){
		R result=null;
		try {
			result=function.apply(body);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		Interface1 inter1=new FunctionalInterfaceTest();
		Interface2 inter2=new FunctionalInterfaceTest();
		inter1.m1();
		inter2.m1();
		inter2.m3();
		inter2.m4();
		
		//Function & BiFunctionTest
		List<Product> products = new ArrayList<Product>();
		// Adding Products
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Keyboard", 300f));
		products.add(new Product(3, "Dell Mouse", 150f));
		products.add(new Product(4, "Samsung A5", 17000f));
		products.add(new Product(5, "Iphone 6S", 65000f));
		products.add(new Product(6, "Sony Xperia", 25000f));
		products.add(new Product(7, "Nokia Lumia", 15000f));
		products.add(new Product(8, "Redmi4 ", 26000f));
		products.add(new Product(9, "Lenevo Vibe", 19000f));
		
		if(inter2 instanceof FunctionalInterfaceTest) {
			FunctionalInterfaceTest object=(FunctionalInterfaceTest)inter2;
			BiFunction<List<Product>, String, Map<Integer,String>> function=object.callWithBody((body)->object.getProductDetails(products));
			Map<Integer,String> map=function.apply(products, "Shekhar");
			System.out.println(map);
			
		}
		
		//stream test
		System.out.println("Device more than 20k:"+products.stream().filter(p->p.price>20000).map(p->p.name).collect(Collectors.toSet()));
		
		//iterate test
		Stream.iterate(5, e->e+3)
		.filter(e->e%5==0)
		.limit(15)
		.forEach(System.out::println);
		
		//reduce test
		Float totalPrice1=products.stream()
		.map(p->p.price)
		.reduce(0f,(sum,price)->sum+price);
		System.out.println(totalPrice1);
		
		Float totalPrice2=products.stream()
				.map(p->p.price)
				.reduce(0f,Float::sum);
				System.out.println(totalPrice2);
				
		//sum by collectors
		Double totalPrice=products.stream()
		.collect(Collectors.summingDouble(p->p.price));
		System.out.println("Total price::"+totalPrice);
		
		//min & max product price
		System.out.println(products.stream().max((p1,p2)->p1.price>p2.price?1:-1).get().price);
		System.out.println(products.stream().min((p1,p2)->p1.price>p2.price?1:-1).get().price);
		
		//count
		System.out.println(products.stream().count());
		System.out.println(products.stream().filter(p->p.price>20000).count());
		
		//map
		System.out.println(products.stream().collect(Collectors.toMap(p->p.id, p->p.name)));
		//method reference in stream
		System.out.println(products.stream().map(Product::getPrice).collect(Collectors.toSet()));
		
		
		
	}

	@Override
	public void m1() {
		System.out.println("m1 method");
	}

	@Override
	public void m3() {
		System.out.println("m3 method");
		
	}
	
   public void m4(){
		System.out.println("FunctionalInterfaceTest m4");
	}

}

//interface 1
@FunctionalInterface
interface Interface1{
	void m1();
	//void m2();//We can't declare this if we use @FunctionalInterface annotation
}
//@FunctionalInterface
interface Interface2 extends Interface1{
	 void m3();//We can't declare this if we use @FunctionalInterface annotation to Interface2
	default void m4(){
		System.out.println("Interface2 m4");
	}
}
