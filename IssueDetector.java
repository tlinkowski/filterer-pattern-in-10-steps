interface IssueDetector {
  // e.g. text: "You migth know it.", probabilityThreshold: 0.75
  IssueWiseText<ProbableIssue> detect(String text, double probabilityThreshold);
}
