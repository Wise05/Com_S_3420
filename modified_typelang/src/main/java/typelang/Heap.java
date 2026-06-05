package typelang;

/**
 * Representation of a heap, which maps references to values.
 *
 * @author hridesh
 */
public interface Heap {

    Value ref(Value value);

    Value deref(Value.RefVal loc);

    Value setref(Value.RefVal loc, Value value);

    Value free(Value.RefVal value);

    class Heap16Bit implements Heap {
        static final int HEAP_SIZE = 65_536;

        Value[] _rep = new Value[HEAP_SIZE];

        public Value ref(Value value) {
            for (int i = 0; i < HEAP_SIZE; i++) {
              if (_rep[i] == null) {
                _rep[i] = value;
                return new Value.RefVal(i);
              }
            }
            return new Value.DynamicError("Out of memory error");
        }

        public Value deref(Value.RefVal loc) {
            try {
                if (_rep[loc.loc()] == null) return new Value.DynamicError("Null pointer at " + loc);
                return _rep[loc.loc()];
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Value.DynamicError("Segmentation fault at access " + loc);
            }
        }

        public Value setref(Value.RefVal loc, Value value) {
            try {
                if (_rep[loc.loc()] == null) return new Value.DynamicError("Null pointer at " + loc);
                return _rep[loc.loc()] = value;
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Value.DynamicError("Segmentation fault at access " + loc);
            }
        }

        public Value free(Value.RefVal loc) {
            try {
                _rep[loc.loc()] = null;
                return loc;
            } catch (ArrayIndexOutOfBoundsException e) {
                return new Value.DynamicError("Segmentation fault at access " + loc);
            }
        }

        public Heap16Bit() {
        }
    }

}
