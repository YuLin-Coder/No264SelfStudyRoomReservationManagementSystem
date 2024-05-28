package com.dao;

import com.entity.ZixishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZixishiVO;
import com.entity.view.ZixishiView;


/**
 * 自习室
 * 
 * @author 
 * @email 
 * @date 2021-03-11 13:48:15
 */
public interface ZixishiDao extends BaseMapper<ZixishiEntity> {
	
	List<ZixishiVO> selectListVO(@Param("ew") Wrapper<ZixishiEntity> wrapper);
	
	ZixishiVO selectVO(@Param("ew") Wrapper<ZixishiEntity> wrapper);
	
	List<ZixishiView> selectListView(@Param("ew") Wrapper<ZixishiEntity> wrapper);

	List<ZixishiView> selectListView(Pagination page,@Param("ew") Wrapper<ZixishiEntity> wrapper);
	
	ZixishiView selectView(@Param("ew") Wrapper<ZixishiEntity> wrapper);
	
}
