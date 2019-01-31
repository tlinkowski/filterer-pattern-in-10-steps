import java.util.List;
import java.util.function.Predicate;

interface IssueWiseText<I extends Issue> {
  String text(); // e.g. "You migth know it."

  List<I> issues(); // e.g. ["migth"]

  IssueWiseText<I> filtered(Predicate<? super I> issueFilter);
}
