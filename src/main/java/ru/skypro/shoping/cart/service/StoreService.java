package ru.skypro.shoping.cart.service;

import java.util.List;
import java.util.Set;

public interface StoreService {
    Set<Integer> add(List<Integer> goods);

    Set<Integer> get();
}
