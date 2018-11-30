package solver.exception;

public class NoSolutionException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1129773738974805838L;

    public NoSolutionException(String errorMessage) {
        super(errorMessage);
    }

    public NoSolutionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
