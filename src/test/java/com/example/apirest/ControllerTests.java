package com.example.apirest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:app-context.xml")
@SpringBootTest
public class ControllerTests
{
	@Autowired
	private VegetableController controller;

	@Test
	public void contextLoads() throws Exception
	{
		Assertions.assertNotNull(controller);
	}
}
