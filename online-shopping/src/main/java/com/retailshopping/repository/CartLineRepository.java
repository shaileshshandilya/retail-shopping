package com.retailshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retailshopping.model.CartLine;

import java.util.List;

@Repository("cartLineRepository")
public interface CartLineRepository extends JpaRepository<CartLine, Integer> {

    List<CartLine> findCartLineByCartId(int cartId);

    CartLine findCartLineByCartIdAndProductId(int cartId, int id);

}
