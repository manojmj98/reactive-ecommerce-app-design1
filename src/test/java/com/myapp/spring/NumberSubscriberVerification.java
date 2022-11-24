package com.myapp.spring;

import org.reactivestreams.Subscriber;
import org.reactivestreams.tck.SubscriberBlackboxVerification;
import org.reactivestreams.tck.TestEnvironment;

public class NumberSubscriberVerification extends SubscriberBlackboxVerification<Integer>{

	protected NumberSubscriberVerification() {
		super(new TestEnvironment());
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Subscriber<Integer> createSubscriber() {
		// TODO Auto-generated method stub
		return new NumberSubscriber();
	}

	
	@Override
	public Integer createElement(int element) {
		// TODO Auto-generated method stub
		return Integer.valueOf(element);
	}
	
	
	

}
