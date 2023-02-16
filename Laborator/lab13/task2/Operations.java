package lab13.task2;

import java.util.Collection;

public class Operations implements Calculator{
    @Override
    public Double add(Double a, Double b) throws NullParameterException, UnderflowException, OverflowException {

        if (a == null  || b == null)
            throw new NullParameterException();

        if (a + b == Double.POSITIVE_INFINITY)
            throw new OverflowException();

        if (a + b == Double.NEGATIVE_INFINITY)
            throw new UnderflowException();

        return a + b;
    }

    @Override
    public Double divide(Double a, Double b) throws NullParameterException, UnderflowException, OverflowException {

        if (a == null  || b == null)
            throw new NullParameterException();

        if (a + b == Double.POSITIVE_INFINITY)
            throw new OverflowException();

        if (a + b == Double.NEGATIVE_INFINITY)
            throw new UnderflowException();

        return a / b;
    }

    @Override
    public Double average(Collection<Double> numbers) throws NullParameterException, UnderflowException, OverflowException {
        Double avg, sum = 0.0;

        if (numbers == null)
            throw new NullParameterException();

        for(Double i : numbers) {
            sum = add(sum, i);
        }
        avg = divide(sum, (double) numbers.size());
        return avg;
    }
}
