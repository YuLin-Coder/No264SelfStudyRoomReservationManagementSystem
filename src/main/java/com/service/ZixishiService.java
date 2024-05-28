package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZixishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZixishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZixishiView;


/**
 * 自习室
 *
 * @author 
 * @email 
 * @date 2021-03-11 13:48:15
 */
public interface ZixishiService extends IService<ZixishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixishiVO> selectListVO(Wrapper<ZixishiEntity> wrapper);
   	
   	ZixishiVO selectVO(@Param("ew") Wrapper<ZixishiEntity> wrapper);
   	
   	List<ZixishiView> selectListView(Wrapper<ZixishiEntity> wrapper);
   	
   	ZixishiView selectView(@Param("ew") Wrapper<ZixishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixishiEntity> wrapper);
   	
}

