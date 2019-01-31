import java.util.List;

interface IssueWiseText<I extends Issue> {
  String text(); // e.g. "You migth know it."

  List<I> issues(); // e.g. ["migth"]
}
