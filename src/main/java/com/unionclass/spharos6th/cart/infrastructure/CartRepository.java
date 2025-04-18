package com.unionclass.spharos6th.cart.infrastructure;

import com.unionclass.spharos6th.cart.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart, Long> {

    Optional<Cart> findByCartUuid(String cartUuid);
    List<Cart> findByUserUuid(String userUuid);

}
