package kr.or.dgit.Mybatis_study;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.Mybatis_study_util.MybatisSqlSessionFactory;

public class MyBatisSqlSessionFactoryTest {
	private static SqlSessionFactory factory;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		factory = MybatisSqlSessionFactory.getSqlSessionFactory();
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		factory=null;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertNotNull(factory);
	}

}
