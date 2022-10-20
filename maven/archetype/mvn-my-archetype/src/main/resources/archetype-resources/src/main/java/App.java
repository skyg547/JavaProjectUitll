package $package;

/**
 * Hello world!
 *
 */
public class App {
    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-persistance");

    public void createEntities() {
        EntityManager manager = factory.createEntityManager();

        try {
            manager.getTransaction().begin();
            manager.persist(new SampleEntity("ho", "mail", 123));
            manager.persist(new SampleEntity("ho1", "mail3", 4));
            manager.persist(new SampleEntity("ho2", "mail4", 5));
            manager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            manager.close();
        }

    }

    public void printEntities() {
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("select i from SampleEntity i");
        List<SampleEntity> list = query.getResultList();

        System.out.println("get " + list.size() + "SampleEntity");
        for (SampleEntity sampleEntity : list) {
            System.out.println(sampleEntity);
        }

    }

    public String getMessage(String name) {
        return "Hi " + name + ". Welcome to Maven World!";
    }

    public void printMessage(String name) {
        System.out.println("\n **** app class ****");
        System.out.println(this.getMessage(name));
        System.out.println("\n **** app class ****");

    }

    public static void main(String[] args) {
        App app = new App();
        app.createEntities();

        System.out.println("App start!");
        app.printEntities();
    }
}
