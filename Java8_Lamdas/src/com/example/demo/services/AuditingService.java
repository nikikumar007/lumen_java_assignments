package com.example.demo.services;

public class AuditingService implements Calculate<Double, Double>, Compute<Long, Long> {

	@Override
	public Long compute(Long value) {
		// TODO Auto-generated method stub
		return value*10;
	}

	@Override
	public Double apply(Double t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double offer() {
		// TODO Auto-generated method stub
		return Calculate.super.offer()+Compute.super.offer();
	}

}
