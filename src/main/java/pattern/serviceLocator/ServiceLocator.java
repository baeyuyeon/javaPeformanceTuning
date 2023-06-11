package pattern.serviceLocator;

public class ServiceLocator {

    private static Cache cache = new Cache();

    public static MessagingService getService(String serviceName) {
        MessagingService service = cache.getService();
    }

}
