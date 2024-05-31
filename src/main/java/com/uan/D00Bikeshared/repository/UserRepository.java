package com.uan.D00Bikeshared.repository;

import com.uan.D00Bikeshared.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
