package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.User;

public interface UserRepository extends JpaRepository<User,Long>{
	// JPA findBy 규칙
    // select * from user_master where kakao_email = ?
    public User findByKakaoEmail(String kakaoEmail);
    
   //원본 에러 :  public User findByUserCode(String userCode);
    public User findByUserCode(Long userCode);
}
