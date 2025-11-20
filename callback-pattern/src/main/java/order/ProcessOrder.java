package order;

import java.util.Optional;

public interface ProcessOrder {

    default void executeWith(NotificationOrder notificationOrder){
        execute();
        Optional.ofNullable(notificationOrder).ifPresent(NotificationOrder::notifyStatus);
    }
    void execute();
}
