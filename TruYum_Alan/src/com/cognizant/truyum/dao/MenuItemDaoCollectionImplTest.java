package com.cognizant.truyum.dao;

import java.util.*;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionImplTest {
	public static void main(String srgs[])
	{
		
		testGetMenuItemListAdmin();
	}
	
	static void testGetMenuItemListAdmin()
	{
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		List<MenuItem> mm=menuItemDao.getMenuItemListAdmin();
		for(MenuItem mn:mm)
			System.out.println(mn.getId()+" "+mn.getName()+" "+mn.getCategory()+" "+mn.getPrice()+" "+mn.getDateOfLaunch());
	}
	
	static void testGetMenuItemListCustomer()
	{
		
	}
	
	static void testModifyMenuItem()
	{
		
	}
	
	static void testGetMenuItem()
	{
		
	}

}
