package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper mapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItem item = mapper.selectByPrimaryKey(itemId);

//        TbItemExample example = new TbItemExample();
//        TbItemExample.Criteria criteria = example.createCriteria();
//        criteria.andIdEqualTo(itemId);
//        List<TbItem> list = mapper.selectByExample(example);
//        if(list !=null && list.size()>0) {
//            TbItem item = list.get(0);
//            return item;
//
//        }
        return item;
    }
}
