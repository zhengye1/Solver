package solver.util;

@FunctionalInterface
public interface HexaPredicate<T, U, V, X, Y, Z> {
	public boolean test(T t, U u, V v, X x, Y y, Z z);
}
