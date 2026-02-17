package arithlang;

import java.util.ArrayList;
import java.util.List;

/**
 * This class hierarchy represents expressions in the abstract syntax tree
 * manipulated by this interpreter.
 *
 * @author hridesh
 */
@SuppressWarnings("rawtypes")
public interface AST {
    interface Visitor<T> {
        // This interface should contain a signature for each concrete AST node.
        T visit(SymbolExp e);

        T visit(AST.AddExp e);

        T visit(AST.MultExp e);

        T visit(AST.Program p);
    }

    abstract class ASTNode {
        public abstract Object accept(Visitor visitor);
    }

    class Program extends ASTNode {
        final Exp _e;

        public Program(Exp e) {
            _e = e;
        }

        public Exp e() {
            return _e;
        }

        public Object accept(Visitor visitor) {
            return visitor.visit(this);
        }
    }

    abstract class Exp extends ASTNode {

    }

    class SymbolExp extends Exp {
        final String _val;

        public SymbolExp(String v) {
            _val = v;
        }

        public String v() {
            return _val;
        }

        public Object accept(Visitor visitor) {
            return visitor.visit(this);
        }
    }

    abstract class CompoundArithExp extends Exp {
        final List<Exp> _rep;

        public CompoundArithExp(List<Exp> args) {
            _rep = new ArrayList<>();
            _rep.addAll(args);
        }

        public List<Exp> all() {
            return _rep;
        }
    }

    class AddExp extends CompoundArithExp {
        public AddExp(List<Exp> args) {
            super(args);
        }

        public Object accept(Visitor visitor) {
            return visitor.visit(this);
        }
    }

    class MultExp extends CompoundArithExp {
        public MultExp(List<Exp> args) {
            super(args);
        }

        public Object accept(Visitor visitor) {
            return visitor.visit(this);
        }
    }
}
