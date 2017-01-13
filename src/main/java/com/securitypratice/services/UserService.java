/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.securitypratice.services;

import com.securitypratice.domain.User;

/**
 *
 * @author Oluwaseun_Smart
 */
public interface UserService {

	public User findByEmail(String email);
	
}