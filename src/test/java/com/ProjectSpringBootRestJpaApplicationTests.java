package com;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.Entity.Bill;
import com.Repository.BillRepo;
import com.Service.BillService;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProjectSpringBootRestJpaApplicationTests {

	@Autowired
	private BillService Service;
	
	@MockBean
	private BillRepo Repository;
	
	public void getBillTest()
	{
	}
	
	
	
	@Test
	void contextLoads() {
	}

}
