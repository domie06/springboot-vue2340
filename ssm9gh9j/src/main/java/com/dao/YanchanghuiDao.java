package com.dao;

import com.entity.YanchanghuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YanchanghuiVO;
import com.entity.view.YanchanghuiView;


/**
 * 演唱会
 * 
 * @author 
 * @email 
 * @date 2021-04-24 14:22:10
 */
public interface YanchanghuiDao extends BaseMapper<YanchanghuiEntity> {
	
	List<YanchanghuiVO> selectListVO(@Param("ew") Wrapper<YanchanghuiEntity> wrapper);
	
	YanchanghuiVO selectVO(@Param("ew") Wrapper<YanchanghuiEntity> wrapper);
	
	List<YanchanghuiView> selectListView(@Param("ew") Wrapper<YanchanghuiEntity> wrapper);

	List<YanchanghuiView> selectListView(Pagination page,@Param("ew") Wrapper<YanchanghuiEntity> wrapper);
	
	YanchanghuiView selectView(@Param("ew") Wrapper<YanchanghuiEntity> wrapper);
	
}
