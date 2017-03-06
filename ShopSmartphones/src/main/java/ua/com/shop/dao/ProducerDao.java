package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.shop.entity.Producer;

public interface ProducerDao extends JpaRepository<Producer, Integer>{

	Producer findByNameOfBrand(String nameOfBrand);
}
