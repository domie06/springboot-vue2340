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


import com.dao.YanchanghuiDao;
import com.entity.YanchanghuiEntity;
import com.service.YanchanghuiService;
import com.entity.vo.YanchanghuiVO;
import com.entity.view.YanchanghuiView;

@Service("yanchanghuiService")
public class YanchanghuiServiceImpl extends ServiceImpl<YanchanghuiDao, YanchanghuiEntity> implements YanchanghuiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YanchanghuiEntity> page = this.selectPage(
                new Query<YanchanghuiEntity>(params).getPage(),
                new EntityWrapper<YanchanghuiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YanchanghuiEntity> wrapper) {
		  Page<YanchanghuiView> page =new Query<YanchanghuiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YanchanghuiVO> selectListVO(Wrapper<YanchanghuiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YanchanghuiVO selectVO(Wrapper<YanchanghuiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YanchanghuiView> selectListView(Wrapper<YanchanghuiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YanchanghuiView selectView(Wrapper<YanchanghuiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
