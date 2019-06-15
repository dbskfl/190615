package com.test.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * UserDTO
 */
@Data @Component @Lazy     // Lazy : 따로 안하면 DTO가 서버돌고있을때 다 실행됨(과부하되이니 성능향상을위해 써줌)
public class UserDTO {
    private String userId;
    private String password;
    private String name;
    private String age;
    private String addr;
    private String profilePhoto;

    
}