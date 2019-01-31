import java.util.List;

interface IssueWiseText {
  String text(); // e.g. "You migth know it."

  List<Issue> issues(); // e.g. ["migth"]
}
