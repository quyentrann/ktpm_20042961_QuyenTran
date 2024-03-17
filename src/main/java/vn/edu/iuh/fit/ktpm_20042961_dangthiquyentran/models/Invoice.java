package vn.edu.iuh.fit.ktpm_20042961_dangthiquyentran.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "invoice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate createDate;
    @OneToMany(mappedBy = "invoice")
    private List<OrderDetail> orderDetailList;
}
