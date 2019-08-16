package com.kodilla.patterns.prototype;

public class Prototype<T> implements Cloneable { //<T> oznacza, że deklarując obiekt tej klasy, w nawiasach podajemy
	// typ obieków, na kt. ta klasa będzie operowała(jak przy kolekcjach)
	@Override
	public T clone() throws CloneNotSupportedException {
		return (T)super.clone();
	}
}
