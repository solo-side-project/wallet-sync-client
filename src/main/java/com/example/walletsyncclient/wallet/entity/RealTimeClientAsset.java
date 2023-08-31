package com.example.walletsyncclient.wallet.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "wallet_queues")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RealTimeClientAsset {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "wallet_id")
    private ClientWallet clientWallet;

    @Column(name = "balances")
    private BigDecimal balances;

    @CreatedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXX")
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXX")
    @Column(nullable = false)
    private LocalDateTime updatedAt = LocalDateTime.now();
}
