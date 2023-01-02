package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findFirstByOrderByIdDesc();     // Id가 가장 나중에 만들어진것을 우선으로 가져온다.

    Integer countByAccountUser(AccountUser accountUser);

    Optional<Account> findByAccountNumber(String accountNumber);

    List<Account> findByAccountUser(AccountUser accountUser);
}
