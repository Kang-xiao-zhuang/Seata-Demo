package com.zhuang.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhuang.item.service.IItemStockService;
import com.zhuang.item.mapper.ItemStockMapper;
import com.zhuang.item.pojo.ItemStock;
import org.springframework.stereotype.Service;

@Service
public class ItemStockService extends ServiceImpl<ItemStockMapper, ItemStock> implements IItemStockService {
}
