package com.Subscriber.Subscriber.service;

import com.Subscriber.Subscriber.exception.SubscriptionNotFoundException;
import com.Subscriber.Subscriber.model.Subscription;
import com.Subscriber.Subscriber.repository.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class SubscriptionService {
    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionService(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    public List<Subscription> findAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    public Subscription findSubscriptionById(Long id) {
        return subscriptionRepository.findSubscriptionById(id)
            .orElseThrow(() -> new SubscriptionNotFoundException("Could not find:" + id));
    }

    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteSubscriptionById(id);
    }

}
