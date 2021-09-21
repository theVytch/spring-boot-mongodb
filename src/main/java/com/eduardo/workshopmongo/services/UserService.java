package com.eduardo.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.eduardo.workshopmongo.domain.User;
import com.eduardo.workshopmongo.dto.UserDTO;
import com.eduardo.workshopmongo.repository.UserRepository;
import com.eduardo.workshopmongo.services.exception.ObjectNotFoundExeption;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findByID(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption("Objeto não encontrado"));
	}

	public User insert(User obj) {
		return userRepository.insert(obj);
	}

	public void delete(String id) {
		findByID(id);
		userRepository.deleteById(id);
	}

	public User fromDTO(UserDTO objDTO) {
		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
	}

}
