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
			menu.add(new MenuItem(104566,"Biriyani","main dish",130,false,true,DataUtil.convertToDate("17/10/2021")));
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
		List<MenuItem> lst =new ArrayList<MenuItem>();
		for(MenuItem mm:menuItemList)
		{	 
			//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
			Date date = new Date();
			if(mm.getDateOfLaunch().compareTo(date)<=0)
			{
				if(mm.isActive())
				{
					lst.add(mm);
				}
			}
		}
		return lst;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		// TODO Auto-generated method stub
		for(int i=0;i<menuItemList.size();i++)
		{
			if(menuItemList.get(i).getId()==menuItem.getId())
			{
				menuItemList.set(i,menuItem);
			}
		}
		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=0;i<menuItemList.size();i++)
		{
			if(menuItemList.get(i).getId()==menuItemId)
			{
				 n=i;
			}
		}
		return menuItemList.get(n);
	}

}
