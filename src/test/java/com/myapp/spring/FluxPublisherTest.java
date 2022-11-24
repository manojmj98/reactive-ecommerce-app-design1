package com.myapp.spring;

import static org.testng.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import reactor.core.publisher.Flux;

public class FluxPublisherTest {
	
	@Test
	void testPublisher() {
	Flux<Double> publisher =	new FluxPublisher().generateNumber(10);
	
	publisher.doOnNext(t -> System.out.println(t))
	.last().subscribe(t -> assertEquals(3628800.0, t,0.0));
		
	}

}
