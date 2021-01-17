package com.junior;
import com.junior.inter.ICuenta;
import com.junior.inter.impl.Cuenta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICuenta cta = new Cuenta();
		cta.datos("Junior Oblitas", "19023726382");
		
	}

}
