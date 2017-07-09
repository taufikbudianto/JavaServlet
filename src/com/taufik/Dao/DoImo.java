package com.taufik.Dao;

import com.taufik.Model.Model;

public class DoImo implements Dao {

	@Override
	public String GetName(String Name) {
		// TODO Auto-generated method stub
		String as = "Dao "+Name;
		return as;
	}

	@Override
	public String GetAlamat(String Alamat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void obj(Model mod) {
		// TODO Auto-generated method stub
		System.out.println(mod.getNama());
		System.out.println(mod.getAlamat());
	}

}
