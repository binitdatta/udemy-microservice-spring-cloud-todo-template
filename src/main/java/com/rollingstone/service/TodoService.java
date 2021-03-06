package com.rollingstone.service;

import com.rollingstone.dao.jpa.TODORepository;
import com.rollingstone.domain.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static final Logger log = LoggerFactory.getLogger(TodoService.class);
	@Autowired
	private TODORepository todoRepository;
	
	public TodoService() {
	}

	public Todo createTodo(Todo todo) {
		return todoRepository.save(todo);
	}

	public Todo getTodo(long id) {
		return todoRepository.findOne(id);
	}

	public void updateTodo(Todo todo) {
		todoRepository.save(todo);
	}

	public void deleteTodo(Long id) {
		todoRepository.delete(id);
	}

	public Page<Todo> getAlltodos(Integer page, Integer size) {
		Page<Todo> pageOftodos = todoRepository.findAll(new PageRequest(page, size));
	
		return pageOftodos;
	}
}
