package net.htlgrieskirchen.pos2.kaltseisSebastian;

import com.sun.source.tree.ReturnTree;

public class RelationalCalulator extends AbstractCalculator{


    public RelationalCalulator() {
        super((x,y) -> {
            return new Number(x.getA()*y.getB()+(y.getA()*x.getB()), x.getB()*y.getB());
        }, (x,y) -> {
            return new Number(x.getA()*y.getB()-(y.getA()*x.getB()), x.getB()*y.getB());
        }, (x,y) -> {
            return new Number(x.getA()*y.getA(), x.getB()*y.getB());
        }, (x,y) -> new Number(x.getA()*y.getB(), x.getB()*x.getA()));
    }

    @Override
    public Number add(Number x, Number y) {
        return add.calc(x,y);
    }

    @Override
    public Number subtract(Number x, Number y) {
        return subtract.calc(x,y);
    }

    @Override
    public Number multiply(Number x, Number y) {
        return multiply.calc(x,y);
    }

    @Override
    public Number divide(Number x, Number y) {
        return divide.calc(x,y);
    }
}
