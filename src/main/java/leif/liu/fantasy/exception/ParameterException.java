package leif.liu.fantasy.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.util.CollectionUtils;

public class ParameterException extends Exception {
    private static final long serialVersionUID = 1L;
    Map<String, String> parameterExceptionMap = new HashMap<String, String>();

    public Map<String, String> getParameterExceptionMap() {
        return parameterExceptionMap;
    }

    public void addToParameterExceptionMap(String key, String value) {
        parameterExceptionMap.put(key, value);
    }

    public boolean hasParameterException() {
        return !CollectionUtils.isEmpty(parameterExceptionMap);
    }
}
