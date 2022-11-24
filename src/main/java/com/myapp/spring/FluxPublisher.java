package com.myapp.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.util.function.Tuples;

@RestController
public class FluxPublisher {
	
	@GetMapping("/generate/{number}")
	Flux<Double> generateNumber(@PathVariable("number") double number){
		return Flux.generate(()->Tuples.<Long,Double>of(0L,1.0d),
				(state,sink) ->{
				
					Long key = state.getT1();
					Double value = state.getT2();
					if(key <=number) {
						sink.next(value);
					}
					else
						sink.complete();
					return Tuples.of(key+1, (key+1)*value);
					
				}
				);
	}

}
