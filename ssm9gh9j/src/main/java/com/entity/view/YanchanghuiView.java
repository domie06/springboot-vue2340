package com.entity.view;

import com.entity.YanchanghuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 演唱会
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 14:22:10
 */
@TableName("yanchanghui")
public class YanchanghuiView  extends YanchanghuiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YanchanghuiView(){
	}
 
 	public YanchanghuiView(YanchanghuiEntity yanchanghuiEntity){
 	try {
			BeanUtils.copyProperties(this, yanchanghuiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
