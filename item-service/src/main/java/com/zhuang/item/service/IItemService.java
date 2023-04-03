package com.zhuang.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhuang.item.pojo.Item;

public interface IItemService extends IService<Item> {
    void saveItem(Item item);
}
