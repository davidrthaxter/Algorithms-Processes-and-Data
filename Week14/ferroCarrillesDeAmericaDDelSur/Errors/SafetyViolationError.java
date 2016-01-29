package Errors;
public class SafetyViolationError extends RailwaySystemError {
	public SafetyViolationError(String message) {
		super("[Safety violation error] " + message);
	}
}
