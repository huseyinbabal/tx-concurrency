package com.example.txconcurrency.repository;

import java.util.Optional;

import com.example.txconcurrency.entity.Invoice;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {

    Optional<Invoice> findInvoiceByUuid(String uuid);
}
