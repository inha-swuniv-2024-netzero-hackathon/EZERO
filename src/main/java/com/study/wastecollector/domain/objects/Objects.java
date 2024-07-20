package com.study.wastecollector.domain.objects;

import com.study.wastecollector.domain.apartment.Apartment;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "objects")
public class Objects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long objectsId;

    @Column
    private String name = "";

    @Column
    private Long count = 0L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Apartment apartment;

    public Objects(String name, Apartment apartment) {
        this.name = name;
        this.apartment = apartment;
    }

    public void addCount(Long num) {
        count += num;
    }

    public void resetCount() {
        count = 0L;
    }
}