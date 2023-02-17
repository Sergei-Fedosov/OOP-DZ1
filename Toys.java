
    public class Toys extends Product {
        private Toys Soft = new Soft();

        public Toys(String name, double cost, Toys Soft) {
            super(name, cost);
            this.Soft = Soft;
        }

        @Override
        public String toString() {
            StringBuilder localString = new StringBuilder(super.toString());
            localString.append(String.format(" мягкость %s", Soft.toString()));
            return localString.toString();
        }
    }

