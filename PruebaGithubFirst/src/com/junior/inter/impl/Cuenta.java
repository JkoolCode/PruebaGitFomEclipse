package com.junior.inter.impl;
import javax.swing.JOptionPane;

import com.junior.inter.ICuenta;

public class Cuenta implements ICuenta {

	@Override
	public void datos(String name, String cuenta) {
		JOptionPane.showMessageDialog(null, name + ", Cuenta: " + cuenta);
	}
	

}
