package leif.liu.fantasy.exception;

public class ServiceException extends Exception {
    private static final long serialVersionUID = 1L;
    private String serviceExceptionMessage;

    public ServiceException(String serviceExceptionMessage) {
        this.serviceExceptionMessage = serviceExceptionMessage;
    }

    public String getServiceExceptionMessage() {
        return serviceExceptionMessage;
    }

    public void setServiceExceptionMessage(String serviceExceptionMessage) {
        this.serviceExceptionMessage = serviceExceptionMessage;
    }
}
