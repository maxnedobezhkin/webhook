package com.project.webhook.service;

import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.project.webhook.entity.IncomeOrder;
import com.project.webhook.entity.Order;
import com.project.webhook.entity.Product;

@Service
public class OrderService {
	
	public static final String COL_NAME="orders";
	
	public String savePatientDetails(Order order) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COL_NAME).document(order.getId().toString()).set(order);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
}
