package com.imooc.o2o.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;

/**
 * @Description: 区域业务测试
 *
 */
public class AreaServiceTest extends BaseTest {

	@Autowired
	private AreaService areaService;

	@Test
	public void testQueryArea() {
		List<Area> areaList = areaService.getAreaList();
		System.out.println("service测试：" + areaList.toString());
	}

}
