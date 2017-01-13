/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.securitypratice.repository;

import com.securitypratice.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Oluwaseun_Smart
 */
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

}
