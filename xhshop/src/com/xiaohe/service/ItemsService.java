package com.xiaohe.service;

import java.util.List;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;

public interface ItemsService {
	public void addItems(ShopinfoCustom shopinfoCustom);

	public List<ShopinfoCustom> queryAllItems();
	
	public void deleterItems(Integer id);

	public void updateItems(ShopinfoCustom shopinfoCustom);
	
	public List<ShopinfoCustom> searchItems(ShopinfoCustom shopinfoCustom);
	
	public List<ShopinfoCustom> queryItemsByType(ShopinfoCustom shopinfoCustom);
}
