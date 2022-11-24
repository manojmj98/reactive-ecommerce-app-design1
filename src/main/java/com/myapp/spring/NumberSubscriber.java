package com.myapp.spring;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class NumberSubscriber implements Subscriber<Integer> {

	private Subscription subscription;
	@Override
	public void onSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
		this.subscription = subscription;
		this.subscription.request(10);
	}

	@Override
	public void onNext(Integer number) {
		// TODO Auto-generated method stub
		System.out.println("Number Recieved "+number);
		subscription.cancel();

	}

	@Override
	public void onError(Throwable t) {
		t.printStackTrace();
		subscription=null;

	}

	@Override
	public void onComplete() {
		System.out.println("Completed");
		subscription=null;

	}

}
