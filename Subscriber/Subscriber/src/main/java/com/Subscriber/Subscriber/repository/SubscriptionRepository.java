package com.Subscriber.Subscriber.repository;

import com.Subscriber.Subscriber.model.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
    void deleteSubscriptionById(Long id);

    Optional<Subscription> findSubscriptionById(Long id);
}
