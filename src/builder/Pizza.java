package builder;

public class Pizza {

    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;

    public static class Builder {

        // requerido
        private final int tamanho;

        // opcional
        private boolean queijo = false;
        private boolean tomate = false;
        private boolean bacon = false;

        public Builder(int tamanho) {
            this.tamanho = tamanho;
        }

        public Builder queijo() {
            queijo = true;
            return this;
        }

        public Builder tomate() {
            tomate = true;
            return this;
        }

        public Builder bacon() {
            bacon = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

    private Pizza(Builder builder) {
        tamanho = builder.tamanho;
        queijo = builder.queijo;
        tomate = builder.tomate;
        bacon = builder.bacon;
    }

}

