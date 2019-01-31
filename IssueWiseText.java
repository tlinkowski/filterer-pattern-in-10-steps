import java.util.List;
import java.util.function.Predicate;

interface IssueWiseText {
  String text(); // e.g. "You migth know it."

  List<? extends Issue> issues(); // e.g. ["migth"]

  IssueWiseText filtered(Predicate<? super Issue> issueFilter);
}
