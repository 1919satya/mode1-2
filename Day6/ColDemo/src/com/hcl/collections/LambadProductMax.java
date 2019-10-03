package com.hcl.collections;
import java.util.ArrayList;
import java.util.List;

public class LambadProductMax {
public static void main(String[] args) {
List<Product>list=new ArrayList<Product>();
	
	list.add(new Product(1,"Hp laptop",35000));
	list.add(new Product(3,"key board",3000));
	list.add(new Product(2,"sony",29000));
	list.add(new Product(4,"samsung",38000));
	list.add(new Product(6,"xiomi",20000));
	list.add(new Product(5,"Realme",10000));
	
	list.stream().filter(p ->p.price >=20000).forEach(x ->{
		System.out.println(x);
	});
	System.out.println("names starts with s");
	list.stream().filter(p ->p.name.startsWith("s")).forEach(x ->{
		System.out.println(x);
});
	Product maxp=list.stream().max((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
	System.out.println("max price record");
	System.out.println(maxp);
	
	Product minp=list.stream().min((p1,p2) -> p1.price >= p2.price ? 1 : -1).get();
	System.out.println("min price recorded");
	System.out.println(minp);
}
}
