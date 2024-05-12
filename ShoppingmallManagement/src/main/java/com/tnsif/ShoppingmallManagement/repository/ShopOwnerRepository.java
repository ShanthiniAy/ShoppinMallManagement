package com.tnsif.ShoppingmallManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.ShoppingmallManagement.*;
import com.tnsif.ShoppingmallManagement.entity.ShopOwner;



public interface ShopOwnerRepository  extends JpaRepository<ShopOwner, Integer> {
	
}


