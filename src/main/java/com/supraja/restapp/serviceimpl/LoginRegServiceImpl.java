package com.supraja.restapp.serviceimpl;

import org.springframework.stereotype.Service;

import com.supraja.restapp.model.LoginReg;
import com.supraja.restapp.repository.LoginRegRepo;
import com.supraja.restapp.service.LoginRegService;

@Service
public class LoginRegServiceImpl implements LoginRegService {
	
	public LoginRegServiceImpl(LoginRegRepo loginregRepo) {
		super();
		this.loginregRepo = loginregRepo;
	}

	LoginRegRepo loginregRepo;

	@Override
	public LoginReg findByUsername(String username) {
		return loginregRepo.findByUsername(username);
	}

	@Override
	public LoginReg saveLoginReg(LoginReg loginreg) {
		loginreg.setPassword((loginreg.getPassword()));
		return loginregRepo.save(loginreg);
	}
}
