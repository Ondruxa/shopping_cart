package ru.skypro.shoping.cart.service.impl;

import ru.skypro.shoping.cart.service.StoreService;

import java.util.List;
import java.util.Set;

public class StoreServiceImpl implements StoreService {

    private final ShoppingCart shoppingCart;

    public StoreServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public Set<Integer> add(List<Integer> goods) {
        return shoppingCart.add(goods);
    }

    @Override
    public Set<Integer> get() {
        return shoppingCart.get();
    }
}
