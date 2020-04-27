package com.wyn.common.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.wyn.common.utils.RandNumUtil;
import com.wyn.common.utils.RandomUtil;
import com.wyn.common.utils.ZHStringUtil;

class TpsTest {

	@Test
	void test() {
		for (int i = 1; i <= 100; i++) {
			Tps t=new Tps();
			t.setId(i);
			//专家姓名属性值调用ZHStringUtil的getZHName()
			t.setName(ZHStringUtil.getZHName());
			//年龄属性值调用RandomUtil.random()创建，必须在1-100岁之间(5分)
			t.setAge(RandomUtil.random(1, 100));
			//薪酬是3万到8万，小数点后2位的随机数(5分)
			t.setMoney(RandNumUtil.random(30000, 80000));
			Date d=new Date();
			SimpleDateFormat data=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			t.setTime(data.format(d));
			System.out.println(t);
		}
	}

}
