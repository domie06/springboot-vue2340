package com.dao;

import com.entity.FenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenleiVO;
import com.entity.view.FenleiView;


/**
 * 分类
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:22:10
 */
public interface FenleiDao extends BaseMapper<FenleiEntity> {
	
	List<FenleiVO> selectListVO(@Param("ew") Wrapper<FenleiEntity> wrapper);
	
	FenleiVO selectVO(@Param("ew") Wrapper<FenleiEntity> wrapper);
	
	List<FenleiView> selectListView(@Param("ew") Wrapper<FenleiEntity> wrapper);

	List<FenleiView> selectListView(Pagination page,@Param("ew") Wrapper<FenleiEntity> wrapper);
	
	FenleiView selectView(@Param("ew") Wrapper<FenleiEntity> wrapper);
	
}
