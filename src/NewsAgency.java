import java.util.List;

public interface NewsAgency {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String category, String headline, String content);
}
