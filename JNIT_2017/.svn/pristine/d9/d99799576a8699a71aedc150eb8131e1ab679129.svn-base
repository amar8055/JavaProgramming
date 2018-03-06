package com.jnit.ocp2017.resourceebundle;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("com.jnit.ocp2017.resourceebundle.Zoo", new Locale("fr", "FR"));
		String val = rb.getString("hello");
		for (String s : rb.keySet()) {
			System.out.println(s + ":" + rb.getString(s));

		}

		Properties properties = new Properties();
		rb.keySet().forEach(k -> properties.put(k, rb.getString(k)));
		System.out.println(properties);

	}

}
