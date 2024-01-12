package com.snai3i.demo.exceptions;
public class WorkerNotFoundException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WorkerNotFoundException(Long id) {
        super("Could not find worker " + id);
    }
}
