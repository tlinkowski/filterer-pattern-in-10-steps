interface IssueDetector {
  // e.g. text: "You migth know it.", probabilityThreshold: 0.75
  ProbabilisticIssueWiseText<?> detect(String text, double probabilityThreshold);
}
