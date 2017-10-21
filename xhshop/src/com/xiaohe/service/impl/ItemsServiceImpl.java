package com.xiaohe.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xiaohe.mapper.*;
import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;
import com.xiaohe.service.ItemsService;
public class ItemsServiceImpl implements ItemsService{
	

	@Autowired
	private ShopinfoMapperCustom shopinfoMapperCustom;
	@Override
	public void addItems(ShopinfoCustom shopinfoCustom) {
		// TODO Auto-generated method stub
		shopinfoMapperCustom.addItems(shopinfoCustom);
	}
	@Autowired
	private ShopinfoMapper shopinfoMapper;
	@Override
	public void deleterItems(Integer id) {
		// TODO Auto-generated method stub
		shopinfoMapper.deleteByPrimaryKey(id);
	}
	@Override
	public List<ShopinfoCustom> queryAllItems() {
		// TODO Auto-generated method stub
	
		return shopinfoMapperCustom.queryAllItems();
	}
	@Override
	public void updateItems(ShopinfoCustom shopinfoCustom) {
		// TODO Auto-generated method stub
		shopinfoMapper.updateByPrimaryKey(shopinfoCustom);
	}
	@Override
	public List<ShopinfoCustom> searchItems(ShopinfoCustom shopinfoCustom) {
		// TODO Auto-generated method stub
		return shopinfoMapperCustom.searchItems(shopinfoCustom);
	}
	@Override
	public List<ShopinfoCustom> queryItemsByType(ShopinfoCustom shopinfoCustom) {
		// TODO Auto-generated method stub
		
		shopinfoMapperCustom.queryItemsByType(shopinfoCustom);
		return null;
	}
	
	
}
