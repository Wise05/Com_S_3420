package arithlang;

public interface Value {
    String toString();

    enum AbstractType {
        PositiveVal("p"), 
        NegativeVal("n"), 
        ZeroVal("z"), 
        UnknownVal("u");

        private final String name;
        AbstractType(String s) { name = s; }
        public String toString() { return name; }
    }

    class AbstractVal implements Value {
        private final AbstractType _val;

        public AbstractVal(AbstractType v) {
            _val = v;
        }

        public AbstractType v() {
            return _val;
        }

        public String toString() {
            return _val.toString();
        }
    }

    class DynamicError implements Value {
        private final String _errorMsg;
        public DynamicError(String v) { _errorMsg = v; }
        public String v() { return _errorMsg; }
        public String toString() { return _errorMsg; }
    }
}
