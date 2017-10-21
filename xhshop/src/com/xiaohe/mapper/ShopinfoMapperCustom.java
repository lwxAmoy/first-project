package com.xiaohe.mapper;

import java.util.List;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;

public interface ShopinfoMapperCustom {
	public void addItems(ShopinfoCustom shopinfoCustom);
	public List<ShopinfoCustom> queryAllItems();
	
	public List<ShopinfoCustom> searchItems(ShopinfoCustom shopinfoCustom);
//	public void updateItems (Integer id);
	public void queryItemsByType(ShopinfoCustom shopinfoCustom);
}
