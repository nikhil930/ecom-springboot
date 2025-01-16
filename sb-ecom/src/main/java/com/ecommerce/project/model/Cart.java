package com.ecommerce.project.model;

import java.util.*;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name =  "carts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cartId;
	
	@OneToMany(mappedBy = "cart" , cascade = {CascadeType.PERSIST , CascadeType.REMOVE})
	private List<CartItem> cartItems;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
}
