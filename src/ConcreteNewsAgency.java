import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcreteNewsAgency implements NewsAgency {
    private Map<Subscriber, List<String>> subscriberCategories = new HashMap<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscriberCategories.put(subscriber, new ArrayList<>());
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberCategories.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String category, String headline, String content) {
        for (Map.Entry<Subscriber, List<String>> entry : subscriberCategories.entrySet()) {
            Subscriber subscriber = entry.getKey();
            List<String> categories = entry.getValue();

            if (categories.contains(category)) {
                subscriber.update(category, headline, content);
            }
        }
    }

    public void publishNews(String category, String headline, String content) {
        System.out.println("News Published in " + category + ": " + headline);
        notifySubscribers(category, headline, content);
    }

    public void subscribeToCategory(Subscriber subscriber, String category) {
        List<String> categories = subscriberCategories.get(subscriber);
        if (!categories.contains(category)) {
            categories.add(category);
        }
    }
    
    public void unsubscribeFromCategory(Subscriber subscriber, String category) {
        List<String> categories = subscriberCategories.get(subscriber);
        categories.remove(category);
    }
}
