/**
 * Copyright (c) Stefan Münchow. All rights reserved.
 * 
 * The use and distribution terms for this software are covered by the
 * Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
 * which can be found in the file epl-v10.html at the root of this distribution.
 * By using this software in any fashion, you are agreeing to be bound by
 * the terms of this license.
 * You must not remove this notice, or any other, from this software.
 **/

package com.stefanmuenchow.arithmetic.operation;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Minimum implements BinaryOperation {
	
	@Override
	public Integer apply(Integer a, Integer b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	@Override
	public Long apply(Long a, Long b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	@Override
	public Short apply(Short a, Short b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	@Override
	public Byte apply(Byte a, Byte b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	@Override
	public Double apply(Double a, Double b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	@Override
	public Float apply(Float a, Float b) {
		return a.compareTo(b) < 0 ? a : b;
	}

	@Override
	public BigInteger apply(BigInteger a, BigInteger b) {
		return a.min(b);
	}

	@Override
	public BigDecimal apply(BigDecimal a, BigDecimal b) {
		return a.min(b);
	}
}