package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.ids.OrderDetailID;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.Invoice;
import vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailID> {
}