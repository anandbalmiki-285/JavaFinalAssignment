package in.ineuron.exception;

public class ProductNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFound(String message) {
		super(message);
	}

}
