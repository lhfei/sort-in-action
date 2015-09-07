/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.lhfei.sort.quicksort;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @version 1.0.0
 *
 * @author Hefei Li
 *
 * @since Sep 5, 2015
 */
public class QuickSortApp {
	private static final Logger log = LoggerFactory.getLogger(QuickSortApp.class);
	
	private static int[] a = {59, 39, 72, 99, 32, 81, 40, 48, 60, 72};
	
	@Test
	public void doSort() {
		int a = 0;
		int b = a - 2;
		
		log.info("a = {}, b = {}", a, b);
	}

	public void quicksort() {
		
	}
	
	public void partition(int left, int right, int pivot) {
		
	}
	

}
