package com.mohan.banking_app.entity;

public record TransferFundDto( Long fromAccountId,
                               Long toAccountId,
                               double amount) {
}
