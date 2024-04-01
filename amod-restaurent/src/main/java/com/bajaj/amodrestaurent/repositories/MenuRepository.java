package com.bajaj.amodrestaurent.repositories;

import com.bajaj.amodrestaurent.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Long> {
}
