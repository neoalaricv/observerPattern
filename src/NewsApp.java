public class NewsApp {
    public static void main(String[] args) {
        ConcreteNewsAgency newsAgency = new ConcreteNewsAgency();

        ConcreteSubscriber subscriber1 = new ConcreteSubscriber("Neo");
        ConcreteSubscriber subscriber2 = new ConcreteSubscriber("Alaric");

        newsAgency.addSubscriber(subscriber1);
        newsAgency.addSubscriber(subscriber2);

        newsAgency.subscribeToCategory(subscriber1, "Sports");
        newsAgency.subscribeToCategory(subscriber1, "Politics");

        newsAgency.subscribeToCategory(subscriber2, "Politics");
        newsAgency.subscribeToCategory(subscriber2, "Entertainment");

        newsAgency.publishNews("Sports", "Football Match Result", "FC Barcelona wins!");
        newsAgency.publishNews("Politics", "Election Update", "Results are out!");
        newsAgency.publishNews("Entertainment", "Movie Premiere", "Space Jam");
    }
}
