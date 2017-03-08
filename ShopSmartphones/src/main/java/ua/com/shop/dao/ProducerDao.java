package ua.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.com.shop.entity.Producer;

public interface ProducerDao extends JpaRepository<Producer, Integer>, JpaSpecificationExecutor<Producer>{

	Producer findByNameOfBrand(String nameOfBrand);

}
