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


import com.dao.ZuoweiyudingDao;
import com.entity.ZuoweiyudingEntity;
import com.service.ZuoweiyudingService;
import com.entity.vo.ZuoweiyudingVO;
import com.entity.view.ZuoweiyudingView;

@Service("zuoweiyudingService")
public class ZuoweiyudingServiceImpl extends ServiceImpl<ZuoweiyudingDao, ZuoweiyudingEntity> implements ZuoweiyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoweiyudingEntity> page = this.selectPage(
                new Query<ZuoweiyudingEntity>(params).getPage(),
                new EntityWrapper<ZuoweiyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoweiyudingEntity> wrapper) {
		  Page<ZuoweiyudingView> page =new Query<ZuoweiyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoweiyudingVO> selectListVO(Wrapper<ZuoweiyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoweiyudingVO selectVO(Wrapper<ZuoweiyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoweiyudingView> selectListView(Wrapper<ZuoweiyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoweiyudingView selectView(Wrapper<ZuoweiyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
