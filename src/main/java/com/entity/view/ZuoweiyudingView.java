package com.entity.view;

import com.entity.ZuoweiyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 座位预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-11 13:48:15
 */
@TableName("zuoweiyuding")
public class ZuoweiyudingView  extends ZuoweiyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoweiyudingView(){
	}
 
 	public ZuoweiyudingView(ZuoweiyudingEntity zuoweiyudingEntity){
 	try {
			BeanUtils.copyProperties(this, zuoweiyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
