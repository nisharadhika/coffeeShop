package com.quickcart.ecommerce;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.quickcart.ecommerce.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;

@SpringBootApplication
public class QuickCartApplication {

	public static void main(String[] args) {

		SpringApplication.run(QuickCartApplication.class, args);
		Product expresso=new Product(1,"Expresso",2.66);
		Product croissant=new Product(2,"Croissant",3.66);
		System.out.println("Product ID: "+expresso.getId()+" Name: "+expresso.getName()+" Price: "+expresso.getPrice());
		System.out.println("Product ID: "+croissant.getId()+" Name: "+croissant.getName()+" Price: "+croissant.getPrice());

	}

}
