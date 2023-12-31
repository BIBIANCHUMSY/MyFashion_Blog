package com.week.nine.FashionBlogAPI.repository;

import com.week.nine.FashionBlogAPI.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long > {
    Optional<Admin> findAdminByEmail ( String email);
    Optional<Admin> findAdminById (Long adminId);
}
