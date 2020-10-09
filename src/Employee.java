
    public abstract class Employee extends Person {

        protected String department;
        public Employee(String name, String department) {
            super(name);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public abstract String work();
    }

