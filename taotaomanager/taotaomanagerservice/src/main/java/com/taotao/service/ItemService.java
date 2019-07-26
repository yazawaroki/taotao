package com.taotao.service;

import com.tao.tao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {

    TbItem getItemById(long itemId);
    EUDataGridResult getItemList(int page,int rows);
}
