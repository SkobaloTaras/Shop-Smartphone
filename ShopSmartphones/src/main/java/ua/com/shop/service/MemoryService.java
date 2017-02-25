package ua.com.shop.service;

import java.util.List;

import ua.com.shop.entity.Memory;

public interface MemoryService {

	void save(Memory memory);
	List<Memory> findAll();
	Memory findOne(int id);
	void delete(int id);
}
