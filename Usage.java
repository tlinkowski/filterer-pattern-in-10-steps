import java.util.stream.Stream;

class Usage {
  static double issueCoverage(Stream<? extends IssueWiseText<?>> textStream) {
    return textStream.collect(IssueCoverage.collector(issue -> true));
  }

  static double issueCoverage(Stream<? extends IssueWiseText<?>> textStream, IssueType issueType) {
    return textStream.collect(IssueCoverage.collector(issue -> issue.type() == issueType));
  }

  static Stream<IssueWiseText<Issue>> testCaseStream() {
    return Stream.of();
  }
}
