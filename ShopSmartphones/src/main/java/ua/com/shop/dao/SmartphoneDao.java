package ua.com.shop.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.shop.entity.Smartphone;

public interface SmartphoneDao extends JpaRepository<Smartphone, Integer> {


}
