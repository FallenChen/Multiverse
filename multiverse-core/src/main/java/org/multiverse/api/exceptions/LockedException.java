package org.multiverse.api.exceptions;

/**
 * An {@link AtomicOperationException} thrown when an atomic operation was executed on a
 * {@link org.multiverse.api.TxnObject} while it was locked. E.g. when an atomicGet was done on a TxnRef
 * that already has an exclusive lock or that a TxnRef.atomicSet while a readlock already was acquired.
 *
 * @author Peter Veentjer.
 */
public class LockedException extends AtomicOperationException {

    private static final long serialVersionUID = 0;

    /**
     * Creates a new LockedException.
     */
    public LockedException() {
    }

    /**
     * Creates a new LockedException
     *
     * @param message the message
     */
    public LockedException(String message) {
        super(message);
    }

    /**
     * Creates a new LockedException.
     *
     * @param message the message
     * @param cause the cause
     */
    public LockedException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new LockedException
     *
     * @param cause the cause
     */
    public LockedException(Throwable cause) {
        super(cause);
    }
}
