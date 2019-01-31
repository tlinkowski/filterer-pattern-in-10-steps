import java.util.function.Predicate;

@FunctionalInterface
interface Filterer<T, I> {
  T by(Predicate<? super I> predicate);
}
