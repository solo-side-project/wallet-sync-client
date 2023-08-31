package com.example.walletsyncclient.wallet.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "client_wallet")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ClientWallet {

    @Builder
    ClientWallet(BigDecimal balances) {
        this.balances = balances;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long id;

    @Column(nullable = false)
    private BigDecimal balances;
}
