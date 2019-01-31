interface IssueDetector {
  // e.g. text: "You migth know it.", probabilityThreshold: 0.75
  IssueDetectionResult detect(String text, double probabilityThreshold);
}
