package com.cognizant.truyum.dao;

import java.util.*;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DataUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	private static List<MenuItem> menuItemList;
	
	

	public MenuItemDaoCollectionImpl() {
		super();
		if(menuItemList==null)
		{
			List<MenuItem> menu=new ArrayList<MenuItem>();
			menu.add(new MenuItem(100123,"Shawarma","main dish",158,true,true,DataUtil.convertToDate("13/10/2010")));
			menu.add(new MenuItem(100100,"Burger","main dish",200,true,false,DataUtil.convertToDate("13/12/2013")));
			menu.add(new MenuItem(104566,"Biriyani","main dish",130,false,true,DataUtil.convertToDate("17/10/2015")));
			menuItemList=menu;
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}

	@Override
	public List<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuitem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		return null;
	}

}
