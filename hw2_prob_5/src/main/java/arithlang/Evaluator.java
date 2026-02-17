package arithlang;

import java.util.List;
import arithlang.Value.*;
import static arithlang.AST.*;

public class Evaluator implements Visitor<Value> {

    final String[][] addLookUpTable = {
        {"p", "u", "p", "u"}, // p + (p, n, z, u)
        {"u", "n", "n", "u"}, // n + (p, n, z, u)
        {"p", "n", "z", "u"}, // z + (p, n, z, u)
        {"u", "u", "u", "u"}  // u + (p, n, z, u)
    };

    final String[][] multLookUpTable = {
        {"p", "n", "z", "u"}, // p * (p, n, z, u)
        {"n", "p", "z", "u"}, // n * (p, n, z, u)
        {"z", "z", "z", "z"}, // z * (p, n, z, u)
        {"u", "u", "z", "u"}  // u * (p, n, z, u)
    };

    private int getIndex(String s) {
        return switch (s) {
            case "p" -> 0;
            case "n" -> 1;
            case "z" -> 2;
            default  -> 3;
        };
    }

    // Helper to turn index back into AbstractType enum
    private AbstractType fromString(String s) {
        return switch (s) {
            case "p" -> AbstractType.PositiveVal;
            case "n" -> AbstractType.NegativeVal;
            case "z" -> AbstractType.ZeroVal;
            default  -> AbstractType.UnknownVal;
        };
    }

    Value valueOf(Program p) {
        return (Value) p.accept(this);
    }

    @Override
    public Value visit(SymbolExp e) {
        return new AbstractVal(fromString(e.v()));
    }

    @Override
    public Value visit(AddExp e) {
        List<Exp> operands = e.all();
        AbstractVal current = (AbstractVal) operands.get(0).accept(this);
        
        for (int i = 1; i < 2; i++) {
            AbstractVal next = (AbstractVal) operands.get(i).accept(this);
            int row = getIndex(current.toString());
            int col = getIndex(next.toString());
            current = new AbstractVal(fromString(addLookUpTable[row][col]));
        }
        return current;
    }

    @Override
    public Value visit(MultExp e) {
        List<Exp> operands = e.all();
        AbstractVal current = (AbstractVal) operands.get(0).accept(this);
        
        for (int i = 1; i < 2; i++) {
            AbstractVal next = (AbstractVal) operands.get(i).accept(this);
            int row = getIndex(current.toString());
            int col = getIndex(next.toString());
            current = new AbstractVal(fromString(multLookUpTable[row][col]));
        }
        return current;
    }

    @Override
    public Value visit(Program p) {
        return (Value) p.e().accept(this);
    }
}
