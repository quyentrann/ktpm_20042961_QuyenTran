package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}