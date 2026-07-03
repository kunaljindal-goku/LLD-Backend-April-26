package com.scaler.bookMyShow.Repository;

import com.scaler.bookMyShow.model.User;
import com.scaler.bookMyShow.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
