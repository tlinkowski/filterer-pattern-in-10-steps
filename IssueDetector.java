import java.util.List;

interface IssueDetector {
  // e.g. text: "You migth know it.", probabilityThreshold: 0.75
  List<ProbableIssue> detect(String text, double probabilityThreshold);
}
