package com.cognizant.truyum.dao;



import java.util.List;

import com.cognizant.truyum.model.*;

public interface CartDao {

	void addCartItem(long userId,long MenuItemId);
	List<MenuItem> getAllCartItems(long userId);
	void removeCartItem(long userId,long menuItemId);
	
}
