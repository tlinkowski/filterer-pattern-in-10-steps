import java.util.List;

interface IssueDetector {
  // e.g. text: "You migth know it."
  List<Issue> detect(String text);
}
