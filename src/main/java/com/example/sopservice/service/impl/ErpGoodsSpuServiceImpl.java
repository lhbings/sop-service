package com.example.sopservice.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sopservice.dao.ErpGoodsSpuDao;
import com.example.sopservice.entity.ErpGoodsSpu;
import com.example.sopservice.service.ErpGoodsSpuService;
import org.springframework.stereotype.Service;

/**
 * 商品表(ErpGoodsSpu)表服务实现类
 *
 * @author makejava
 * @since 2020-09-10 17:57:45
 */
@Service("erpGoodsSpuService")
public class ErpGoodsSpuServiceImpl extends ServiceImpl<ErpGoodsSpuDao, ErpGoodsSpu> implements ErpGoodsSpuService {

}