package com.example.sopservice;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.sopservice.controller.result.ErpGoodsBrandResult;
import com.example.sopservice.entity.ErpGoodsBrand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
class SopServiceApplicationTests {

	@Test
	void contextLoads() {

		Page<ErpGoodsBrand> rel = new Page<>();
		List<ErpGoodsBrand> list = Stream.of(new ErpGoodsBrand(1), new ErpGoodsBrand(2)).collect(Collectors.toList());
		rel.setRecords(list);

		Page<ErpGoodsBrandResult> rel2 =new Page<>();
		BeanUtils.copyProperties(rel,rel2);
		System.out.println(rel.getRecords());
		System.out.println("-=--------------");
		System.out.println(rel2.getRecords());
	}

}
