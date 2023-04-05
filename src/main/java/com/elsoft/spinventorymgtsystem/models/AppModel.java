package com.elsoft.spinventorymgtsystem.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class AppModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_model_seq")
    @SequenceGenerator(name = "app_model_seq")
    @Column(name = "id", nullable = false)
    private Long id;

    @CreatedDate
    private LocalDateTime createdAt;

    @CreatedBy
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff createdBy;

    @LastModifiedBy
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff updatedBy;
    @LastModifiedDate
    private LocalDateTime updatedAt;



}