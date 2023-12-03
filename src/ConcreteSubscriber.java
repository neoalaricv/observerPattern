public class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String category, String headline, String content) {
        System.out.println(name + " received news in category " + category + ": " + headline);
        System.out.println("Content: " + content);
    }
}
