package com.admin;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.admin.dao.UserDaoRepository;
import com.admin.model.User;
import com.admin.service.UserService;
import com.admin.service.impl.UserServiceImpl;

@SpringBootTest
public class MokiteTest {

	@Mock
	private UserDaoRepository userDaoRepository;

    @InjectMocks // auto inject helloRepository
    private UserService helloService = new UserServiceImpl();

    @Test
    void testGet() {
    	
    	User user = new User();
    	user.setId(1);
   
    	//when(userDaoRepository.findById(1).get())).;
    	
        assertEquals(1, helloService.getUserbyId(1).getId());
    }
}
