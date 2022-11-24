package com.myapp.spring;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class NumberPublisher implements Publisher<Integer> {

	@Override
	public void subscribe(Subscriber<? super Integer> subscriber) {
		// TODO Auto-generated method stub
		
		int count =0, a=0,b=1;
		
		while(count < 50) {
			int sum = a+b;
			subscriber.onNext(b);
			a=b;
			b= sum;
			count++;
		}
		subscriber.onComplete();

	}

}



// Flux emitting 3 events

// Value 
// Completion
// Error