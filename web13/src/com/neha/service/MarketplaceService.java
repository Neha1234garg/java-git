package com.neha.service;

import com.neha.bin.Create;
import com.neha.bin.copy.Create1;
import com.neha.domain.*;

public interface MarketplaceService {
	//public boolean ifalreadyexist(Create mypojo);
	 public void addPartner(Create mypojo);
	 public void delPartner(Create mypojo);
	 public boolean accountExists(Create mypojo);
	 public boolean accountExists1(Create1 mypojo);
	// protected void save();

}
