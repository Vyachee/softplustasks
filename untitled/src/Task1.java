public class Task1 {
    public static void main(String[] args) {
        User tester = new User(7, new Vacancy("Developer"));
        System.out.println(tester.getId());
        System.out.println(tester.getVacancy().getTitle());
    }

    static class User {
        private long id;
        private Vacancy vacancy;

        public User(long id, Vacancy vacancy) {
            this.id = id;
            this.vacancy = vacancy;
        }

        public long getId() {
            return id;
        }

        public Vacancy getVacancy() {
            return vacancy;
        }
    }

    static class Vacancy {
        private String title;

        public Vacancy(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}
