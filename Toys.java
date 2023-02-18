
    public class Toys extends Product {
        private TypeToy Soft;

        public Toys(String name, double cost, TypeToy typeToy) {
            super(name, cost);
            this.Soft = typeToy;
        }

        @Override
        public String toString() {
            StringBuilder localString = new StringBuilder(super.toString());
            localString.append(String.format(" мягкость %s", Soft));
            return localString.toString();
        }
    }

