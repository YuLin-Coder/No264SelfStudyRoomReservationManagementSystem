package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZixishiDao;
import com.entity.ZixishiEntity;
import com.service.ZixishiService;
import com.entity.vo.ZixishiVO;
import com.entity.view.ZixishiView;

@Service("zixishiService")
public class ZixishiServiceImpl extends ServiceImpl<ZixishiDao, ZixishiEntity> implements ZixishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixishiEntity> page = this.selectPage(
                new Query<ZixishiEntity>(params).getPage(),
                new EntityWrapper<ZixishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixishiEntity> wrapper) {
		  Page<ZixishiView> page =new Query<ZixishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZixishiVO> selectListVO(Wrapper<ZixishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZixishiVO selectVO(Wrapper<ZixishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZixishiView> selectListView(Wrapper<ZixishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixishiView selectView(Wrapper<ZixishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
