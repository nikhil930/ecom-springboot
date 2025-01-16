package com.ecommerce.project.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "cart_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long cartItemId;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private List<Product> products;
	
	private Integer quantity;
	private double discount;
	private double productPrice;
}
