import java.util.stream.Stream;

class Usage {
  static double issueCoverage(Stream<? extends IssueWiseText> textStream) {
    return textStream.collect(IssueCoverage.collector());
  }

  static double issueCoverage(Stream<? extends IssueWiseText> textStream, IssueType issueType) {
    return textStream
            .map(text -> text.filtered(issue -> issue.type() == issueType))
            .collect(IssueCoverage.collector());
  }

  static double issueCoverage(Stream<? extends ProbabilisticIssueWiseText> textStream, double minProbability) {
    return textStream
            .map(text -> text.filteredProbabilistic(issue -> issue.probability() >= minProbability))
            .collect(IssueCoverage.collector());
  }

  static Stream<IssueWiseText> testCaseStream() {
    return Stream.of();
  }
}
