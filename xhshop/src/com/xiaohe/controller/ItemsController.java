package com.xiaohe.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xiaohe.po.ShopinfoCustom;
import com.xiaohe.po.ShopinfoQueryVo;
import com.xiaohe.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {
	@Autowired
	private ItemsService itemsService;
	
	//商品上架
	@RequestMapping("/addItems")
	public String addItems(ShopinfoCustom shopinfoCustom){
		String originalFilename=shopinfo_pic.getOriginalFilename();
		if(shopinfo_pic!=null&&originalFilename!=null&&originalFilename.length()>0){
			
			String pic_path="F:\\upload\\";
			
			String newFileName=UUID.randomUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			File newFile=new File(pic_path+newFileName);
			shopinfo_pic.transferTo(newFile);
			shopinfoCustom.setSimgpath(newFileName);
//			System.out.println(newFileName);
//			System.out.println(originalFilename.substring(originalFilename.lastIndexOf(".")));
		}
		itemsService.addItems(shopinfoCustom);
		return null;
		
	}
	
	//查询商品
	@RequestMapping("/queryAllItems")
	public String queryItems(){
		
		List<ShopinfoCustom> shopinfoList = itemsService.queryAllItems();
		return null;
		
		
	}
	//商品下架
	@RequestMapping("/deleterItems")
	public String deleterItems(Integer id){
		itemsService.deleterItems(id);
		return null;
				
	}
	
	//商品修改
	@RequestMapping("/updateItems")
	public String updateItems(ShopinfoCustom shopinfoCustom){
		
		itemsService.updateItems(shopinfoCustom);
		
		return null;
		
	}
	//商品搜索
	@RequestMapping("/searchItems")
	public String searchItems(ShopinfoCustom shopinfoCustom){
		
		itemsService.searchItems(shopinfoCustom);
		return null;
		
		
		
	}
	
	//商品按类型查询
	@RequestMapping("/queryItemsByType")
	public String queryItemsByType(ShopinfoCustom shopinfoCustom){
		
		itemsService.queryItemsByType(shopinfoCustom);
		return null;
			
		
	}
	
	
	
}
