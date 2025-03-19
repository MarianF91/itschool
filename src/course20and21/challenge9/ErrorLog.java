package course20and21.challenge9;

import java.util.ArrayList;
import java.util.List;

public class ErrorLog {
    private int errorCode;
    private String errorMessage;
    private final String variableName;
    private final int variableValue;

    private static final List<Integer> validValues = new ArrayList<>();
    private static final List<String> validNames = new ArrayList<>();

    static {
        validValues.add(1);
        validValues.add(2);
        validValues.add(3);
        validValues.add(4);

        validNames.add("Jesus");
        validNames.add("Moses");
        validNames.add("Gandhi");
        validNames.add("Buddha");
    }

    public ErrorLog(String variableName, int variableValue) {
        this.variableName = variableName;
        this.variableValue = variableValue;
        validation();
    }

    private void validation() {
        errorMessage = "";
        errorCode = 0;
        boolean hasValueError = false;
        boolean hasNameError = false;

        if (!validValues.contains(variableValue)) {
            errorMessage += "Variable " + variableValue + " out of bounds. ";
            errorCode = 1;
            hasValueError = true;
        }

        if (!validNames.contains(variableName)) {
            errorMessage += "Name " + variableName + " does not exist.";
            errorCode = hasValueError ? 3 : 2;
            hasNameError = true;
        }

        if (!hasValueError && !hasNameError) {
            errorMessage = "No error : name " + variableName + " and value " + variableValue + " are within limits.";
        }
    }

    @Override
    public String toString() {

        return "\nErrorLog: " +
                "\nError Code = " + errorCode +
                "\nError Message = " + errorMessage;
    }
}
