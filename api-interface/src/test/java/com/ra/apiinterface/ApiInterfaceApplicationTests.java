package com.ra.apiinterface;

import com.ra.apiclient.model.User;
import com.ra.apiclient.client.ApiClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import javax.annotation.Resource;

@SpringBootTest
class ApiInterfaceApplicationTests {

    @Resource
    private ApiClient apiClient;

    @Test
    void contextLoads() {
        String result = apiClient.getNameByGet("aaa");
        User user = new User();
        user.setUsername("bbb");
        String usernameByPost = apiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
